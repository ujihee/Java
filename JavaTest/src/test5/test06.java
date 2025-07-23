package test5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class test06 {
	public static void main(String[] args) {
		
		printList(createList());
	}
	
	public static void printList(ArrayList<Integer>scoreList) {
		int total = 0;
		int size = scoreList.size();
		
		for(int i=0 ; i<size ; i++) {
			int score = scoreList.get(i);
			total += score;
			System.out.print(score);
			
			if(i == size -1) {
				System.out.println(" = ");
			}else {
				System.out.println(" + ");
			}
		}
		System.out.println(total);
		
	}
	
	public static ArrayList<Integer>createList(){
		ArrayList<Integer>scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1; i<=10; i++) {
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		return scoreList;
	}

}
