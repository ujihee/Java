package sub2;

/*
 * 날짜 : 2025/07/14
 * 이름 : 우지희
 * 내용 : 캡슐화 실습하기
 * 
 * 캡슐화(정보은닉, Encapsulation)
 * - 캡슐화는 객체의 속성을 외부에서 참조하지 못하게 객체의 속성을 은닉하는 특성
 * - 클래스의 속성을 반드시 private으로 선언
 * - private 선언을 하면 생성자(Constructor)로 속성을 초기화
 * - 은닉된 정보(속성)을 안전하게 사용하기 위해 Getter, Setter 사용
 */

public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		//객체생성
		Car sonata = new Car("소나타", "흰색", 0); // 생성자 호출
		
		//초기화 - 은닉된 속성(멤버변수)은 생성자(Constructor)로 초기화
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//객체 생성과 초기화
		Car avante = new Car("아반테", "검정색", 0);
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		//개별 속성이 은닉되어 있기 때문에 속성 수정 불가, Setter로 수정
		//avante.color = "남색";
		avante.setColor("남색");
		
		avante.show();
		
		//Account 객체 생성과 초기화 - (국민은행, 101-11-1001, 김유신, 10000)
		Account kb = new Account("국민은행", "101-11-1001", "김유신", 10000);
		kb.deposit(40000);
		kb.withdraw(20000);
		
		// 출력 30000
		kb.show();
		
		// 이름을 김유신 -> 김유진 수정
		kb.setName("김유진");
		kb.show();
	
		
		//Account 객체 생성과 초기화 - (우리은행, 101-21-2001, 김춘추, 30000)
		Account wr = new Account("우리은행", "101-21-2001", "김춘추", 30000);
		wr.deposit(40000);
		wr.withdraw(20000);
		
		// 출력 50000
		kb.show();
				
		// 은행명 수정 우리은행 -> 너희은행
		wr.setBank("너희은행");
		wr.show();
		
		Book book1 = new Book("삼국지", "나관중", "10001", 10);
		book1.show();
		
		boolean isOk = book1.borrowBook();
		
		if(isOk) {
			System.out.println(book1.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book1.getTitle() + "도서 대출 실패!");
		}
		book1.show();
		
		Book book2 = new Book("명품 Java", "황기태", "10002", 1);
		
		boolean isOk1 = book2.borrowBook();
		boolean isOk2 = book2.borrowBook();
		
		if(isOk2) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book2.getTitle() + "도서 대출 실패!");
		}
		
		book2.show();
	}

}
