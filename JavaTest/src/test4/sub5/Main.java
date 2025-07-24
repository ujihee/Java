package test4.sub5;

public class Main {
	public static void main(String[] args) {
		
		Subject java = new Subject("자바");
        Subject database = new Subject("데이터베이스");
        
        Student student1 = new Student("김유신", "S001");
        Student student2 = new Student("김춘추", "S002");
        
        // 학생 과목 수강 신청
        student1.enrollSubject(java); //김유신이 자바 수강
        student1.enrollSubject(database);//김유신이 데이터베이스 수강
        System.out.println("-------------------------");
        
     // 학생 과목 수강 신청
        student2.enrollSubject(java); 
        student2.enrollSubject(database);
        System.out.println("-------------------------");
        
        // 성적 입력
        student1.setScore(java, 96);//김유신의 자바 점수 96점
        student1.setScore(database, 90);//김유신의 데이터베이스 점수 90점
        System.out.println("-------------------------");//student의 enrollSubject 메소드 호출
        
        // 성적 입력
        student2.setScore(java, 86);
        student2.setScore(database, 76);
        System.out.println("-------------------------");
        
        // Subject 정보 출력
        java.printSubjectInfo();        
        System.out.println("-------------------------");
        
        // Subject 정보 출력
        database.printSubjectInfo();
        System.out.println("-------------------------");
                
        // 학생 정보 출력
        student1.printStudentInfo();
        System.out.println("-------------------------");
        
        // 학생 정보 출력
        student2.printStudentInfo();
        System.out.println("-------------------------");
	}

}
