package test1;
import java.util.Scanner;

/*
 * 날짜 : 2025/07/09
 * 이름 : 우지희
 * 내용 : 자바 자료형 연습문제
 */
public class Test2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int    year;
		int    birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = scanner.nextInt();
		
		System.out.print("태어난 년도 입력 : ");
		birth = scanner.nextInt();
		
		System.out.print("이름 입력 : ");
		name = scanner.nextLine();//난 next만 했는데 뭐가 다른거지..
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		
		scanner.close();
	}

}
