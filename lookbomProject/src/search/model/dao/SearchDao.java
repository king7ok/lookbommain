package search.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import search.model.vo.Search;
import static common.JDBCTemplate.*;
public class SearchDao {
	public int insertSearch(Connection conn, String title) {
		int result = 0;
		System.out.println("insertdao 에서받은 title : " +title);
		PreparedStatement stmt = null;
		String query = "INSERT INTO SEARCH(SEARCH_NO, SEARCH_TITLE, SC_COUNT) VALUES (SEQ_SEARCH_NO.NEXTVAL, ?, 1)";
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, title);
			result = stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
		System.out.println("insertdao 결과 result : " + result);
		return result;
	}

	public int countUp(Connection conn, String title) {
		int result = 0;
		PreparedStatement stmt = null;
		String query = "update search set sc_count = (1+(select sc_count from search where search_title = ?)) where search_title = ?";
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, title);
			stmt.setString(2, title);
			result = stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		System.out.println("카운트업 dao result : " + result);
		return result;
	}

	public int checkTitle(Connection conn, String title) {
		ArrayList<Search> list = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = "SELECT * FROM SEARCH WHERE SEARCH_TITLE = ? ";
		try {
			
			stmt = conn.prepareStatement(query);
			stmt.setString(1, title);
			rset = stmt.executeQuery();
			while(rset.next()) {
				Search s = new Search();
				s.setSearchNo(rset.getInt("search_no"));
				s.setSearchTitle(rset.getString("search_title"));
				s.setCount(rset.getInt("sc_count"));
				list.add(s);
			}
			if(list.size() == 0) {
				result = 0;
			}else {
				result = 1;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return result;
	}

	public ArrayList<Search> selectRank(Connection conn) {
		ArrayList<Search> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select search_title from search order by sc_count ";
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Search s = new Search();
				s.setSearchTitle(rset.getString("search_title"));
				list.add(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(rset);
		}
		System.out.println("인기검색어 dao : " +list);
		return list;
	}
}
