package product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.net.aso.p;
import product.model.service.ProductService;
import product.model.vo.ProductFull;

/**
 * Servlet implementation class ProductDetailViewServlet
 */
@WebServlet("/pdetail")
public class ProductDetailViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetailViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productNo = Integer.parseInt(request.getParameter("pno"));
		int currentPage =1;
		if(request.getParameter("page") != null)
		currentPage = Integer.parseInt(request.getParameter("page"));
		
		ProductService pservice = new ProductService();
		
		pservice.addViewCount(productNo);
		
		ArrayList<ProductFull> list = pservice.selectProduct(productNo);
				
		
		 response.setContentType("text/html; charset=utf-8");
		 RequestDispatcher view = null;
		  if(list.size() > 0) {
			  view = request.getRequestDispatcher("views/product/productDetailView.jsp");
		         request.setAttribute("list", list);
		         request.setAttribute("currentPage", currentPage);
		         view.forward(request, response);	
		  }else {
			  view = request.getRequestDispatcher("views/product/productError.jsp");
		         request.setAttribute("message", productNo+ "번 상품에 대한 조회 실패");
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
