package com.example.prueba;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class HolaMundoCache extends HttpServlet {

	private SimpleDateFormat formato_date;
	private long lastModified;

	public void init(ServletConfig config) {
		System.out.println("--->init()");

		formato_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formato_date.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));

		long now = System.currentTimeMillis();
		lastModified = now - (now % 1000); // de milisegundos a segundos
		System.out.println(" ---> Last-Modified: " + formato_date.format(lastModified));

		System.out.println("<--- init()");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---> doGet()");
		long ifModifiedSince = request.getDateHeader("If-Modified-Since");
		System.out.println("     If-Modified-Since: " + formato_date.format(lastModified));
		
		if (ifModifiedSince >= lastModified) {
			System.out.println("     NO SE HA MODIFICADO");
			System.out.println("     Status: 304");
			PrintWriter http_out = response.getWriter();
			http_out.println("NO SE HA MODIFICADO");
			response.setStatus(304);
		} else {
			System.out.println("     SE HA MODIFICADO");
			System.out.println("     Status: 200");
			response.setDateHeader("Last-Modified", lastModified);
			response.addHeader("Cache-Control", "max-age=15");
			response.setContentType("text/plain; charset=utf-8");
			PrintWriter http_out = response.getWriter();
			http_out.println("SE HA MODIFICADO");
			http_out.println("Last-Modified: " + formato_date.format(lastModified));
			http_out.println("If-Modified-Since: " + formato_date.format(ifModifiedSince));
			response.setStatus(200);
		}

		System.out.println("<--- doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}