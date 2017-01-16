package com.javaholic.dims.dims.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaholic.dims.dims.user.vo.DepartmentVO;

@Repository
public interface DepartmentDAO {
	
	public List<DepartmentVO> select();
	
}
