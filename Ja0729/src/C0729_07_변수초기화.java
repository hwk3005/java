
public class C0729_07_변수초기화 {

	static int b;	// 클래스변수 - 객체선언없이, 공용, 클래스명.변수명
	int c;			// 인스턴스변수 - 객체선언후 사용, 개별, 참조변수명.변수명
	
	public static void main(String[] args) {
		int a = 0;	// 지역변수 - 메소드내에 선언, 자동초기화 안됨
		System.out.println("지역변수: "+a);		// 초기화 해야 사용가능
		
		// 클래스변수, 인스턴스 변수 - 자동초기화 됨.
		System.out.println("클래스변수: "+C0729_07_변수초기화.b);	// 초기화 없이 사용가능

		C0729_07_변수초기화 cc = new C0729_07_변수초기화();
		System.out.println("인스턴스변수: "+cc.c);	// 참조변수명.변수명 
		
		
	}

}
