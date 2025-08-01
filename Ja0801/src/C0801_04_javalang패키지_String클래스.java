
public class C0801_04_javalang패키지_String클래스 {

	public static void main(String[] args) {
		// String 클래스

		
		
		// c가 몇개 있는지 개수를 출력하시오.
//		indexOf -> 현재있는 위치 -> +1 시작 -> count -1 나올때까지 계속 for문
//		indexOf("a",4);		// indexOf(찾는문자,시작위치)
		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
		int n = 0;
		int count = 0;
		while (true) {
			n = str.indexOf("c",n);
			if (n != -1) {
				System.out.println(n);
				n++;
				count++;
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
		
		
//		String[] str = {"a","b","c","d"};
//		String[] str2 = new String[4];
//		// list 붙여서 배열에 넣고 배열을 다시 출력하시오.
//		for (int i=0; i<str.length; i++) {
////			str2[i] = str[i].concat("_list");
//			str2[i] = str[i]+"_list";
//			System.out.println(str2[i]);
//		}
		
		
		String a = "5조123456789";
		char b = a.charAt(1);	// 문자열에서 1개 문자를 가져오는 메서드
		System.out.println(b);
		System.out.println(a.charAt(a.length()-1));	//문자길이
			
		
		
//		String a = "1";
//		for (int i=0; i<100; i++) {
//			a = a + i;
//		}
//		System.out.println(a);
		
		
//		String str1 = "abc";
//		String str2 = "abc";
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		
//		int a = 1;
//		int b = 1;
////		System.out.println(a==b);	// true
//		System.out.println(str1 == str2);	// false, true;
//		System.out.println(str3 == str4);	// 
		
	}

}
