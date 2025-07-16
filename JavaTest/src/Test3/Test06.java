package Test3;

class Adder{
	private static Adder instance = new Adder();
	public static Adder getInstance(){
		return instance;
	}
	private Adder() {}//생성자 앞에는 접근 권한-싱글톤이니까 프라이배잇
	
	private Adder(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) { //오버로드
		this.x += x;
		y++;
	}
	
	public void add(int[] arr) {//배열인덱스 참조
		this.x += arr[0];
		this.y += arr[1];
	}
	public static void add(Adder a2) {//a2 객체
		a2.x += 10;
	}
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	public void show() {
		System.out.println("-------------");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
public class Test06 {
	public static void main(String[] args) {
		
		Adder a1 = Adder.getInstance(); //private이라서 new로 못불러옴
		
		a1.add(1, 2);
		a1.show();
		
		int[]arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1, 3);
		a1.show();
	}

}
