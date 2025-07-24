package test5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*10)+1;
		int input = 0, count = 0;
		
		do {
			count++;
			System.out.println("----------------------");
			System.out.print("1 ~ 10 사이 값 입력 : ");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(input < 0) {
					throw new Exception("음수는 입력할 수 없습니다."); //throws는 메서드에 선언하는 것
				}
			} catch (InputMismatchException e) { //숫자가 아닌 것을 입력할 때
				System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
				continue;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			if(answer > input) {
				System.out.println("더 큰수 입력하세요.");
			}else if(answer < input) {
				System.out.println("더 작은수 입력하세요.");
			}else {
				System.out.println(answer + "정답입니다!");
				System.out.println("횟수 " + count + "회");
				break;
			}
			
		}while(true);
		System.out.println("프로그램 종료...");
		
	}

}
