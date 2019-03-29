package search.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import search.model.service.SearchService;

/**
 * Servlet implementation class SearchCheckTitle
 */
@WebServlet("/stitle")
public class SearchCheckTitleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCheckTitleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("search");
		System.out.println("클라로 부터 받은 검색어 : " +title);
		int result = new SearchService().checkTitle(title);
		int seconResult = 0;
		System.out.println("검색어 체킹후 받은 최종 result " +result);
		RequestDispatcher view = null;
		if(result == 1) {
			 seconResult = new SearchService().countUp(title);
		}else {
			 seconResult = new SearchService().insertSearch(title);
		}
		System.out.println("카운트업이나 인설트후 받은 결과 : " + seconResult);
		if(seconResult != 0) {
		/*response.setContentType("text/html; charset=UTF-8");
	    response.sendRedirect("/ln/sselect?sname=title");*/
	   view = request.getRequestDispatcher("sselect?sname="+title);
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
