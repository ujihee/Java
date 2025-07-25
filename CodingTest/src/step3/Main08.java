package step3;

import java.util.Scanner;

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */

public class Main08 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int i = 1 ; i <= T ; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int C = A + B;
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
		}
	}

}
