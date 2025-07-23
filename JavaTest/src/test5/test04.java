package test5;

public class test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.lastIndexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(", ");
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score);
		}
		System.out.println("strScores 총점 : " + total);
	}

}
