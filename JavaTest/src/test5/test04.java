package test5;

public class test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";//구분자.을 기준으로 앞이 이름 뒤가 확장자
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx);//idx부터 마지막까지
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");//공백이 있고 숫자가 있기 때문에 공백처리를 해줘야함
												// 1. ", "- 공백을 넣어준다.			
		int total = 0;							// 2. trim()을 넣어준다.
		
		for(String score : scores) {
			total += Integer.parseInt(score.trim()); //문자열을 원시타입으로
		}
		System.out.println("strScores 총점 : " + total);
	}

}
