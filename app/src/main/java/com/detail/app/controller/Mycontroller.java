package com.detail.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.detail.app.entity.Details;
import com.detail.app.service.ServiceD;

@RestController
public class Mycontroller {
     
	@Autowired
	private ServiceD servicevar;
	
	@PostMapping("/details")
	public Details addDetails(@RequestBody Details details) {
		return this.servicevar.addDetails(details);
		
	}
}
