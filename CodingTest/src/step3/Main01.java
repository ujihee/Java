package step3;
/*
 * 날짜 : 2025/07/11
 * 이름 : 우지희
 * 내용 : 백준 3단계 1번 문제 
 
문제
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

출력
출력형식과 같게 N*1부터 N*9까지 출력한다.
 */
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(N +" * "+i+" = "+N*i);
				
			}
		}
	}

//난 for문에 n=2로 넣어서 적어야 되는 줄알았는데 그건 두 번 선언하는 것과같음
//그냥 변수 n만 선언만 해주면 되는거였음
