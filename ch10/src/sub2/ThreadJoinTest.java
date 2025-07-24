package sub2;

/*
 * 날짜 : 2025/07/24
 * 이름 : 우지희
 * 내용 : 자바 스레드 실습하기
 */

class WorkThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i =1 ; i<=10 ; i++) {
			
			System.out.println("WorkThread - " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadJoinTest {
	
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		//작업 스레드 실행
		work.start();
		
		
		try {//--이 구문이 없을 땐 main이 끝났는데도 자식스레드가 계속 생성됨 : 좀비 생성
			//작업 스레드 종료 대기
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}
