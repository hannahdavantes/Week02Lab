/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 652343
 */
public class AgeCalculatorServlet extends HttpServlet
  {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
      {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
      }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
      {
        try
          {

            String ageInput = request.getParameter("inputAge");
            int age = Integer.valueOf(ageInput);
            int nextAge = age + 1;
            String newAgeText = "Your age next birthday is: " + nextAge;
            request.setAttribute("newAgeMessage", newAgeText);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            /*
            if (ageInput.equals("") || ageInput == null)
              {
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

                return;
              }*/
          } catch (NumberFormatException e)
          {
            e.getMessage();
          }

      }

  }
