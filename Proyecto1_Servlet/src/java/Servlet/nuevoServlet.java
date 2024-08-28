/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maricela Velasco
 */
public class nuevoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String msg)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet nuevoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Recibe Datos " + msg+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsuario = request.getParameter("nombreCompleto");
        String correoUsuario = request.getParameter("email");
        String proyecto = request.getParameter("proyecto");
        String ciudadUsuario = request.getParameter("ciudad");
        String contrasena = request.getParameter("password");
        
        if (correoUsuario != null && !correoUsuario.isEmpty() && contrasena != null && !contrasena.isEmpty()){
        /*processRequest(request, response, "registro exitoso");
        }else {
            processRequest(request, response, "ingresa tu correo electrónico y contraseña");
        }*/
        
        // Pasar los datos a la página JSP
            request.setAttribute("mensaje", "Registro exitoso.");
            request.setAttribute("nombreCompleto", nombreUsuario);
            request.setAttribute("email", correoUsuario);
            request.getRequestDispatcher("Resultado.jsp").forward(request, response);
        } else {
            // Redirigir a la página de error con un mensaje
            request.setAttribute("mensaje", "Por favor, ingresa los campos correo electrónico y contraseña.");
            request.getRequestDispatcher("Resultado.jsp").forward(request, response);
        
        }
        
       

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
*/
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
