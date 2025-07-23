package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 우지희
 * 내용 : 버퍼 스트림 실습
 */
public class BufferStreamTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\GGG\\Desktop\\Person.tif";
		String target = "C:\\Users\\GGG\\Desktop\\Person2.tif";
		
		try {
			// 기본 스트림 생성(파일 연결) 
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림(Buffer) 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//무한반복으로 스트림 작업 수행-파일크기가 얼마인지 모르기 때문에 무한반복
			while(true) {
				
				//파일 읽기
				int data = fis.read();
				
				if(data == -1 ) {
					//파일 내용이 없으면
					break;
				}
				
				//파일 쓰기
				bos.write(data);
				
			}
			
			//스트림 작업 종료
			bis.close();
			bos.close();
			
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}

	}

