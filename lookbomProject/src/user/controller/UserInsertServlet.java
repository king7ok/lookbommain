package user.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.service.UserService;
import user.model.vo.LookBomUser;

/**
 * Servlet implementation class UserInsertServlet
 */
@WebServlet("/insert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		LookBomUser user = new LookBomUser();
		
		user.setUserId(request.getParameter("userid"));
		user.setUserPwd(request.getParameter("userpwd"));
		user.setBirth(Date.valueOf(request.getParameter("birth")));
		if(request.getParameter("emailback").equals("anyone")) {
			user.setEmail(request.getParameter("email"));
		}else {
			user.setEmail(request.getParameter("email") + "@" + request.getParameter("emailback"));
		}
		user.setUserName(request.getParameter("username"));
		user.setPhone(request.getParameter("frontphone") + request.getParameter("phone"));
		user.setGender(request.getParameter("gender"));
		user.setCodePostal(request.getParameter("codepostal"));
		user.setAddress(request.getParameter("address1"));
		user.setAddress2(request.getParameter("address2"));
		
		 if(request.getParameter("check1") == null){
			user.setEmailYN("N");
		}else {
			user.setEmailYN(request.getParameter("check1"));
		}
		if(request.getParameter("check2") == null) {
			user.setSmsYN(request.getParameter("check2"));
		}else {
			user.setSmsYN("N");
		}
		int result = new UserService().insertMember(user);
		
		response.setContentType("text/html; charset=utf-8");
		if(result > 0) {
			response.sendRedirect("/lb/views/user/login.jsp");
		}else {
			RequestDispatcher view = request.getRequestDispatcher("views/user/userError.jsp");
			request.setAttribute("message", "회원가입 실패!");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
