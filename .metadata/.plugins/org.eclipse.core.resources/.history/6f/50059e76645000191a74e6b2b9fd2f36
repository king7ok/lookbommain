package search.model.service;

import search.model.dao.SearchDao;

import search.model.vo.Search;
import static common.JDBCTemplate.*;

import java.sql.Connection;
public class SearchService {
	public SearchService() {}
	private SearchDao sdao  = new SearchDao();
	
	public Search insertSearch(String searchTitle) {
	Connection conn = getConnection();
		Search search = 
				sdao.insertSearch(conn, searchTitle);
		close(conn);
		return search;
}
	public Search countUp(String searchTitle) {
		Connection conn = getConnection();
		Search search =
				sdao.countUp(conn, searchTitle);
		close(conn);
		return search;
	}
}