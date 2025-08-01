import java.io.File;
import java.io.IOException;

public class C0801_02_복습_예외처리_파일폴더생성 {

	public static void main(String[] args) throws Exception {
		
		String folder = "c:/aaa/";
		File fo = new File(folder);
		if(!fo.exists()) {
			fo.mkdirs(); //폴더생성
			System.out.println("폴더가 생성되었습니다.");
		}
		
		
		File f = new File("c:/aaa/aabb.txt");
		f.createNewFile(); //에러가 남.
		System.out.println("파일이 생성되었습니다.");
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
		
//		File f = new File("c:/ddd/aabbcc.txt"); //폴더,파일에 대한처리 객체
//		//파일생성 메소드 - try~catch
//		try {
//			f.createNewFile();  //파일만 생성 - 폴더는 생성을 하지 않음.
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램이 종료되었습니다.");
		

	}

}