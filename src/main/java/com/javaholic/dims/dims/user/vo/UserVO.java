package com.javaholic.dims.dims.user.vo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.javaholic.dims.common.security.Authority;

public class UserVO implements UserDetails{
	
	private int userSeq;
	private String userName;
	private Timestamp userCreateAt;
	private String userId;
	private String userPassword;
	private Timestamp userInsDate;
	private Timestamp userUdtDate;
	private String userDelYn;
	private String userTypeAs;
	private String userEmail;
	private String userPhone;
	private String userAddress;
	private String userProfile;
	private String dptSeq;
	private String userGenderMw;
	private int userGrade;
	
	public UserVO(){}

	public UserVO(int userSeq, String userName, Timestamp userCreateAt, String userId, String userPassword,
			Timestamp userInsDate, Timestamp userUdtDate, String userDelYn, String userTypeAs, String userEmail,
			String userPhone, String userAddress, String userProfile, String dptSeq, String userGenderMw,
			int userGrade) {
		super();
		this.userSeq = userSeq;
		this.userName = userName;
		this.userCreateAt = userCreateAt;
		this.userId = userId;
		this.userPassword = userPassword;
		this.userInsDate = userInsDate;
		this.userUdtDate = userUdtDate;
		this.userDelYn = userDelYn;
		this.userTypeAs = userTypeAs;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userProfile = userProfile;
		this.dptSeq = dptSeq;
		this.userGenderMw = userGenderMw;
		this.userGrade = userGrade;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getUserCreateAt() {
		return userCreateAt;
	}

	public void setUserCreateAt(Timestamp userCreateAt) {
		this.userCreateAt = userCreateAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Timestamp getUserInsDate() {
		return userInsDate;
	}

	public void setUserInsDate(Timestamp userInsDate) {
		this.userInsDate = userInsDate;
	}

	public Timestamp getUserUdtDate() {
		return userUdtDate;
	}

	public void setUserUdtDate(Timestamp userUdtDate) {
		this.userUdtDate = userUdtDate;
	}

	public String getUserDelYn() {
		return userDelYn;
	}

	public void setUserDelYn(String userDelYn) {
		this.userDelYn = userDelYn;
	}

	public String getUserTypeAs() {
		return userTypeAs;
	}

	public void setUserTypeAs(String userTypeAs) {
		this.userTypeAs = userTypeAs;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

	public String getDptSeq() {
		return dptSeq;
	}

	public void setDptSeq(String dptSeq) {
		this.dptSeq = dptSeq;
	}

	public String getUserGenderMw() {
		return userGenderMw;
	}

	public void setUserGenderMw(String userGenderMw) {
		this.userGenderMw = userGenderMw;
	}

	public int getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(int userGrade) {
		this.userGrade = userGrade;
	}

	@Override
	public String toString() {
		return "UserVo [userSeq=" + userSeq + ", userName=" + userName + ", userCreateAt=" + userCreateAt + ", userId="
				+ userId + ", userPassword=" + userPassword + ", userInsDate=" + userInsDate + ", userUdtDate="
				+ userUdtDate + ", userDelYn=" + userDelYn + ", userTypeAs=" + userTypeAs + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + ", userAddress=" + userAddress + ", userProfile=" + userProfile
				+ ", dptSeq=" + dptSeq + ", userGenderMw=" + userGenderMw + ", userGrade=" + userGrade + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Authority authority = new Authority();
		List<Authority> list = new ArrayList<Authority>();
		list.add(authority);
		return list;
	}

	@Override
	public String getPassword() {
		
		return userPassword;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userId;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
