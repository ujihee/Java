package test4.sub5;

public class Subject {
	
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student std) {//과목에 학생 추가
		
		students[studentCount++] = std;	//배열에 학생을 추가하고 studentCount를 증가시킨다.
	}
	
	public void printSubjectInfo() {//과목 정보와 수강생 목록 출력
		
		System.out.println("과목명 : " + subName);
		
		System.out.print("수강생 : ");
		
		for(int i=0 ; i<studentCount ; i++) {			
			
			System.out.print(students[i].getName() + ", ");	
	}
		
		System.out.println(); // 개행	
	}	
		
	public String getSubName() {
		
		return subName;
	}
	
}
	
	


