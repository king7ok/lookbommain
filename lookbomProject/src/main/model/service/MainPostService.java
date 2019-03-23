package main.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import main.model.dao.MainPostDao;
import main.model.vo.MainPost;

public class MainPostService {
	ArrayList<MainPost> list = new ArrayList<>();

	public MainPostService() {}
	private MainPostDao mdao = new MainPostDao();
	public int insertPost(String url,String img) {
		
		Connection conn = getConnection();
		int result = mdao.insertPost(conn, url, img);
		close(conn);
		return result;
	}
	public MainPost deletePost(String url,String img) {
		Connection conn = getConnection();
		MainPost mpost = mdao.deletePost(conn, url, img);
		close(conn);
		return mpost;
	}
	public ArrayList<MainPost> selectPost() {
		Connection conn = getConnection();
		ArrayList<MainPost> list = mdao.selectPost(conn);
		close(conn);
		return list;
	}
	
	
}
