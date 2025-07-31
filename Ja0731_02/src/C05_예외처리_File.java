import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_예외처리_File {

	public static void main(String[] args) {
//		File f = new File("c:/down/a.txt");
//		int 
		try {
			// 1byte 가지고 와서 출력
			FileInputStream fis = new FileInputStream("c:/down/a.txt");
			int read = 0;
			try {
				while( (read = fis.read() ) != -1) {
					System.out.println((char)read);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 잘 종료되었습니다.");
		

	}

}