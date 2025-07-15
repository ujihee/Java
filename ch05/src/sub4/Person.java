package sub4;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {//반환타입은 모르니까 일단 void
		this.name = name;
		this.age = age;
	}
	public void work(){
		System.out.println("Person is working");
	}
	public void introduce() {
		System.out.println("제 이름은 ["+name+"] 이고, 나이는 ["+age+"]세 입니다.");
	}
	

}
