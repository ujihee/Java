package test4.sub5;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	public void enrollSubject(Subject subject) {//과목 수강 신청
		
		subjects[subjectCount] = subject; //subjects 배열의 subjectCount 인덱스에 전달받은 subject를 저장
										//예: 처음 신청이면 subjects[0] = 자바
		subject.addStudent(this);		//과목의 students 배열에 학생 추가
										//과목 쪽에서도 이 학생을 등록해야 하므로,Subject 클래스의 addStudent(Student std)를 호출하면서 this(자기 자신)를 전달합니다.
		scores[subjectCount++] = 0;   // 성적 배열에 기본값 0 저장 후 subjectCount 증가
		
		System.out.println(name + " - " + subject.getSubName() + " 과목 신청 완료");
	}
	
	public void setScore(Subject subject, int score) {//특정 과목 점수 설정
		
		for(int i=0 ; i < subjectCount ; i++) { //학생이 지금까지 신청한 과목 수만큼 순회하면서
			
			if(subjects[i].equals(subject)){ // 배열원소의 subject와 입력된 subject가 같으면
				scores[i] = score;			//subjects[i]가 전달받은 과목과 같다면 같은 위치의 scores[i]에 전달받은 점수를 저장
				
				System.out.println(name + " - " + subject.getSubName() + " 점수 입력 완료");
			}
		}
	}
	public void printStudentInfo() {
		
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적" );
		
		for(int i=0 ; i <subjectCount ; i++) {
			System.out.println(" - " + subjects[i].getSubName() + " : " + scores[i]);
		}
	}
	public String getName() {
		return name;
	}

}
