package servlet;

import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import user.User; // User 클래스 임포트
import user.UserDAO; // UserDAO 클래스 임포트

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Date registrationDate = new Date(System.currentTimeMillis());

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setRegistrationDate(registrationDate);

		UserDAO userDAO = new UserDAO();
		int result = userDAO.register(user);

		if (result == 1) {
			response.sendRedirect("login.jsp"); // 회원 가입 성공 시 로그인 페이지로 이동
		} else {
			response.sendRedirect("register.jsp"); // 회원 가입 실패 시 다시 회원 가입 페이지로 이동
		}
	}
}
