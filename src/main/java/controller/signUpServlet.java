package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.UserService;

@WebServlet("/signup")
public class signUpServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException,ServletException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
	
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(Long.parseLong(phone));
		
		UserService service=new UserService();
		
		boolean notexist= service.saveUser(user);
		
		if(notexist) {
			HttpSession session = request.getSession();
			
			session.setAttribute("username", username);
			
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");	
			try {
				
				rd.forward(request, response);
				
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			request.setAttribute("message", "username already exist");
			
			RequestDispatcher rd = request.getRequestDispatcher("signUp.jsp");
			rd.forward(request, response);
		}
	
	}
	
}
