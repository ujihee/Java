package test2;
import java.util.Scanner;

/*
 * 날짜 : 2025/07/10
 * 이름 : 우지희
 * 내용 : 자바 메서드 연습문제
 */
public class Test6 {
	public static void intro () {//return값 없음 ->void
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
		
	}
	
	public static int input(Scanner sc, String name) {
		System.out.print("변수 " + name + "값 입력 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public static void result (int val) {
		System.out.println("덧셈 결과 : " + val);
		System.out.println("******* END *******");
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		intro(); //리턴값이 없기 때문에 호출만 하면 됨
		
		int a = input(scanner, "a");
		int b = input(scanner, "b");
		
		int output = add(a, b);
		
		result(output);//위와 같음
		
		scanner.close();
	}

}
