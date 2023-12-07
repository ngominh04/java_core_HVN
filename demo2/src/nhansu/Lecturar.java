package nhansu;

import java.util.Scanner;

public class Lecturar extends Human{
	String passwword;
	
	Scanner input= new Scanner(System.in);
	
	void input() {
		System.out.println("Nhập password: ");
		passwword = input.nextLine();
		System.out.println("Nhập mã giảng viên: ");
		this.code = input.nextLine();
		System.out.println("Nhập tên giảng viên: ");
		this.name = input.nextLine();
		System.out.println("Nhập địa chỉ giảng viên: ");
		this.address = input.nextLine();
	}

	@Override
	public String toString() {
		return "Lecturar [passwword=" + passwword + ", name=" + name + ", address=" + address + ", code=" + code + "]";
	}

	public String getPasswword() {
		return passwword;
	}

	public void setPasswword(String passwword) {
		this.passwword = passwword;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}
	
	
}
