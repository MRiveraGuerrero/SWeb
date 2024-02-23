package com.example.prueba;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class holaMundoCabeceras extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	System.out.println("---> Entrando en servlet HolaMundoCabeceras"); ;
    	response.setContentType("text/plain; charset=utf-8");
    	
   		PrintWriter http_out = response.getWriter();
   		
		http_out.println("Cabeceras petici�n HTTP:");
		System.out.println("     Cabeceras petici�n HTTP:");
	 	Enumeration<String> headerNames = request.getHeaderNames();
	 	while (headerNames.hasMoreElements()) {
	 		String headerName = (String) headerNames.nextElement();
	 		String headerNameValue = headerName + ": " + request.getHeader(headerName);
	 		http_out.println("     " + headerNameValue);
	 		System.out.println("          " + headerNameValue);
    	}
    	
	 	System.out.println("---> Saliendo de servlet HolaMundoCabeceras");;
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("‐‐‐> Entering HolaMundoGetPost servlet GET");
		String nombre = request.getParameter("nombre");
		PrintWriter out = response.getWriter();
		try {
			out.println("Hola, " + nombre);
			out.println("Has pasado tu nombre con POST en el cuerpo de la petición");
		} finally {
			out.close();
		}
		System.out.println("<‐‐‐ Exiting HolaMundoGetPost servlet GET");
	}
}
