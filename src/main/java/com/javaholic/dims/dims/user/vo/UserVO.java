package com.javaholic.dims.dims.user.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.javaholic.dims.common.security.Authority;

public class UserVO implements UserDetails{
	
	private static final long serialVersionUID = 1L;

	private int userSeq;
	private String userName;
	private String userBirth;
	private String userId;
	private String userPassword;
	private String userInsDate;
	private String userUdtDate;
	private String userDelYn;
	private String userTypeAs;
	private String userEmail;
	private String userPhone;
	private String userAddress;
	private String userProfile;

	private String dptSeq;
	private String userGenderMw;
	private int userGrade;
	private String dptName;
	
	private String userAuthYn;
	private String userAuthKey;
	
	public UserVO(){}

	public UserVO(int userSeq, String userName, String userBirth, String userId, String userPassword,
			String userInsDate, String userUdtDate, String userDelYn, String userTypeAs, String userEmail,
			String userPhone, String userAddress, String userProfile, String dptSeq, String userGenderMw, int userGrade,
			String dptName, String userAuthYn, String userAuthKey) {
		super();
		this.userSeq = userSeq;
		this.userName = userName;
		this.userBirth = userBirth;
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
		this.dptName = dptName;
		this.userAuthYn = userAuthYn;
		this.userAuthKey = userAuthKey;
	}

	public String getUserAuthYn() {
		return userAuthYn;
	}

	public void setUserAuthYn(String userAuthYn) {
		this.userAuthYn = userAuthYn;
	}

	public String getUserAuthKey() {
		return userAuthKey;
	}

	public void setUserAuthKey(String userAuthKey) {
		this.userAuthKey = userAuthKey;
	}

	public String getDptName() {
		return dptName;
	}

	public void setDptName(String dptName) {
		this.dptName = dptName;
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

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserInsDate() {
		return userInsDate;
	}

	public void setUserInsDate(String userInsDate) {
		this.userInsDate = userInsDate;
	}

	public String getUserUdtDate() {
		return userUdtDate;
	}

	public void setUserUdtDate(String userUdtDate) {
		this.userUdtDate = userUdtDate;
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
		return "UserVO [userSeq=" + userSeq + ", userName=" + userName + ", userBirth=" + userBirth + ", userId="
				+ userId + ", userPassword=" + userPassword + ", userInsDate=" + userInsDate + ", userUdtDate="
				+ userUdtDate + ", userDelYn=" + userDelYn + ", userTypeAs=" + userTypeAs + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + ", userAddress=" + userAddress + ", userProfile=" + userProfile
				+ ", dptSeq=" + dptSeq + ", userGenderMw=" + userGenderMw + ", userGrade=" + userGrade + ", dptName="
				+ dptName + "]";
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
