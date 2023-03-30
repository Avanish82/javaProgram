import java.sql.Connection;

public class DaoCallMngTbl {
	public static Connection getConnection;
	private int id;  
	private String email;  
	private String state;  
	private String pin;
	private String customer_type;  
	private String mobile;  
	private String address;  
	private String city;  
	private String prelanguage;  
	private String priority_type;  
	private String alternate_mobile;  
	private String landmark;  
	private String area;  
	private String customer_code;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	public String getState() {
		return state;
	} 
	public void setState(String state) {
		this.state = state;
	} 
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	} 
	public String getCustomer_type() {
		return customer_type;
	} 
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	} 
	public String getMobile() {
		return mobile;
	} 
	public void setMobile(String mobile) {
		this.mobile = mobile;
	} 
	public String getAddress() {
		return address;
	} 
	public void setAddress(String address) {
		this.address = address;
	} 
	public String getCity() {
		return city;
	} 
	public void setCity(String city) {
		this.city = city;
	} 
	public String getPrelanguage() {
		return prelanguage;
	} 
	public void setPrelanguage(String prelanguage) {
		this.prelanguage = prelanguage;
	} 
	public String getPriority_type() {
		return priority_type;
	} 
	public void setPriority_type(String priority_type) {
		this.priority_type = priority_type;
	} 
	public String getAlternate_mobile() {
		return alternate_mobile;
	} 
	public void setAlternate_mobile(String alternate_mobile) {
		this.alternate_mobile = alternate_mobile;
	} 
	public String getLandmark() {
		return landmark;
	} 
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	} 
	public String getArea() {
		return area;
	} 
	public void setArea(String area) {
		this.area = area;
	} 
	public String getCustomer_code() {
		return customer_code;
	}  
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}

	public DaoCallMngTbl(int id, String email, String state, String pin, String customer_type, String mobile,
			String address, String city, String prelanguage, String priority_type, String alternate_mobile,
			String landmark, String area, String customer_code) {
		super();
		this.id = id;
		this.email = email;
		this.state = state;
		this.pin = pin;
		this.customer_type = customer_type;
		this.mobile = mobile;
		this.address = address;
		this.city = city;
		this.prelanguage = prelanguage;
		this.priority_type = priority_type;
		this.alternate_mobile = alternate_mobile;
		this.landmark = landmark;
		this.area = area;
		this.customer_code = customer_code;
	}  

	public String toString() {
		return "\nDaoCallMngTbl [id=" + id + ", email=" + email + ", state=" + state + ", pin=" + pin + ", customer_type="
				+ customer_type + ", mobile=" + mobile + ", address=" + address + ", city=" + city + ", prelanguage="
				+ prelanguage + ", priority_type=" + priority_type + ", alternate_mobile=" + alternate_mobile
				+ ", landmark=" + landmark + ", area=" + area + ", customer_code=" + customer_code + "]";
	}
	public DaoCallMngTbl() {
		 
	}
 

}
