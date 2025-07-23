
public class C0722_15_자습 {
	public static void main(String[] args) {
		
		
//		p105 - 예제 2-16 -----------------
		String str = "3";  						  // 문자열 3
		
		// 문자열 → 문자 → 정수
		System.out.println(str.charAt(0) - '0');  // 정수 3
		// 문자 → 정수
		System.out.println('3' - '0' + 1);	      // 정수 3 + 1 = 4
		// 문자열 → 정수
		System.out.println(Integer.parseInt("3") + 1); // 정수 4
		// 문자열
		System.out.println("3" + 1);  			  // 문자열
		// 숫자 → 문자
		System.out.println((char)(3 + '0')); 	  // 문자 3
			
		
//		p96 - 예제 2-12 -----------------
//		double d = 85.4;
//		int score = (int)d;
//		
//		System.out.println("score: "+score);  // score: 85
//		System.out.println("d: "+d);  		  // d: 85.4
	}
}
