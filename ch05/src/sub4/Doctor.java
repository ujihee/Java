package sub4;

public class Doctor extends Person{
	
	private String spectialty;
	
	public Doctor(String name, int age, String specialty) {
		super(name, age);
		this.spectialty = specialty;
	}
	
	public void work() {
		
		super.introduce();
		System.out.println("의사이고 전공은 [" +spectialty+ "] 입니다.");
	}

}
