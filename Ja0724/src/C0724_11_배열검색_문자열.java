import java.util.Scanner;

public class C0724_11_배열검색_문자열 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = {
				"홍길동","유관순","이순신","강감찬","김구",
				"김유신","홍길자","홍길순","관순스","순신스",
				"love","same","Java","Javascript","python",
				"PYTHON","JAVA","C","c++","Love","LOVE"
		};
		
		// contains() : 문자열에 해당 단어가 있는지 확인 - true, false
		// toLowerCase(),toUpperCase : 문자열을 소,대문자로 치환
		
		while (true) {
			System.out.println("찾고자 하는 이름을 입력하세요.>> ");
			String search = scan.next();
			
			System.out.println("      [ 검색 이름 ]");
			System.out.println("-------------------------");
			for (int i=0; i<name.length; i++) {
				// name[]에 search가 포함된 문자 찾기 (소문자로 치환 후 찾음-> 대소문자 구분없이 검색됨)
				if (name[i].toLowerCase().contains(search)) {
					System.out.println(name[i]);
				}
			}

		} // while
		
	} // main

} // class
