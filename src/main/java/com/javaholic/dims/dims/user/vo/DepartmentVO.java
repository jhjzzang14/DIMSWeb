package com.javaholic.dims.dims.user.vo;

public class DepartmentVO {

	private int dptSeq;
	private String dptName;
	
	public DepartmentVO(){}
	
	public DepartmentVO(int dptSeq, String dptName) {
		super();
		this.dptSeq = dptSeq;
		this.dptName = dptName;
	}

	public int getDptSeq() {
		return dptSeq;
	}

	public void setDptSeq(int dptSeq) {
		this.dptSeq = dptSeq;
	}

	public String getDptName() {
		return dptName;
	}

	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	
}
