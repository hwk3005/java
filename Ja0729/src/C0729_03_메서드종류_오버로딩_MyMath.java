
public class C0729_03_메서드종류_오버로딩_MyMath {

	public static void main(String[] args) {
		
		// 생성자
		Card c = new Card();
		System.out.println(c.number);
		
		
//		---------------------------------------------------------------
//		인스턴스메소드, 클래스메소드

//		int a = 10;
//		int b = 5;	// 동일이름 안됨.
//		// 인스턴스 - 객체선언후 사용
//		MyMath m = new MyMath();
//		
//		m.add();	// 인스턴스메소드(호출) - 객체선언후 사용
//		m.a = 100;	// 인스턴스변수 - 객체선언후 사용
//		m.b = 50;
//		System.out.println(m.add());
//		
//		
////		-------------------------
//		// 클래스메소드(호출) - 객체선언없이 사용, 클래스명.변수명
//		long result = MyMath.add(100, 50);
//		System.out.println(result);
		
//		---------------------------------------------------------------
//		System.out.println(1);		// int 타입
//		System.out.println("2");	// String 타입
//		System.out.println('3');	// char 타입
//		System.out.println(false);	// boolean 타입
		
		
	} // main
	
//		---------------------------------------------------------------
	// 오버로딩
	static void add(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	static void add(int a) {
		System.out.println(a);
	}
	static void add(char a) {
		System.out.println(a);
	}
	static void add(String a) {
		System.out.println(a);
	}
	static void add(boolean a) {
		System.out.println(a);
	}
	
//		---------------------------------------------------------------

}
