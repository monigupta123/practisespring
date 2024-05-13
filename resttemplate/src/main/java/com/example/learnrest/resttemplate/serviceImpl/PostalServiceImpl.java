package com.example.learnrest.resttemplate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.learnrest.resttemplate.output.PostOfficeDetailsBean;
import com.example.learnrest.resttemplate.output.PostOfficeResponseBean;
import com.example.learnrest.resttemplate.service.IPostService;

@Service
public class PostalServiceImpl implements IPostService {
	
	@Autowired
	 RestTemplate restTemplate;
	

	@Override
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue) {
		
		String url="https://api.postalpincode.in/postoffice/{city}";
		url = url.replace("{city}", cityValue);
		System.out.println("url" +url);
		
		ResponseEntity<PostOfficeResponseBean[]> postResponseEntity=
		
		restTemplate.getForEntity(url, PostOfficeResponseBean[].class);
		
		System.out.println(postResponseEntity.getStatusCodeValue()+" "+postResponseEntity.getBody());
		
		PostOfficeResponseBean[] responseBean  = postResponseEntity.getBody();
		
		
		for(PostOfficeResponseBean response :responseBean) {
			System.out.println("response "+response);
			List <PostOfficeDetailsBean> details = response.getPostOffice();
			
			
			for(PostOfficeDetailsBean pfr : details) {				
				System.out.println("name" +pfr.getName() +" *****"+"pincode"+ pfr.getPincode()+"*****"+"region"+pfr.getRegion() );
				}
		}
		
		return responseBean[0];
		
	} 

}






