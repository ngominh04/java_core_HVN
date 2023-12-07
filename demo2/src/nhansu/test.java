package nhansu;

import java.util.Scanner;

public class test {
	Scanner input = new Scanner(System.in);
	void input() {
		System.out.println("Nhập mã môn học: ");
		this.subjectCode=input.nextLine();
		System.out.println("Nhập tên môn học: ");
		this.subjectName=input.nextLine();
		System.out.println("Nhập số tín chỉ môn học: ");
		this.credit = input.nextInt();
		input.nextLine();
		System.out.println("Nhập điểm chuyên cần: ");
		this.attendanceMark=input.nextFloat();
		input.nextLine();
		System.out.println("Nhập điểm Giữa kì: ");
		this.midExammark=input.nextFloat();
		input.nextLine();
		System.out.println("Nhập điểm cuối kì: ");
		this.endExammark=input.nextFloat();
		input.nextLine();
	}
	void tinhDiem() {
		this.diemMonHoc= ((attendanceMark+midExammark*3+endExammark*6)/10);
	}
	void quyDoiDiemHe4() {
		if(diemMonHoc <= 3.9) {
			this.calConversionMark = 0;
		}
		if(diemMonHoc > 3.9 && diemMonHoc <= 4.9) {
			this.calConversionMark = 1;
		}
		if(diemMonHoc > 4.9 && diemMonHoc <= 5.4) {
			this.calConversionMark = 1.5f;
		}
		if(diemMonHoc > 5.4 && diemMonHoc <= 6.4) {
			this.calConversionMark = 2;
		}
		if(diemMonHoc > 6.4 && diemMonHoc <= 6.9) {
			this.calConversionMark = 2.5f;
		}
		if(diemMonHoc > 6.9 && diemMonHoc <= 7.4) {
			this.calConversionMark = 3;
		}
		if(diemMonHoc > 7.4 && diemMonHoc <= 8.4) {
			this.calConversionMark = 3.5f;
		}
		if(diemMonHoc > 8.4) {
			this.calConversionMark = 4;
		}
	}
	void quyDoiDiemThangChu() {
		if(calConversionMark == 0) {
			this.calGrade = "F";
		}
		if(calConversionMark == 1) {
			this.calGrade = "D";
		}
		if(calConversionMark == 1.5) {
			this.calGrade = "D+";
		}
		if(calConversionMark == 2) {
			this.calGrade = "C";
		}
		if(calConversionMark == 2.5) {
			this.calGrade = "C+";
		}
		if(calConversionMark == 3) {
			this.calGrade = "B";
		}
		if(calConversionMark == 3.5) {
			this.calGrade = "B+";
		}
		if(calConversionMark == 4) {
			this.calGrade = "A";
		}
	}

	
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit
				+ ", attendanceMark=" + attendanceMark + ", midExammark=" + midExammark + ", endExammark=" + endExammark
				+ ", diemMonHoc=" + diemMonHoc + ", calConversionMark=" + calConversionMark + ", calGrade=" + calGrade
				+ "]";
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
		this.attendanceMark = attendanceMark;
	}
	public float getMidExammark() {
		return midExammark;
	}
	public void setMidExammark(float midExammark) {
		this.midExammark = midExammark;
	}
	public float getEndExammark() {
		return endExammark;
	}
	public void setEndExammark(float endExammark) {
		this.endExammark = endExammark;
	}
	public float getDiemMonHoc() {
		return diemMonHoc;
	}
	public void setDiemMonHoc(float diemMonHoc) {
		this.diemMonHoc = diemMonHoc;
	}
	public float getCalConversionMark() {
		return calConversionMark;
	}
	public void setCalConversionMark(float calConversionMark) {
		this.calConversionMark = calConversionMark;
	}
	public String getCalGrade() {
		return calGrade;
	}
	public void setCalGrade(String calGrade) {
		this.calGrade = calGrade;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	void display() {
//		System.out.println("Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit
//				+ ", attendanceMark=" + attendanceMark + ", midExammark=" + midExammark + ", endExammark=" + endExammark
//				+ ", diemMonHoc=" + diemMonHoc + ", calConversionMark=" + calConversionMark +
//				 ", calGrade=" + calGrade + "]");
				
	}
}
