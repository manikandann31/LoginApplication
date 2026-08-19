package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session == null ||
            session.getAttribute("username") == null) {

            resp.sendRedirect("login.jsp");
            return;
        }

        req.getRequestDispatcher("update.jsp")
           .forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req,
                           HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session == null ||
            session.getAttribute("username") == null) {

            resp.sendRedirect("login.jsp");
            return;
        }

        String username =
                (String) session.getAttribute("username");

        String email =
                req.getParameter("email");

        String phone =
                req.getParameter("phone");

        String password =
                req.getParameter("password");


        UserService service = new UserService();

        boolean updated =
                service.updateUser(
                        username,
                        password,
                        email,
                        phone
                );


        if (updated) {

            resp.sendRedirect("profile");

        } else {

            req.setAttribute(
                    "message",
                    "Profile update failed"
            );

            req.getRequestDispatcher("update.jsp")
               .forward(req, resp);
        }
    }
}