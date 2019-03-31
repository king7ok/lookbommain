package search.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.model.vo.ProductFull;
import search.model.service.SearchService;

/**
 * Servlet implementation class SearchSelectServlet
 */
@WebServlet("/sselect")
public class SearchSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int currentPage = 1;
		 String sName = request.getParameter("sname");
		 System.out.println("sselect서블릿에서 받은 검색어  : " +sName);
	       if(request.getParameter("page") != null) {
	    	   currentPage = Integer.parseInt(request.getParameter("page"));
	       }
	       
	       int limit = 20;
	       	      
	       SearchService service = new SearchService();
	       
	       
	       int listCount = service.getListCount(sName);

	       
	       ArrayList<ProductFull> list = service.searchSelectList(sName, currentPage, limit);
	       System.out.println(list);
	       
	       int maxPage = (int)((double)listCount / limit + 0.95);
		   
	       int startPage = (((int)((double)currentPage / limit + 0.95)) - 1) * limit + 1;
	       
	       int endPage = startPage + limit - 1;
	 	   
	       if(maxPage < endPage) {
	           endPage = maxPage;   
	        }
	       
	     
	       
	       response.setContentType("text/html; charset=UTF-8");
	       RequestDispatcher view = null;
	       if(list.size() > 0) {
	           view = request.getRequestDispatcher("index.jsp");
	           request.setAttribute("list", list);
	           request.setAttribute("currentPage", currentPage);
	           request.setAttribute("maxPage", maxPage);
	           request.setAttribute("startPage", startPage);
	           request.setAttribute("endPage", endPage);
	           request.setAttribute("listCount", listCount);
	           
	           
	           view.forward(request, response);
	       }else {
	          view = request.getRequestDispatcher("index.jsp");
	          /*request.setAttribute("message", currentPage + "에 대한 상품목록 조회 실패");*/
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
