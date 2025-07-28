
public class C0728_02_복습풀이_객체선언_Tv {
	public static void main(String[] args) {
		
		// Q1. Tv 클래스 객체생성을 해서
		// Tv 색상은 pink
		// 채널은 7을 입력하시오.
		Tv t = new Tv();
		t.color = "pink";
		t.channel = 7;
		System.out.println(t.color);
		System.out.println(t.channel);
		
		
		// Q. t2 생성하시오. (white, 5)
		Tv t2 = new Tv();
		t2.color = "white";
		t2.channel = 5;
		
		System.out.println(t2.color);
		System.out.println("t2 : "+t2.channel);	// 5
		
		t2 = t;
		System.out.println("t2 : "+t2.channel);	// 7
		t.channel = 1;
		System.out.println("t2 : "+t2.channel);	// 1
		
		
		
	}
}
