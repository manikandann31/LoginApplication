package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        // Check whether the user is authenticated
        if (session == null ||
            session.getAttribute("username") == null) {

            resp.sendRedirect("login.jsp");
            return;
        }

        // Get authenticated username from session
        String username =
                (String) session.getAttribute("username");

        UserService service = new UserService();

        boolean deleted =
                service.deleteUser(username);

        if (deleted) {

            // Account is deleted, so the session
            // should no longer remain authenticated
            session.invalidate();

            resp.sendRedirect("index.jsp");

        } else {

            req.setAttribute(
                    "message",
                    "Unable to delete account"
            );

            req.getRequestDispatcher("home.jsp")
               .forward(req, resp);
        }
    }
}