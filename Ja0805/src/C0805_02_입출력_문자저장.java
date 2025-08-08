import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C0805_02_입출력_문자저장 {

	public static void main(String[] args) throws Exception {
		
		
		// 글자 저장
		File f = new File("c:/aaa/a0805_01.txt");
		String content = "1,홍길동,100,100,100,300,100.0";
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(content.getBytes());	// write -> byte단위로 저장
		
		fos.close();
		System.out.println("글자저장 완료!");
		
		
//		--------- 파일복사
//		File f = new File("c:/img/");
//		if (!f.exists()) {
//			f.mkdirs();  // 폴더생성
//		}
//		// 파일읽어오기
//		FileInputStream fis = new FileInputStream("c:/aaa/a1.jpg");
//		// 파일저장하기
//		FileOutputStream fos = new FileOutputStream("c:/img/1.jpg");
//		while (true) {
//			int read = fis.read();
//			if (read== -1) break;
//			fos.write(read);	// 파일저장
//			
//		}
//		fis.close();
//		fos.close();
//		System.out.println("프로그램 종료");
		
		
		
//		--------- 글자출력 -----------
//		// 파일에 있는 글자를 읽어와서 출력
//		byte[] b = new byte[1024];
//
//		// 폴더, 파일이 존재하는지 확인
//		File f = new File("c:/aaa/a0805.txt");
//		// try-catch 예외처리
//		try {
//			FileInputStream fis = new FileInputStream();
//			int read = 0;
//			while ((read = fis.read()) != -1) {
//				System.out.println((char)read);	// char로 변환하면 글자를 읽어올수있음.
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램 종료!");
//		
//	}

	}
}
