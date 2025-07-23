public class C0721_01_변수타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print('안녕하세요.');
		System.out.println("안녕하세요.");
		System.out.println("자바시작");
		
//		--------------------
//		변수타입 - 8개
//		char, boolean, (byte,short,*int,long), (float, *double)
		
//		실수형 - float, double
//		소수점의 유효성, float(8자리), double(15자리)
//		1.1234567 890  1.123456789012345 6789 6000
		float f = 1.1F;  //float타입 - 접미사 F,f 붙이기
		double d = 1.1;  //double타입 - 접미사 생략가능 D,d
		
		
//		정수형 - byte, short, int, long 4개  //byte,short 거의 안 씀
//		int - 21억까지 가능
//		byte - 127까지 숫자표현
//		short - 32000정도까지 숫자표현
//		long - 900경까지 숫자표현, L붙이기
		long h = 2200000000L;  //900경까지 숫자표현 가능, L붙이기
		long h2 = 5L;
		long h3 = -2222222222222L;
		
		
		int i = 10;
		int i2 = 2000;
		int i3 = -2000000;
//		int i = 2200000000; //에러 - 21억까지만 가능
			
//		true, false만 올 수 있음
		boolean b = true;
		boolean b2 = false;
//		boolean b3 = 'a';  //에러 - true, false만 올 수 있음

//		작은따옴표 '' 가능, 문자 1개만 가능
		char c = 'A';
		char c2 = 'B';
		System.out.println(c);
		System.out.println(c2);
		String str = "AB";			// 문자열 변수
		System.out.println(str);
//		char a = "A"; // 에러-문자형은 ''로 입력, 1개 문자만 가능
//		char a = 'AB'; // 에러 - 1개만 가능
	}

}
