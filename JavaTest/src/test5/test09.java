package test5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Orange{
	private String country;
	private int price;
	
	public Orange(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : " + country + ", 가격 : " + price);
	}
	
}
public class test09 {
	public static void main(String[] args) {
		
		ArrayList<Orange>list1 = new ArrayList<>();
		list1.add(new Orange("파주", 3000));
		list1.add(new Orange("수원", 3000));
		
		ArrayList<Orange>list2 = new ArrayList<>();
		list2.add(new Orange("청주", 3000));
		list2.add(new Orange("충주", 3000));
		
		ArrayList<Orange>list3 = new ArrayList<>();
		list3.add(new Orange("밀양", 3000));
		list3.add(new Orange("함안", 3000));
		
		HashMap<String, List<Orange>> map = new HashMap<>();
		map.put("gyeogngi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		List<Orange>list = map.get("gyungnam");
		Orange orange = list.get(0);
		orange.show();
		
		map.get("gyeonggi").get(1).show();
		map.get("chungbuk").get(0).show();
		
		
	}

}
