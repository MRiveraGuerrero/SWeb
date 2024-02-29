package com.example.prueba;
import java.io.*; import javax.servlet.*;import javax.servlet.http.*;
public class holaMundoGetPost extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("‐‐‐> Entering HolaMundoGetPost servlet GET");
        String nombre = request.getParameter("nombre");
        PrintWriter out = response.getWriter();
        try {
            out.println("Hola, " + nombre);
            out.println("Has pasado tu nombre con GET en la URI.");
        } finally {
            out.close();
        }
        System.out.println("<‐‐‐ Exiting HolaMundoGetPost servlet GET");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
