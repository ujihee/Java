package p189;
/*
 * 날짜 : 2025/07/18
 * 이름 : 우지희
 * 내용 : 교재 p189 클래스 실습하기
 */
import java.util.Scanner;

class RectangleApp {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		
		RectangleApp rect = new RectangleApp();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();
		
	}

}
