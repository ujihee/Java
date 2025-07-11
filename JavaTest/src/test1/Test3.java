package test1;

/*
 * 날짜 : 2025/07/09
 * 이름 : 우지희
 * 내용 : 자바 자료형 연습문제
 */
public class Test3 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0; //int result; 만 해도 답이 나오긴 함
		
		result = num++; //넘값을 연산해야되니까 선언이 아니라 초기화까지 해야되ㅐㅁ
		System.out.println("result : " + result);
		
		result = ++num;
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}

}
