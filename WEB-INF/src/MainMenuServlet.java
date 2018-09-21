package Bee;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainMenuServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("mainmenu.jsp").forward(request, response);
  }
}
