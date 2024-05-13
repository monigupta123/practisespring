package com.example.learnrest.resttemplate.service;

import org.springframework.stereotype.Service;

import com.example.learnrest.resttemplate.output.PostOfficeResponseBean;


public interface IPostService {
	

	PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);

	

}
