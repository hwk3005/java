import java.io.BufferedReader;
import java.io.FileReader;

public class C07_풀이_예외처리_File {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:/down/aaa.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		
		System.out.println("프로그램이 잘 종료되었습니다.");

	}

}