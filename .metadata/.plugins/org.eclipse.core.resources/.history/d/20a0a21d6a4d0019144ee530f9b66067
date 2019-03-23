package main.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import main.model.vo.MainPost;
public class MainPostDao {

	public int insertPost(Connection conn, String url, String img) {
		PreparedStatement stmt = null;
		String query = "insert into mainpost (banner_no,banner_url,banner_img,banner_division) values (seq_banner_no,?,?,1)";
		int result =0;
		try{
			stmt = conn.prepareStatement(query);
			stmt.setString(1, url);
			stmt.setString(2, img);
			result = stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
		return result;
	}

	public MainPost deletePost(Connection conn, String url, String img) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MainPost> selectPost(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from screen_banner";
		ArrayList<MainPost> list = null;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				MainPost post = null;
				post.setPostNo(rset.getInt("seq_banner_no"));
				post.setUrl(rset.getString("banner_url"));
				post.setImg(rset.getString("banner_img"));
				post.setCategory(rset.getInt("banner_division"));
				post.setContent(rset.getString("ad_contents"));
				
				list.add(post);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

}
