package Bee;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Login.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserBean ub = new UserBean();
        ub.setName(request.getParameter("username"));
        ub.setPassword(request.getParameter("password"));

        HttpSession session = null;
        RequestDispatcher rd = null;

        try {
            if (Authenticator.execute(ub)) {
                ub = Authenticator.getUserBean();
                
                if (hasSession(request)) {
                    session = request.getSession(false);
                } else {
                    session = request.getSession(true);
                }

                request.setAttribute("userbean", ub);
                rd = request.getRequestDispatcher("mainmenu.jsp");
            } else {
                request.setAttribute("error", "Login failed.");
                rd = request.getRequestDispatcher("login.jsp");
            }

            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("Exception.jsp").forward(request, response);
        }
    }

    public boolean hasSession(HttpServletRequest req) {
        HttpSession session = null;
        session = req.getSession(false);
    
        return session != null;
    }
}

