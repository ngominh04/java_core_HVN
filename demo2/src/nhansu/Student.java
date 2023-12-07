package nhansu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Student extends Human{
// mở rộng , 1 sinh viên có nhiều học kì
	String class_;
//	String subjectList;
	Scanner input = new Scanner(System.in);
	public void input() {
		System.out.println("Nhập mã sinh viên: ");
		this.code = input.nextLine();
		System.out.println("Nhập tên sinh viên: ");
		this.name = input.nextLine();
		System.out.println("Nhập địa chỉ sinh viên: ");
		this.address = input.nextLine();
		System.out.println("Nhập lớp: ");
		this.class_ = input.nextLine();
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [class_=" + class_ + ", name=" + name + ", address=" + address
				+ ", code=" + code + "]";
	}






	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, String code) {
		super(name, address, code);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String code) {
		super(name, code);
		// TODO Auto-generated constructor stub
	}
	public Student(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}




	public String getClass_() {
		return class_;
	}




	public void setClass_(String class_) {
		this.class_ = class_;
	}
	
	
}
