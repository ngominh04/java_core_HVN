package nhansu;

import java.util.Scanner;


public class Subject {
	String subjectCode;
	String subjectName;
	int credit; // số tín chỉ
	float attendanceMark; // điểm chuyên cần
	float midExammark; // điểm giữa kì
	float finalExammark; // điểm cuối kì
	float subjectMark; // điểm môn học hệ 10
	float calConversionMark; // tính điểm thang 4
	String calGrade; // quy đổi điểm ra thang chữ
//	float diemTrungBinh; // Điểm trung bình học kì 
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(String subjectCode, String subjectName, int credit) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.credit = credit;
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập mã môn học: ");
		this.subjectCode = input.nextLine();
		System.out.println("Nhập tên môn học: ");
		this.subjectName = input.nextLine();
		System.out.println("Nhập số tín chỉ môn học: ");
		this.credit = input.nextInt();input.nextLine();
	}
	
	public float calSubjectMark() {
		subjectMark = (attendanceMark+midExammark*3+finalExammark*6)/10;
		return subjectMark;
	}
	
	public float calConversionMark() {
		float ConversionMark = 0;
		if(subjectMark <= 3.9) {
			calConversionMark = 0;
		}
		if(subjectMark > 3.9 && subjectMark <= 4.9) {
			calConversionMark = 1;
		}
		if(subjectMark > 4.9 && subjectMark <= 5.4) {
			calConversionMark = 1.5f;
		}
		if(subjectMark > 5.4 && subjectMark <= 6.4) {
			calConversionMark = 2;
		}
		if(subjectMark > 6.4 && subjectMark <= 6.9) {
			calConversionMark = 2.5f;
		}
		if(subjectMark > 6.9 && subjectMark <= 7.4) {
			calConversionMark = 3;
		}
		if(subjectMark > 7.4 && subjectMark <= 8.4) {
			calConversionMark = 3.5f;
		}
		if(subjectMark > 8.4) {
			calConversionMark = 4;
		}
		return calConversionMark;
		
	}
	public String calGrade() {
		if(subjectMark <= 3.9) {
			calGrade = "F";
		}
		if(subjectMark > 3.9 && subjectMark <= 4.9) {
			calGrade = "D";
		}
		if(subjectMark > 4.9 && subjectMark <= 5.4) {
			calGrade = "D+";
		}
		if(subjectMark > 5.4 && subjectMark <= 6.4) {
			calGrade = "C";
		}
		if(subjectMark > 6.4 && subjectMark <= 6.9) {
			calGrade = "C+";
		}
		if(subjectMark > 6.9 && subjectMark <= 7.4) {
			calGrade = "B";
		}
		if(subjectMark > 7.4 && subjectMark <= 8.4) {
			calGrade = "B+";
		}
		if(subjectMark > 8.4) {
			calGrade = "A";
		}
		return calGrade;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public float getAttendanceMark() {
		return attendanceMark;
	}
	public void setAttendanceMark(float attendanceMark) {
		if(attendanceMark >= 0 && attendanceMark <= 10) {
			this.attendanceMark =attendanceMark;
		}else {
			System.out.println("Lỗi điểm chuyên cần");
		}
	}
	public float getMidExammark() {
		return midExammark;
	}
	public void setMidExammark(float midExammark) {
		this.midExammark = midExammark;
	}
	public float getFinalExammark() {
		return finalExammark;
	}
	public void setFinalExammark(float finalExammark) {
		this.finalExammark = finalExammark;
	}
	
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit
				+ ", attendanceMark=" + attendanceMark + ", midExammark=" + midExammark + ", finalExammark="
				+ finalExammark + ", subjectMark=" + subjectMark + ", calConversionMark=" + calConversionMark
				+ ", calGrade=" + calGrade + "]";
	}
	
	
	
}
