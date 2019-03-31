package search.model.service;

import search.model.dao.SearchDao;

import search.model.vo.Search;
import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import product.model.vo.ProductFull;
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
	public ArrayList<ProductFull> searchSelectList(String sName, int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ProductFull> list = sdao.searchSelectList(conn,sName,currentPage,limit);
		close(conn);
		return list;
	}
	public int getListCount(String sName) {
		Connection conn = getConnection();
		int listCount = sdao.getListCount(conn, sName);
		close(conn);
		return listCount;
	}
}