package com.javaholic.dims.dims.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaholic.dims.dims.user.dao.DepartmentDAO;
import com.javaholic.dims.dims.user.vo.DepartmentVO;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO dptDao;

	public List<DepartmentVO> getDepartments() {
		return dptDao.select();
	}
	
	
}
