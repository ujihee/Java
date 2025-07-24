package sub3;

public class Count {
	
	private int num = 0;
	
	public int getnum() {
		return num;	
	}
	
	//synchronized : 동기화 블럭, 스레드의 경합(Race Condition)을 막고 순차적으로 스레드 실행
	public synchronized void setNum() {
		//임계영역 : 하나의 스레드가 해당 영역에 들어올 때 Lock을 걸고 영역을 빠져나갈 때 해제
		this.num++; //num값을 5050까지 누적-thread에서
	}//싱크로나이즈 없을 땐 count1,2,3값이 순서없이 되기 때문에 값이 300으로 고정되지 않는다.
	//싱크로나이즈 넣으면 100을 세번 반복하니까 무조건 값이 300 고정
}
