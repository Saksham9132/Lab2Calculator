/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saksham
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
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
        request.setAttribute("message","---" ); //setting default value "---" if no calculations has been done.
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        if(request.getParameter("first") != null){    //to check if there is no input entered by user
           try{
            if(request.getParameter("second") != null){      //to check if there is no input entered by user
                if(request.getParameter("add") != null){
                    String firstString = request.getParameter("first");
                   int first= Integer.parseInt(firstString);
                    String secondString = request.getParameter("second");
                   int second= Integer.parseInt(secondString);
                   int add = first + second;
                   request.setAttribute("message", add);
                }
                else if(request.getParameter("subtract") != null){
                    String firstString = request.getParameter("first");
                   int first= Integer.parseInt(firstString);
                    String secondString = request.getParameter("second");
                   int second= Integer.parseInt(secondString);
                   int sub = first - second;
                   request.setAttribute("message", sub);
                } 
                else if(request.getParameter("multiply") != null){
                    String firstString = request.getParameter("first");
                   int first= Integer.parseInt(firstString);
                    String secondString = request.getParameter("second");
                   int second= Integer.parseInt(secondString);
                   int multiply = first*second;
                   request.setAttribute("message", multiply);
                } 
                else if(request.getParameter("divide") != null){
                    String firstString = request.getParameter("first");
                   int first= Integer.parseInt(firstString);
                    String secondString = request.getParameter("second");
                   int second= Integer.parseInt(secondString);
                   int divide = first%second;
                   request.setAttribute("message", divide);
                }
            }
            else{
                request.setAttribute("message", "invalid");
            }
           }
           catch(Exception ex) {
            request.setAttribute("message", "invalid");
        }
        }
        else{
            request.setAttribute("message", "invalid");
        }
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }


}
