
package org.jakartaeerecipes.chapter01.recipe01_14;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juneau
 */
// Uncomment the following line to run example stand-alone
//@WebServlet(name = "DivideServlet", urlPatterns = {"/DivideServlet"})

// The following will allow the example to run within the context of the JavaEERecipes example
// enterprise application (javaee8recipes.war distro or Netbeans Project
@WebServlet(name = "DivideServlet", urlPatterns = {"/chapter01/DivideServlet"})
public class DivideServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         // Store the input parameter values into Strings
                String numA = request.getParameter("numa");
                String numB = request.getParameter("numb");
                
        try {
            int quotient = Integer.valueOf(numA) / Integer.valueOf(numB);
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The Quotient of the Numbers</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Quotient: " + quotient + "</h1>");
            out.println("<br/>");
            out.println("<a href=recipe01_14.html>Try Again</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex){
            out.println("Those two numbers will not work, please try again.");
        } finally {            
            out.close();
        }
    }

    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
