package main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import main.model.service.MainPostService;
import main.model.vo.MainPost;

/**
 * Servlet implementation class SelectMainSlideServlet
 */
@WebServlet("/mpvsel")
public class SelectMainSlideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectMainSlideServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//메인포스트 ajax
		
		ArrayList<MainPost> list = new MainPostService().selectPost();
		/*System.out.println("메인 포스트 리턴리스트 : " + list);*/
		
		JSONObject sendJson = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		
		for(MainPost m : list) {
			JSONObject job = new JSONObject();
			
			job.put("img", URLEncoder.encode(m.getImg(),"UTF-8"));
			job.put("url", URLEncoder.encode(m.getUrl(),"UTF-8"));
			
			jsonArr.add(job);
		}
		sendJson.put("list", jsonArr);
		
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(sendJson.toJSONString());
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
