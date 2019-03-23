package main.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.model.service.MainPostService;

/**
 * Servlet implementation class InsetPostServlet
 */
@WebServlet("/mpinsert")
public class InsetPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsetPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 메인포스트 입력 서블릿
		String url1 = request.getParameter("url1");
		String img1 = request.getParameter("img1");
		int result = new MainPostService().insertPost(url1,img1);
		RequestDispatcher view = null;
		if(result >0) {
			response.sendRedirect("/semi/views/adminMain/mainPostUpdate.jsp");
		}else {
			view = request.getRequestDispatcher("views/adminMain/mainPostUpdate.jsp");
			request.setAttribute("message", "등록 실패");
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
