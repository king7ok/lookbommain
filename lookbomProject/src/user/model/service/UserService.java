package user.model.service;
import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import user.model.dao.UserDao;
import user.model.vo.LookBomUser;
public class UserService {

	private UserDao udao = new UserDao();
	
	public UserService() {}
	
	public LookBomUser selectLogin(String userId, String userPwd) {
		Connection conn = getConnection();
		
		LookBomUser loginUser = udao.selectLogin(conn, userId, userPwd);
		close(conn);
		return loginUser;
	}
	
	public int selectCheckId(String userId) {
		Connection conn = getConnection();
		
		int result = udao.selectCheckId(conn, userId);
		close(conn);
		return result;
	}
	
	public int insertMember(LookBomUser user) {
		Connection conn = getConnection();
		int result = udao.insertMember(conn, user);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		
		close(conn);
		return result;
	}
	public LookBomUser selectUser(String userId) {
		Connection conn = getConnection();
		LookBomUser user = udao.selectUser(conn, userId);
		close(conn);
		return user;
	}
	public int updateUser(LookBomUser user) {
		Connection conn = getConnection();
		int result = udao.updateUser(conn, user);
		
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
	public int deleteUser(String userId) {
		Connection conn = getConnection();
		int result = udao.deleteUser(conn, userId);
		if(result >0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
	public ArrayList<LookBomUser> selectList(){
		Connection conn = getConnection();
		ArrayList<LookBomUser> list = udao.selectList(conn);
		close(conn);
		return list;
	}

	public String getUserPwd(int userNo) {
		Connection conn = getConnection();
		String userPwd = udao.getUserPwd(conn, userNo);
		close(conn);
		return userPwd;
	}
}
