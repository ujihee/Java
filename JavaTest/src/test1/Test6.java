package test1;
import java.util.Scanner;

/*
 * 날짜 : 2025/07/09
 * 이름 : 우지희
 * 내용 : 자바 자료형 연습문제
 */

public class Test6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = scanner.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = scanner.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
			
		}
		
	}


