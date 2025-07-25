package test4.sub4;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowed;
	
	public Book(String title, String author, String isbn) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = false; //책이 처음에는 도서관에 있어야 하니까 false로 초기화
	}
	
	public void borrowBook() {
		
		if(this.isBorrowed) {
			System.out.println(this.title + " 이미 대출됨"); //true면 이미 대출된 상태이므로
		}else {											//이미 대출됨 메시지 출력				
			this.isBorrowed = true;							//isBorrowed가 false면
			System.out.println("도서대출 : " + this.title); //is Borrowed를 true로 변경하고
		}													//도서대출 메시지 출력
	
	}
	public void returnBook() {
		this.isBorrowed = false;
		System.out.println("도서반납 : " + this.title);
	}
	
	public void getBookInfo() {
		System.out.println("제목 : "+this.title);	
		System.out.println("저자 : "+this.author);	
		System.out.println("ISBN : "+this.isbn);
		System.out.println("대출여부 : "+ (this.isBorrowed ? "불가능" : "가능"));
}
	public String getTitle() {
	return title;
}	
	

}
