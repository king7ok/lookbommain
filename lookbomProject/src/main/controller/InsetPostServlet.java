package main.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import main.model.service.MainPostService;
import main.model.vo.MainPost;

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
		request.setCharacterEncoding("utf-8");
		RequestDispatcher view = null;
	      if(!ServletFileUpload.isMultipartContent(request)) {
	         view = request.getRequestDispatcher("/lb/views/common/mainError.jsp");
	         request.setAttribute("message", "form의 enctype 속성 사용 안됨!");
	         view.forward(request, response);
	      }
	      
	      int maxSize = 1024 * 1024 * 10;
	      
	      String root = request.getSession().getServletContext().getRealPath("/");
	      String savePath = root + "file/Mpost";
	      
	      MultipartRequest mrequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new DefaultFileRenamePolicy());
	   
		MainPost mpost = new MainPost();
		mpost.setUrl(mrequest.getParameter("url1"));
		mpost.setImg(mrequest.getFilesystemName("img1"));

	      
	     int result = new MainPostService().insertPost(mpost);
	      
	     if(result >0) {
				response.sendRedirect("mpselect");
			}else {
				view = request.getRequestDispatcher("mpselect");
				
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
