package search.model.service;

import search.model.dao.SearchDao;

import search.model.vo.Search;
import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
public class SearchService {
	public SearchService() {}
	private SearchDao sdao  = new SearchDao();
	
	public int insertSearch(String title) {
	Connection conn = getConnection();
		int result = 
				sdao.insertSearch(conn, title);
		close(conn);
		return result;
}
	public int countUp(String title) {
		Connection conn = getConnection();
		int result =
				sdao.countUp(conn, title);
		close(conn);
		return result;
	}
	public int checkTitle(String title) {
		Connection conn = getConnection();
		int result = sdao.checkTitle(conn,title);
		close(conn);
		return result;
	}
	public ArrayList<Search> selectRank() {
		Connection conn = getConnection();
		ArrayList<Search> list = sdao.selectRank(conn);
		close(conn);
		return list;
	}
}