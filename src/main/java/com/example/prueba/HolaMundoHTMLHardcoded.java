package com.example.prueba;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class HolaMundoHTMLHardcoded extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("‐‐‐> Entering HolaMundoHTMLHardcoded servlet GET");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola Mundo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola Mundo</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        System.out.println("<‐‐‐ Exiting HolaMundoHTMLHardcoded servlet GET");
    }
}
