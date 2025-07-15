package sub4;

public class StockAccount extends Account {
	
	private String stock; //속성은 파란색
	private int amount;
	private int price;

	public StockAccount(String bank, String id, String name, int balance, String stock, int amount, int price) {
		super(bank, id, name, balance);
		
		this.stock = stock; //this 참조 키워드가 없으면 의미가 없어짐 위의 속성을 참조
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price; //balance에 에러-참조를 못하고 있음
	}
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;
	}
	public void show() {
		System.out.println("증권사 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("주식종목 : " + this.stock);
		System.out.println("현재수량 : " + this.amount);
		System.out.println("현재가격 : " + this.price);
	}

}
