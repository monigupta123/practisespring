package com.example.learnrest.resttemplate.output;

import java.util.List;


public class PostOfficeResponseBean {
	private String Message;
	private String Status;
	private List <PostOfficeDetailsBean>PostOffice;
	
	public String getMessage() {
		return this.Message;
	}

	public void setMessage(String message) {
		this.Message = message;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public List<PostOfficeDetailsBean> getPostOffice() {
		return PostOffice;
	}
	
	public void setPostOffice(List<PostOfficeDetailsBean> postOffice) {
		PostOffice = postOffice;
	}

	@Override
	public String toString() {
		return "PostOfficeResponseBean [Message=" + Message + ", Status=" + Status + ", PostOffice=" + PostOffice + "]";
	}
	
	
}
