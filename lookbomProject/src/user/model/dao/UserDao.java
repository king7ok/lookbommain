package user.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import user.model.vo.LookBomUser;

public class UserDao {

	public UserDao() {}
	
	public LookBomUser selectLogin(Connection conn, String userId, String userPwd) {
		LookBomUser user = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from lookbom_user where user_id = ? and user_pwd = ?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				user = new LookBomUser();
				
				user.setUserNo(rset.getInt("user_no"));
				user.setUserId(userId);
				user.setBirth(rset.getDate("birth"));
				user.setUserPwd(userPwd);
				user.setGender(rset.getString("gender"));
				user.setUserName(rset.getString("user_name"));
				user.setEmail(rset.getString("email"));
				user.setPhone(rset.getString("phone"));
				user.setCodePostal(rset.getString("code_postal"));
				user.setAddress(rset.getString("address"));
				user.setAddress2(rset.getString("address2"));
				user.setJoinDate(rset.getDate("join_date"));
				user.setSmsYN(rset.getString("sms_yn"));
				user.setEmailYN(rset.getString("email_yn"));
				user.setPoint(rset.getInt("point"));
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);

		}
		return user;
	}
	
	public int selectCheckId(Connection conn, String userId) {
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(user_id) from lookbom_user where user_id = ?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
			System.out.println("result : " + result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return result;
	}
	
	public int insertMember(Connection conn, LookBomUser user) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "insert into lookbom_user values (to_char(seq_user_no.nextval),?,?,?,?,?,?,?,?,?,?,sysdate,?,?,100)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, user.getUserId());
			pstmt.setDate(2, user.getBirth());
			pstmt.setString(3, user.getUserPwd());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getUserName());
			pstmt.setString(6, user.getEmail());
			pstmt.setString(7, user.getPhone());
			pstmt.setString(8, user.getCodePostal());
			pstmt.setString(9, user.getAddress());
			pstmt.setString(10, user.getAddress2());
			pstmt.setString(11, user.getSmsYN());
			pstmt.setString(12, user.getEmailYN());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public LookBomUser selectUser(Connection conn, String userId) {
		LookBomUser user = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from lookbom_user where userid = ?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				user = new LookBomUser();
				
				user.setUserNo(rset.getInt("user_no"));
				user.setUserId(userId);
				user.setBirth(rset.getDate("birth"));
				user.setUserPwd(rset.getString("user_pwd"));
				user.setGender(rset.getString("gender"));
				user.setUserName(rset.getString("user_name"));
				user.setEmail(rset.getString("email"));
				user.setPhone(rset.getString("phone"));
				user.setCodePostal(rset.getString("code_postal"));
				user.setAddress(rset.getString("address"));
				user.setAddress2(rset.getString("address2"));
				user.setJoinDate(rset.getDate("join_date"));
				user.setSmsYN(rset.getString("sms_yn"));
				user.setEmailYN(rset.getString("email_yn"));
				user.setPoint(rset.getInt("point"));
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);

		}
		return user;
	}
	public int adminUpdateUser(Connection conn, LookBomUser user) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update member set user_pwd = ?, email = ?, phone = ?, code_postal = ?, address = ?, address2 = ?, point = ? where user_id = ? or phone = ?";
		try {
			
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1, user.getUserPwd());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getCodePostal());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getAddress2());
			pstmt.setInt(7, user.getPoint());
			pstmt.setString(8, user.getUserId());
			pstmt.setString(9, user.getPhone());
			
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
		
		}
	
	
	public int updateUser(Connection conn, LookBomUser user) {
	int result = 0;
	PreparedStatement pstmt = null;
	
	String query = "update member set user_pwd = ?, phone = ?, code_postal = ?, address = ?, address2 = ? where user_id = ?";
	try {
		
		pstmt= conn.prepareStatement(query);
		pstmt.setString(1, user.getUserPwd());
		pstmt.setString(2, user.getEmail());
		
		pstmt.setString(3, user.getCodePostal());
		pstmt.setString(4, user.getAddress());
		pstmt.setString(5, user.getAddress2());
		pstmt.setString(6, user.getUserId());
		
		result = pstmt.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(pstmt);
	}
	return result;
	
	}
	public int deleteUser(Connection conn, String userId) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from LookBom_User where userid = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	public ArrayList<LookBomUser> selectList(Connection conn){
		ArrayList<LookBomUser> list = new ArrayList<LookBomUser>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from lookbom_user";
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				LookBomUser user = new LookBomUser();
				
				user.setUserNo(rset.getInt("user_no"));
				user.setUserId(rset.getString("user_id"));
				user.setBirth(rset.getDate("birth"));
				user.setUserPwd(rset.getString("user_pwd"));
				user.setGender(rset.getString("gender"));
				user.setUserName(rset.getString("user_name"));
				user.setEmail(rset.getString("email"));
				user.setPhone(rset.getString("phone"));
				user.setCodePostal(rset.getString("code_postal"));
				user.setAddress(rset.getString("address"));
				user.setAddress2(rset.getString("address2"));
				user.setJoinDate(rset.getDate("join_date"));
				user.setSmsYN(rset.getString("sms_yn"));
				user.setEmailYN(rset.getString("email_yn"));
				user.setPoint(rset.getInt("point"));
				
				list.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public String getUserPwd(Connection conn, int userNo) {
		String userPwd = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select user_pwd from lookbom_user where user_no = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userNo);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				userPwd = rset.getString("user_pwd");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return userPwd;
	}

	
	
	
}
