package test5;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Member{
	
	String id;
	String name;
	int age;
	
	public Member(String id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + age;
	}
}

public class test08 {
	public static void main(String[] args) {
		
		Member m1 = new Member("a101", "김유신", 23);
        Member m2 = new Member("a102", "김춘추", 21);
        Member m3 = new Member("a103", "장보고", 33);
        
        ArrayList<Member> memberlist = new ArrayList<>();
        memberlist.add(m1);
        memberlist.add(m2);
        memberlist.add(m3);
        
        for(Member m : memberlist) {
        	System.out.println(m);
        }
		
	}

}
