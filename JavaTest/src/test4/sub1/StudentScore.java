package test4.sub1;

public class StudentScore {

	//속성
	private String studentName; //상속이 없으면 protected 쓸 필요X
	private String studentId; //카멜표기법 소문자로 시작하지만 다른 명사에 대문자..?
	private String subject;
	private double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double newScore) {
		if(newScore >= 0 && newScore <= 100) {
			this.score = newScore;
		}else {
			System.out.println("유효하지 않은 점수 입력");
		}
	}
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("학생 이름: " + studentName);
		System.out.println("학생 ID: " + studentId);
		System.out.println("과목명: " + subject);
		System.out.println("점수: " + score);
	}
	
	
	
}
