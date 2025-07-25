package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/07/25
 * 이름 : 우지희
 * 내용 : 자바 Update 실습하기
 */
public class UpdateTest {
	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; //주소체계는 이대로 지켜야함
		String user = "tmfflavndn";
		String pass = "1234";
		
		try {
			//데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			//SQL 실행
			String sql = "UPDATE USER1 SET AGE = 35 WHERE USER_ID='J101'";//쿼리가 제일 중요
			stmt.executeUpdate(sql);
			
			//결과처리(SELECT일 때)
			
			//데이터 베이스 종료
			stmt.close();
			conn.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
		
	}

}
