
public class C0725_01_객체선언_Tv {

	public static void main(String[] args) {

//		----------------------------------------------------
		// 변수 사용법
		int a = 10;
		String str = new String("abc");
		String str2 = "abc";  // String만 이렇게 사용 가능
			// str: 참조형 변수 (참조변수) - 주소값 저장
		
		
//		----------------------------------------------------
		// 클래스(객체) 사용법

		// 1. 객체 (=인스턴스)
		//   ㄴ 같은 패키지, 프로젝트 내에서 (지정해서) 사용 가능
		//   ㄴ 장점: 다른 타입들을 한번에 쓸 수 있음.
		// 2. 객체선언: 클래스명 참조변수명(주소값 들어있음) = new 클래스명();
		
		// 객체선언 (Tv class 사용)
		Tv t = new Tv();
		t.color = "white";
		t.channel = 7;
		t.channelUp();
		System.out.println("현재채널: "+t.channel);
		
		Tv t2 = new Tv();
		t2.color = "pink";
		t2.channel = 5;
		System.out.println("현재채널: "+t2.channel);
		
		
		
		
		
	}

}
