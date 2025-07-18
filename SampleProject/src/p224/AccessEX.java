package p224;

class Sample {
	public int a;
	private int b;
	int c;//default
	protected int d;
}// 이 클래스 내에서만 private 접근 가능

class Sub extends Sample {
	public void method() {
		d = 10;
	}//자식클래스에서 부모클래스 참조 할 수 있는 protected
	
}
public class AccessEX {
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;
		sample.c = 10; //같은 패키지에서는 접근 가능
	}

}
