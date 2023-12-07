package demo;

public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;
	
	
	public TamGiac() {
		
	}
	
	public TamGiac(Diem A, Diem B, Diem C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public float chuVi() {
		float AB = A.kc(B);
		float BC = B.kc(C);
		float CA = C.kc(A);
		return (AB + BC + CA);
	}
	
	public float dienTich() {
		float AB = A.kc(B);
		float BC = B.kc(C);
		float CA = C.kc(A);
		float p = (AB + BC + CA)/2;
		float dt = (float)Math.sqrt(p * (p-AB) * (p-BC) * (p-CA));
		return dt;
	}
	
	public static void main(String[] args) {
		Diem A = new Diem();
		Diem B = new Diem(3,0);
		Diem C = new Diem(0,4);
		TamGiac tg = new TamGiac(A,B,C);
		System.out.println("Dien tich: " + tg.dienTich());
		System.out.println("Chu vi: " + tg.chuVi());
	}
}
