package nhansu;

public class Human {

	String name;
	String address;
	String code;
	public Human(String name, String address, String code) {
		super();
		this.name = name;
		this.address = address;
		this.code = code;
	}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Human(String code) {
		super();
		this.code = code;
	}
	public Human(String name, String code) {
		super();
		this.name = name;
		this.code = code;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", address=" + address + ", code=" + code + "]";
	}
	
	
}
