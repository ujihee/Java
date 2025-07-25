package step3;
/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
 */
import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println((A + B));
		}
	}
}

//while(scanner.hasNextInt()): 다음에 읽을 수 있는 정수가 있는지 확인

//입력이 더 있으면 true를 반환하여 반복 계속
//입력이 끝나면 false를 반환하여 반복 종료 (EOF 도달)