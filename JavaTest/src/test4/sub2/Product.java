package test4.sub2;

public class Product {
	
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
		public void updatePrice(int newPrice) { //메서드의 기본은 public
			this.price = newPrice;
			System.out.println("키보드 가격 수정 됨");
		}
		public void addStock(int stock) {
			this.quantity += stock;
			System.out.println("키보드 "+stock+"개 재고 추가 됨");
		}
		
		public void printProductInfo() {
			System.out.println("상품 ID : " + productId);
			System.out.println("상품이름 : " + productName);
			System.out.println("상품가격 : " + price);
			System.out.println("재고수량 : " + quantity);
		
		
	}
}

