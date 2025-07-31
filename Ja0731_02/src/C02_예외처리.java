
public class C02_예외처리 {
	public static void main(String[] args) {
//		System.out.println();	// 컴파일에러 - 자바알려줌.
		int[] arr = {1,2,3};	// 3개
		for (int i=0; i<5; i++) {	// 런타임에러 - 실행할 때 에러
			System.out.println(arr[i]);		// 개발자 3개 -> 5
		}
		// 예외 - 개발자 잘못아닌 것 (인터넷 프로그램 이상없음. 인터넷 끊김.)
		// 프린트를 진행, 프로그램 이상없음. 프린트기가 off -> 예외.
		// DB연결해서 프로그램 이상없음. DB프로그램 문제생김 
		
	}
}
