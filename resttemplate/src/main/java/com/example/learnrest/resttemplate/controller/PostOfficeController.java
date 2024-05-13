package com.example.learnrest.resttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnrest.resttemplate.output.PostOfficeResponseBean;
import com.example.learnrest.resttemplate.service.IPostService;
import com.example.learnrest.resttemplate.serviceImpl.PostalServiceImpl;

@RestController
@RequestMapping("/postal")
public class PostOfficeController {
	
	
	
	@Autowired
	IPostService postalServiceImpl;
	
	@RequestMapping(value="/byCity",method=RequestMethod.GET,consumes=MediaType.ALL_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public PostOfficeResponseBean getPostalByCity(@RequestParam String city) {
		PostOfficeResponseBean response = postalServiceImpl.fetchPostOfficeDetailsByCity(city);
		
		return response;
	}
	
	
	
	

}
