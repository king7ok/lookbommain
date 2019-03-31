package main.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import main.model.dao.MainPostDao;
import main.model.vo.MainPost;
import main.model.vo.Product1;

public class MainPostService {
	ArrayList<MainPost> list = new ArrayList<>();

	public MainPostService() {}
	private MainPostDao mdao = new MainPostDao();
	public int insertPost(MainPost mpost) {
		Connection conn = getConnection();
		int result = mdao.insertPost(conn, mpost);
		close(conn);
		return result;
	}

	public ArrayList<MainPost> selectPost() {
		Connection conn = getConnection();
		ArrayList<MainPost> list = mdao.selectPost(conn);
		System.out.println(list);
		close(conn);
		return list;
	}
	public int deletePost(int rnum) {
		Connection conn = getConnection();
		int result = mdao.deletePost(conn,rnum);
		close(conn);
		System.out.println("service return : " + result);
		return result;
	}

	public ArrayList<Product1> selectTop8() {
		Connection conn = getConnection();
		ArrayList<Product1>  list = mdao.selectTop8(conn);
		close(conn);
		return list;
	}
	
	
}
