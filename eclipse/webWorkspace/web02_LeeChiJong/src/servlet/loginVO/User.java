package servlet.loginVO;

public class User {
	private String id;
	private String password;
	private String name;
	private String address;
	private String phoneNumber;
	
	public User() {}

	public User(String id, String password, String name, String address, String phoneNumber) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "ID: "+this.id+", PW: "+this.password+", Name: "+this.name+", Address: "+this.address+", Phone: "+this.phoneNumber;
	}
}