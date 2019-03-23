package user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.service.UserService;
import user.model.vo.LookBomUser;

/**
 * Servlet implementation class UserUpdateServlet
 */
@WebServlet("/update")
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	
	LookBomUser user = new LookBomUser();
	
	user.setUserPwd(request.getParameter("userpwd"));
	user.setPhone(request.getParameter("frontphone") + request.getParameter("phone"));
	user.setCodePostal(request.getParameter("postal"));
	user.setAddress(request.getParameter("address"));
	user.setAddress2(request.getParameter("address2"));
	
	int result = new UserService().updateUser(user);
	
	if(result > 0) {
		response.sendRedirect("/lb/views/user/updateUser.jsp");
	} else {
		RequestDispatcher view = request.getRequestDispatcher("views/user/userError.jsp");
		request.setAttribute("message", user.getUserId() + "님의 회원정보 수정 실패!");
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
