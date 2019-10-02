/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entities.Account;
import facades.AccountFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.EMF_Creator;

/**
 *
 * @author emilt
 */
@WebServlet(name = "ProcessRequest", urlPatterns = {"/ProcessRequest"})
public class ProcessRequest extends HttpServlet {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(
                "pu",
                "jdbc:mysql://localhost:3307/WoWApplication",
                "dev",
                "ax2",
                EMF_Creator.Strategy.CREATE);
    private static final AccountFacade FACADE =  AccountFacade.getAccountFacade(EMF);
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        
        Cookie[] cookies = request.getCookies();
        String  sb = "";
        boolean flag = true;
        String ignName = request.getParameter("ignName");
        String charClass = request.getParameter("charClass");
        String role = request.getParameter("role");
        String primProf = request.getParameter("primaryProf");
        String secondProf = request.getParameter("secondaryProf");

        if (cookies != null) {
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("Account")) {
                    sb = "You have already made an account!";
                    flag = false;
                }
            }
            if (flag) {
                sb = "Thank you for registering " + request.getParameter("ignName");
                Cookie cookie = new Cookie("Account", "Sorry");
                cookie.setMaxAge(60 * 60 * 24 * 365);
                response.addCookie(cookie);
                FACADE.addAccount(new Account(ignName, charClass, role, primProf, secondProf));
            }
        } else {
            sb = "Thank you for registering " + request.getParameter("ignName");
            Cookie cookie = new Cookie("Account", "Sorry");
            cookie.setMaxAge(60 * 60 * 24 * 365);
            response.addCookie(cookie);
            FACADE.addAccount(new Account(ignName, charClass, role, primProf, secondProf));
        }

        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessRequest</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + sb.toString() + "</h1>");
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
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
    }// </editor-fold>

}
