package demo;


public class Demo {
	
	public static void main(String[] args) {
		float x= 10;
		float y = 10;
		
//		float kc = (float)Math.sqrt((d.x - x)*(d.x - x) + (d.y - y)*(d.y - y));
		float kc = (float) Math.sqrt(x+y);
		System.out.print(x+" "+y+"\n");
		System.out.print(kc);
	}
}
