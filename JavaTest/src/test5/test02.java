package test5;

import java.util.Scanner;


class NotfoundException extends Exception {
	public NotfoundException() {
		super("입력한 숫자를 찾을 수 없습니다!");
	}
}
public class test02 {
	public static void searchArray(int find, int[] arr) throws NotfoundException {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		throw new NotfoundException(); //못찾으면 notfound로 던짐-예외를 발생시킴
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("입력한 숫자를 찾았습니다.");
			
		} catch (NotfoundException e) {
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
		}
		System.out.println("프로그램 종료...");
	}

}
