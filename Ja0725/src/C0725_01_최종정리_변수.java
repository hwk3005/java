
public class C0725_01_최종정리_변수 {

	public static void main(String[] args) {
		// boolean, char, byte, short, int, long, float, double
		// 값 저장 크기순 String > double > float > long > int > short,char > byte
		
		
//		--------------------------------------------------------------------
		// 1. boolean 논리형
		boolean a = true;
		boolean a_2 = false;
		if(a) {
			System.out.println("true입니다.");
		}else {
			System.out.println("false입니다.");
		}

//		--------------------------------------------------------------------
		// 2. char 문자형
//		char b = '';     // 에러 - 아예 내용 없는 경우
		char b_2 = ' ';  // 가능 - 한칸 띄어쓴 경우
		char b_3 = 'a';  // 가능 - 1개 문자만 가능
//		char b_4 = 'ab'; // 에러 - 2개 이상은 안 됨.
		char b_5 = 97;   // a  (아스키문자)  // A: 65, a: 97, 0: 48
		char b_6 = 42;   // *  (아스키문자)
		System.out.println(b_3);
		System.out.println(b_5);
		System.out.println(b_6);
		
		// 2-1. char -> int 형변환
		char b_7 = 52;	// '4'
		int b_8 = b_7;  // '4'-'0' = 4
		System.out.println(b_7);
		System.out.println(b_8);
		
//		--------------------------------------------------------------------
		
		// byte, short, char -> 사칙연산시 -> int타입으로 변환되어 계산됨

		// 3. byte 정수형 - 128까지 숫자계산 가능
		byte c = (byte)(127+1);  // -128~127 , 오버플로우 발생
		System.out.println(c);
		
		// 4. short 정수형
		
		// 5. int 정수형 - 21억까지 숫자계산 가능
		int d = 2147483647;
		int d_2 = (int)(2147483648L);  // 오버플로우 발생
		int d_3 = 1000000;
		int d_4 = 1000000 * 1000000 / 1000000;  // 오버플로우(1조) / 1000000 => -
		int d_5 = 1000000 / 1000000 * 1000000;  //    1 		   * 1000000 => +
		System.out.println(d_2);
		System.out.println(d_3*d_3/d_3);
		System.out.println(d_4);
		System.out.println(d_5);

		// 6. long 정수형 - 900경까지 숫자계산 가능
		long e = 1L;	// 접미사 L, l 필수
		long e_2 = 2l;  // l 소문자 사용 가능하나, 1과 구분하기 쉽지 않음 => 되도록 대문자 L 쓰기
		
		
//		--------------------------------------------------------------------
		// 7. float 실수형 - 소수점 이하 7자리까지 유효성 인정 (값 저장 및 표시 가능)
		float f = 1.0f;  			// 접미사 f, F 필수
		float f_2 = 1.123456789f;
		System.out.println(f_2);
		
		// 8. double 실수형 - 소수점 이하 15자리까지 유효성 인정 (값 저장 및 표시 가능)
		double g = 1.0d;  			// 접미사 d, D 생략 가능
		double g_2 = 1.0;  			// 생략 가능
		double g_3 = 1.1234567890123456789;
		System.out.println(g_2);
		System.out.println(g_3);
		
		// 8-1.
		float g_4 = 0.1f;
		double g_5 = 0.1;
		double g_6 = (double)g_4;	// float -> double 타입 변환보다 아래처럼
		float g_7 = (float)g_5;		// double -> float 타입 비교하기

		if (g_4 == g_7) {			// float == (float)double
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		System.out.println(g_6);
		
//		--------------------------------------------------------------------
		// 9. String  [ "" / Integer.parseInt / charAt(n) / equals() ]
		
		String s = "";					// 빈칸 가능
		String s_2 = " ";   			// 한칸 띄어쓴거 가능
		String s_3 = new String("abc"); // 정석
		String s_4 = "abc"; 			// 가능하지만 문제있을 수 있음.
		
		// 9-1. "" + 숫자(문자) => 문자열  ( 문자열 + 7가지연산 => 다 문자열로 변경됨 )
		String s_5 = "10";
//		String s_6 = s_5;  	  			// 기본형 타입 변환처럼 변환 불가
		String s_6 = ""+s_5;  			// +"" 더하면 => 문자열 변환
		System.out.println(""+1);		// "" + 정수 => 문자열
		System.out.println(""+'a');		// "" + 문자 => 문자열
		System.out.println(""+1.12345); // "" + 실수 => 문자열

		// 9-2. 문자열 + 문자열 => 문자열문자열
		String s_7 = "5";
		String s_8 = "100";						// 문자열 + 문자열 = 문자열문자열 (산술연산 x (+ - * /)
		System.out.println(s_7 + s_8);  		// "5" + "100" = "5100"
		
		// 9-3. 문자열 => 숫자(정수/실수) - Integer.parseInt / Double.parseDoublev
		int s_9 = Integer.parseInt(s_7);		// 문자열 -> int 타입 변환
		double s_10 = Double.parseDouble(s_8);  // 문자열 -> double 타입 변환
		
		// 9-4. 문자열 => 문자 (1개 분리) - charAt(n)
		String s_11 = "홍길동";
		char s_12 = s_11.charAt(0);
		
		// 9-5. 문자열 등가비교 - equals()   	// 불가: 문자열 == 문자열
		String s_13 = "10";
		String s_14 = new String("10");
//		if (s_13 == s_14)  						// 문자열 비교시 등가비교 == 쓰지 말기
		if (s_13.equals(s_14)) {				// equals 쓰기
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		
//		--------------------------------------------------------------------
		
		
	}

}
