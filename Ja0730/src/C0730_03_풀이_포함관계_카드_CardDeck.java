
public class C0730_03_풀이_포함관계_카드_CardDeck {

	public static void main(String[] args) {
		Deck d = new Deck();	// 포함관계 - 객체선언, 52장 카드 생성
		
		d.deck_print();			// Deck클래스 - deck_print 메소드 호출
		
		// 카드섞기
		d.shuffle();			// Deck클래스 - shuffle 메소드 호출
		System.out.println("----");
		
		d.deck_print();
		System.out.println("----");
		
		Card c_one = d.pick(34);
		System.out.printf("1장 : %s,%s\n",d.c_shape[c_one.number],c_one.kind);
		System.out.println("----");
		
		c_one = d.pick();
		System.out.printf("1장 : %s,%s\n",d.c_shape[c_one.number],c_one.kind);

		System.out.println("-------------");
		System.out.println(c_one);	// 참조변수-주소값 출력됨
		
	}

}
