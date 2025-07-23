
public class C0722_03_연산_타입 {

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = (char)(c1 + 1);  // char + int = int, byte,short,char -> int
		System.out.println(c3);
//		-----------------------		
		char c4 = ++c1;			// 증감연산자 사용시 타입변경 안 해도 됨.  *** 중요 ***
		System.out.println(c4);
//		-----------------------
		int i = 'B'-'A';		// 66-65=1  //이런 거 안 씀
		System.out.println(i);
		int i2 = 'b'-'a';		// 98-97=1  //이런 거 안 씀
		System.out.println(i2);
//		-----------------------
		int i3 = '1'-'0';		// 0 빼면 숫자타입으로 바뀜  *** 중요 ***
		System.out.println(i3);
		int i4 = '3'-'0';
		System.out.println(i4);
		int i5 = '9'-'0';
		System.out.println(i5);
//		-----------------------
		int n = 5;
		String s = n+"";		// "" 더하면 문자열타입으로 바뀜  *** 중요 ***
		
		int n2 = 123456789;
		
		
		
		
	}

}
