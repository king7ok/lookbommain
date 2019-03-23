package user.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class LookBomUser implements Serializable {
	private static final long serialVersionUID = 333L;
	
	private int userNo;
	private String userId;
	private Date birth;
	private String userPwd;
	private String gender;
	private String userName;
	private String email;
	private String phone;
	private String codePostal;
	private String address;
	private String address2;
	private Date joinDate;
	private String smsYN;
	private String emailYN;
	private int point;
	public LookBomUser() {}
	public LookBomUser(int userNo, String userId, Date birth, String userPwd, String gender, String userName, String email,
			String phone, String codePostal, String address, String address2, Date joinDate, String smsYN,
			String emailYN, int point) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.birth = birth;
		this.userPwd = userPwd;
		this.gender = gender;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.codePostal = codePostal;
		this.address = address;
		this.address2 = address2;
		this.joinDate = joinDate;
		this.smsYN = smsYN;
		this.emailYN = emailYN;
		this.point = point;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getSmsYN() {
		return smsYN;
	}
	public void setSmsYN(String smsYN) {
		this.smsYN = smsYN;
	}
	public String getEmailYN() {
		return emailYN;
	}
	public void setEmailYN(String emailYN) {
		this.emailYN = emailYN;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return userNo + ", " + userId + ", " + birth + ", " + userPwd + ", " + gender + ", " + userName + ", " + email + ", " + phone + ", " + codePostal + ", " + address + ", " + address2 + ", " + joinDate + ", " + smsYN + ", " + emailYN + ", " + point;
	}
}
