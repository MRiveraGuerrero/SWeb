package com.example.prueba;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HolaMundoHTMLdispatched extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("‐‐‐> Entering HolaMundoHTMLDispatched servlet GET");
        //Copiamos la info del html y la pegamos
        //response.setContentType("text/html");
        //Redireccionamos al HTML
        response.sendRedirect("http://localhost:8080/prueba_war_exploded/html/pagina.html");
        //System.out.println("\tRedirecting to HTML document");
                //RequestDispatcher rd = request.getRequestDispatcher("/html/pagina.html");
        //rd.forward(request, response);
        //System.out.println("<‐‐‐ Exiting HolaMundoHTMLDispatched servlet GET");
    }
}
