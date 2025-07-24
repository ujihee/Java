package test5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test07 {
	public static void main(String[] args) {
		
		for(int count = 1; count <= 5; count++) {
			System.out.println(makelotto());
		}
	}
	
	public static Set<Integer>makelotto(){//메인메서드에서 직접호출하니까 여기도 static?
		
		Set<Integer>lottoSet = new HashSet<>();
		
		for(;;) { //while(true)와 같은 무한 반복
			int num = (int) Math.ceil(Math.random() * 45);
			lottoSet.add(num);
			
			if(lottoSet.size()== 6) {
				break;
			}
		}
		Set<Integer>treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}

}
