package product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.model.vo.ProductFull;
import product.model.service.ProductService;

/**
 * Servlet implementation class ProductListViewServlet
 */
@WebServlet("/plist")
public class ProductListViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductListViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   int currentPage = 1;
	       if(request.getParameter("page") != null) {
	    	   currentPage = Integer.parseInt(request.getParameter("page"));
	       }
	       
	       int limit = 20;
	       	      
	       ProductService pservice = new ProductService();
	       
	       int listCount = pservice.getListCount();

	       
	       ArrayList<ProductFull> list = pservice.selectList(currentPage, limit);
	       
	       int maxPage = (int)((double)listCount / limit + 0.95);
		   
	       int startPage = (((int)((double)currentPage / limit + 0.95)) - 1) * limit + 1;
	       
	       int endPage = startPage + limit - 1;
	 	   
	       if(maxPage < endPage) {
	           endPage = maxPage;   
	        }
	       
	       ArrayList<String> brand = pservice.getBrand();	    
	       
	       response.setContentType("text/html; charset=UTF-8");
	       RequestDispatcher view = null;
	       if(list.size() > 0) {
	           view = request.getRequestDispatcher("views/product/productListView.jsp");
	           request.setAttribute("list", list);
	           request.setAttribute("currentPage", currentPage);
	           request.setAttribute("maxPage", maxPage);
	           request.setAttribute("startPage", startPage);
	           request.setAttribute("endPage", endPage);
	           request.setAttribute("listCount", listCount);
	           request.setAttribute("brand", brand);
	           
	           view.forward(request, response);
	       }else {
	          view = request.getRequestDispatcher("views/product/productError.jsp");
	          request.setAttribute("message", currentPage + "에 대한 상품목록 조회 실패");
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
