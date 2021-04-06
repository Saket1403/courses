package com.detail.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.detail.app.Dao.DetailsDao;
import com.detail.app.entity.Details;

 
@Service
public class ServiceImpl implements ServiceD {

	@Autowired
	private DetailsDao detailDao;
	
	
	@Override
	public Details addDetails(Details details) {
	    detailDao.save(details);
		return details;
	}

}
