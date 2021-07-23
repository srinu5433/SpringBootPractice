package com.srtech.service;

import java.util.List;

import com.srtech.dao.View;

public interface StudentMgmtService {
	
	public <T extends View> List<T> searchStudentsIn(List<Long> studIds, Class<T> clazz);
}
