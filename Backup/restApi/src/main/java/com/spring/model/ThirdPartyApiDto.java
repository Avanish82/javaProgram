package com.spring.model;

public class ThirdPartyApiDto {
	
	private String id;
	private String emaployee_name;
	private String employee_salary;
	private String employee_age;
	private String profile_image;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmaployee_name() {
		return emaployee_name;
	}
	public void setEmaployee_name(String emaployee_name) {
		this.emaployee_name = emaployee_name;
	}
	public String getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}
	public String getEmployee_age() {
		return employee_age;
	}
	public void setEmployee_age(String employee_age) {
		this.employee_age = employee_age;
	}
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	
//}
//	{"status":"success","data":{"id":1,"employee_name":"Tiger Nixon","employee_salary":320800,"employee_age":61,"profile_image":""},"message":"Successfully! Record has been fetched."

}
