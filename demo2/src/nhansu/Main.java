package nhansu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.security.sasl.SaslException;

public class Main {
	
	static Map<String, Subject> map = new HashMap<String, Subject>();
	void menu() {
		System.out.println("1. Nhập sinh viên\n2. Nhập giang viên\n3. In ra số sinh viên\n4. In ra những giảng viên đang có\n5. Sửa môn học của sinh viên\n6. Exit");
	}
	static List<Student> list = new ArrayList<Student>();
	static List<Lecturar> listLecturars = new ArrayList<>();
	static List<Subject> list1 = new ArrayList<Subject>();
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Main main=new Main();
		
		int numStudent; // số sinh viên
		int numLeturar; // số giảng viên
		int numSubject; // số môn học
		int chon;
		do {
			main.menu();
			System.out.println("Nhập số bạn muốn chọn: ");
			chon = input.nextInt();input.nextLine();
			switch (chon) {
			case 1: {
				System.out.println("Nhập số sinh viên muốn thêm:");
				numStudent = input.nextInt();input.nextLine();
				for (int i = 0; i < numStudent; i++) {
					Student student = new Student();
					student.input();
					System.out.println("Nhập số môn học muốn thêm điểm: ");
					numSubject = input.nextInt();input.nextLine();
					main.addSubject(numSubject);
					list.add(student);	
				}
				break;
			}
			case 2:{
				System.out.println("Nhập số giảng viên muốn thêm:");
				numLeturar = input.nextInt();input.nextLine();
				for (int i = 0; i < numLeturar; i++) {
					Lecturar lecturar = new Lecturar();
					lecturar.input();
					listLecturars.add(lecturar);	
				}
				break;
			}
			case 3:{
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Sinh viên thứ "+(i+1));
					System.out.println(list.get(i));
					System.out.println(main.getAllItem());
//					main.getAllItem();
				}
				break;
			}
			case 4:{
				for (int i = 0; i < listLecturars.size(); i++) {
					System.out.println("Giảng viên thứ "+(i+1));
					System.out.println(listLecturars.get(i));
				}
				break;
			}
			case 5:{
				main.updateSubject();
				break;
			}
			case 6:{
				String codeStudent; // mã sinh viên 
				System.out.println("Nhập mã sinh viên muốn xóa môn học:");
				codeStudent = input.nextLine();
				String codeSubject; // mã môn học
				System.out.println("Nhập mã môn học muốn xóa:");
				codeSubject = input.nextLine();
				for (Student student : list) {
					if(student.code.equals(codeStudent)) {
//						System.out.println(student);
						for (Subject subject : list1) {
							if(subject.subjectCode.equals(codeSubject)) {
								map.remove(subject.subjectCode);
								System.out.println("Bạn đã xóa thành công");
							}
						}
					}	
				}
				break;
			}
			default:
				System.out.println("Bạn đã thoát thành công");
				return;
			}
			
		} while (true);
	}
	
	
	void addSubject(int numSubject) {
		float attendanceMark; // điểm chuyên cần
		float midExammark; // điểm giữa kì
		float finalExammark; // điểm cuối kì
		Scanner input=new Scanner(System.in);
		
		for (int j = 0; j < numSubject; j++) {
			Subject subject1 = new Subject();
			subject1.input();
			System.out.println("Nhập điểm chuyên cần: ");
			attendanceMark = input.nextFloat();input.nextLine();
			System.out.println("Nhập điểm giữa kì: ");
			midExammark = input.nextFloat();input.nextLine();
			System.out.println("Nhập điểm cuối kì: ");
			finalExammark = input.nextFloat();input.nextLine();
			subject1.setAttendanceMark(attendanceMark);
			subject1.setMidExammark(midExammark);
			subject1.setFinalExammark(finalExammark);
			subject1.calSubjectMark();
			subject1.calConversionMark();
			subject1.calGrade();
			
			list1.add(subject1);
			
			
			Subject subject2 = map.get(subject1.getSubjectCode());
			if(subject2 == null) {
				map.put(subject1.getSubjectCode(), subject1);
			}else {
				subject2.setAttendanceMark(attendanceMark);
				subject2.setCredit(subject1.credit);
				subject2.setSubjectCode(subject1.subjectCode);
				subject2.setSubjectName(subject1.subjectName);
				subject2.setMidExammark(midExammark);
				subject2.setFinalExammark(finalExammark);
			}
		}
	}
	
	public void updateSubject() {
		String codeStudent; // mã sinh viên 
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập mã sinh viên muốn sửa:");
		codeStudent = input.nextLine();
		String codeSubject; // mã môn học
		System.out.println("Nhập mã môn học muốn sửa:");
		codeSubject = input.nextLine();
		for (Student student : list) {
			
			if(student.code.equals(codeStudent)) {
				System.out.println(student);
				for (Subject subject : list1) {
					if(subject.subjectCode.equals(codeSubject)) {
						System.out.println(subject);
					}
				}
			}	
		}
	}
	

//	public void getAllItem(){
//        for (int i = 0; i < list1.size(); i++) {
////			System.out.println(list1.get(i));
//			// in ra theo kiểu hash map
//			Collection<Subject> a= map.values();
//			System.out.println(a);
//		}
//    }
	
	public Collection<Subject> getAllItem() {
		return map.values();
	}
}
