
public class C0728_07_풀이_객체변수종류_Card {

	public static void main(String[] args) {

		Card c1 = new Card();
		c1.kind = "HEART";
		c1.number = 7;
		Card.width = 100;	// 클래스명.클래스변수명 -> 이렇게 써야 인스턴스변수랑 헷갈리지 x
		Card.height = 250;
		
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number = 4;
		Card.width = 50; 
		Card.height = 80; 
		
		System.out.printf("%s,%d,%d,%d\n",c1.kind,c1.number,c1.width,c1.height);
		System.out.printf("%s,%d,%d,%d\n",c2.kind,c2.number,c2.width,c2.height);
		
	}

}
