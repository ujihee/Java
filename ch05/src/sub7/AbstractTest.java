package sub7;
/*
 * 날짜 : 2025/07/16
 * 이름 : 우지희
 * 내용 : 추상클래스 실습하기
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		
		//추상클래스는 객체 생성 불가
		//Animal animal = new Animal();
		
		Animal tiger = new Tiger(); // Tiger tiger 로 해도 실행은 잘 됨. 하지만 어딘가 부족함..?
		Animal eagle = new Eagle();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
	}

}
