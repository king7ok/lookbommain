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
		String title = request.getParameter("search");
		int result = new SearchService().checkTitle(title);
		int seconResult = 0;
		RequestDispatcher view = null;
		if(result ==1) {
			 seconResult = new SearchService().countUp(title);
		}else {
			 seconResult = new SearchService().insertSearch(title);
		}
		if(seconResult != 0) {

	     view = request.getRequestDispatcher("index.jsp");
	     
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
