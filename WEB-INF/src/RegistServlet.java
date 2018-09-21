package Bee;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    UserBean ub = new UserBean();

    ub.setName(request.getParameter("username"));
    ub.setAge(Integer.parseInt(request.getParameter("age")));
    ub.setEmail(request.getParameter("email"));
    ub.setPassword(request.getParameter("password"));
    ub.setLocation(request.getParameter("lcoation"));

    Registrator rg = new Registrator();

    if (!rg.execute(ub)) {
      request.setAttribute("error", "Registration error.");
      request.getRequestDispatcher("regist.jsp").forward(request, response);
    } else {
      response.sendRedirect("login.jsp");
    }
  }
}
