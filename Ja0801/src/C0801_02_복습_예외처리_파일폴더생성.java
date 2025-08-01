import java.io.File;

public class C0801_02_복습_예외처리_파일폴더생성 {

	public static void main(String[] args) throws Exception {	//throws Exception 예외 던짐
		// 예외처리 - 폴더/파일 생성
		
		String folder = "c:/aaa/";
		File fo = new File(folder);
		if (!fo.exists()) {
			fo.mkdirs();	// 폴더생성
			System.out.println("폴더가 생성되었습니다.");
		}
		
		File f = new File("c:/aaa/aabb.txt");
		f.createNewFile();	// 에러남.
		System.out.println("파일이 생성되었습니다.");
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
		
		
		
//		File f = new File("c:/down/aabbcc.txt");	// 폴더, 파일에 대한 처리 객체	- 폴더 여부 확인, 생성, 삭제 등
//		try {
//			f.createNewFile();	// 파일생성 메소드 => try-catch문 필수, 폴더 생성 x (파일만 생성)
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램이 종료되었습니다.");
		
		
		
		
	}

}
