package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2025/07/25
 * 이름 : 우지희
 * 내용 : 자바 Insert 실습하기
 */
public class InsertTest {
	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; //주소체계는 이대로 지켜야함
		String user = "tmfflavndn";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
			// 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
		
			// SQL 실행 개체 생성(Statement, PreparedStatement) 후자를 저 많이씀
			Statement stmt = conn.createStatement(); //statement는 java.sql
		
			// SQL 실행
			String sql = "INSERT INTO USER1 VALUES('J101', '김유신', '010-1212-2221', 31)";
			stmt.executeUpdate(sql);
		
			// 결과처리(SELECT문 일 경우)
		
			// 데이터베이스 종료
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//데이터베이스 종료
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Insert 완료...");
	}

}
