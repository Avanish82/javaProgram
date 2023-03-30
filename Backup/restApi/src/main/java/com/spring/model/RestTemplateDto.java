package com.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestTemplateDto {
	   
	  //  @JsonProperty("id")
	    private String id;
	 //   @JsonProperty("name")
	    private String name; 
	 //   @JsonProperty("email")
	    private String email; 
	//    @JsonProperty("address")
	    private String address; 
	 //   @JsonProperty("phone")
	    private String phone;
	    
 
//	    [{"id":3,"name":"Diwakar singh","email":"D@gmail.com","address":"DELHI","phone":"1478965423"},
//	     {"id":4,"name":"rani raja","email":"D@gmail.com","address":"DELHI","phone":"1478965423"},
//	     {"id":6,"name":"D raja","email":"D@gmail.com","address":"DELHI","phone":"1478965423"},
//	     {"id":7,"name":"shiv","email":"s@gmail.com","address":"jay","phone":"741258963"},
//	     {"id":9,"name":"Diwakar singh","email":"D@gmail.com","address":"DELHI","phone":"8878965423"},
//	     {"id":10,"name":"Diwakar singh","email":"D@gmail.com","address":"DELHI","phone":"8878965423"},
//	     {"id":11,"name":"avanish kumar","email":"D@gmail.com","address":"DELHI","phone":"1478965423"}]
	 
		public RestTemplateDto() {
	// TODO Auto-generated constructor stub
}

		public String getName() {
			return name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}

}
