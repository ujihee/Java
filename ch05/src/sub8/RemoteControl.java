package sub8;

//abstract 아이콘은 a, interface 아이콘은 i : 클래스에 표시됨
//인터페이스 - 클래스 구현을 위한 오직 추상 메서드만 갖는 구조체
public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();// abstract 생략
	public void chDown();
	
	public void soundUp();
	public void soundDown();

}
