package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import userDao.userDao;

@WebServlet("/profile")
public class ProfileServelt extends HttpServlet{

	private static final long serialVersionUID = 5908991270644426024L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		String username = (String) session.getAttribute("username");
		
		userDao dao = new userDao();
		
		User user = dao.getUser(username);
		
		req.setAttribute("username", username);
		req.setAttribute("password", user.getPassword());
		req.setAttribute("email", user.getEmail());
		req.setAttribute("phone", user.getPhone());
		
		req.getRequestDispatcher("profile.jsp").forward(req, resp);
	}
}
