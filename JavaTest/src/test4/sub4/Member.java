package test4.sub4;

public class Member {

	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}								//매개변수 :메서드 호출 시 외부에서 값을 받아오는 변수
									//지역변수 : 메서드 내부에서 새로 선언하는 변수
	public void borrowBook(Book book) {//Book = 데이터타입(자료형)
									  //book = 매개변수명
	    borrowedBook = book;		 //Book book= Book 타입의 book이라는 매개변수
		book.borrowBook(); //book 객체의 borrowbook()메서드를 호출하라
		                   //그 책의 isBorrowed 상태를 true로 변경-즉 이 책을 대출중 상태로 바꿔라는 의미
	}									// borrowedBook = book;-대출한 책 저장
										//book.borrowBook(); -책의 대출 상태를 true로 변경	
	
	public void returnBook(Book book) {
		borrowedBook = null; //borrowedbook은 현재 대출중인 책을 가리키는 변수
		book.returnBook();   //책을 대출하면 borrowedbook = 대출한 책 객체
							 //책을 반납하면 borrowedBook = null(빈 상태)
	}						//borrowedBook = null; -대출 중인 책 없음으로 초기화
						     //book.returnBook(); -책의 대출 상태를 false로 변경
	
	public void getMemberInfo() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("회원 ID : " + this.memberId);
		
		if(borrowedBook != null) {
			System.out.println("대출한 도서 : "+ borrowedBook.getTitle());
		}else {
			System.out.println("대출한 도서 : 없음");
			
			}
		}
	
	}

