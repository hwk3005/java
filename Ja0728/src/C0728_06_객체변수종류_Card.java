
public class C0728_06_객체변수종류_Card {

	public static void main(String[] args) {
		// 다른 클래스 사용 방법 - 객체선언후 사용
		// 인스턴스 변수 사용방법
		// 객체선언후 사용, 객체개별 사용, 참조변수명.인스턴스변수명
		Card c = new Card();
		c.kind = "spade";
		c.number = 1;
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 2;
		Card c3 = new Card();
		c3.kind = "spade";
		c3.number = 3;

		
// ---------------------------------		
		// 클래스변수 사용
		Card.width = 100;  // 객체선언없이 값 입력 가능
		// 객체선언 100개 되어도 위 클래스변수가 공용으로 사용됨.
		Card.height = 250;
		
// ---------------------------------		
		// shape 배열 생성 
		String[] shape = {"spade", "heart", "diamond", "clover"};
		// "spade", "heart", "diamond", "clover"
		
// ---------------------------------		
		// 인스턴스변수 사용
		Card[] card = new Card[52];	// 객체선언 후 값입력
		for (int i=0; i<card.length; i++) {
			card[i] = new Card();	// 객체 선언 - 안할경우 인스턴스변수 사용불가
			card[i].kind = shape[i/13];  // 각 13장씩
			card[i].number = i%13+1;	 // 1-13
		}
		
// ---------------------------------		
		// 출력
		System.out.println("Card0 넓이: "+card[0].width);
		System.out.println("Card1 넓이: "+card[1].width);
		System.out.println("Card2 넓이: "+card[2].width);
		
		
//		// 출력
//		for (int i=0; i<card.length; i++) {
//			System.out.println(card[i].kind+", "+card[i].number);
//		}
		
		

	}

}
