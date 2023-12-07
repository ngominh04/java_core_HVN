package demo;

public class Diem {
	float x;
	float y;
	
	public Diem() {
		this.x = 0;
		this.y = 0;
	}
	
	public Diem(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float kc(Diem d) {
		float kc = (float)Math.sqrt((d.x - x)*(d.x - x) + (d.y - y)*(d.y - y));
		return kc;
	}
	
	public void inDiem() {
		System.out.println("(" +  x + "," + y + ")");
	}
}
