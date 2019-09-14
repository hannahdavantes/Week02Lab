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
public class ArithmeticCalculatorServlet extends HttpServlet
  {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
      {
        String dash = "---";
        request.setAttribute("result", dash);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
      }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
      {
        try
          {
            String operation = request.getParameter("mathCalculator");
            String numBox1 = request.getParameter("number1");
            String numBox2 = request.getParameter("number2");
            double number1 = Double.valueOf(numBox1);
            double number2 = Double.valueOf(numBox2);
            double result = 0;

            if (operation.equals("+"))
              {
                result = number1 + number2;
              } else if (operation.equals("-"))
              {
                result = number1 - number2;
              } else if (operation.equals("*"))
              {
                result = number1 * number2;
              } else
              {
                result = number1 / number2;
              }

            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

          } catch (NumberFormatException | NullPointerException e)
          {
            e.getMessage();
            String error = "invalid";
            request.setAttribute("result", error);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
          }
      }
  }
