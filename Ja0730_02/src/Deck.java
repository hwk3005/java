
public class Deck {

	Card[] c = new Card[52];
	String[] shape = {
		"SPADE","HEART",
		"DIAMOND","CLOVER"
	};
	Deck() {
		// 모양,번호부여
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}
	//전체출력
	public void card_print() {
		for(int i=0;i<c.length;i++) {
			System.out.println(
//					c[i].getN_num() // "","A","2","3","4","5","6","7","8","9","10","J","Q","K"	 
//					c[1].getN_num()[1]; A
//					c[1].getNumber(); 1
//					c[1].getN_num()[c[1].getNumber()]; A
					c[i].getN_num()[c[i].getNumber()]+","+
			c[i].getKind());
		}
	}
	
	// 카드섞기 메소드
	public void shuffle() {
		Card temp = null;
		int rnum = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
	
	// 카드 5장 출력메소드
	public Card[] pick_5() {
		Card[] c_5 = new Card[5];
		for(int i=0;i<c_5.length;i++) {
			c_5[i] = c[i];
		}
		return c_5;
	}
	
	// 카드 1장 뽑기메소드
	public Card pick(int index) {
		return c[index];
	}
	
	// 랜덤 카드 1장 뽑기메소드
	public Card pick() {
		int index = (int)(Math.random()*52);
		return c[index];
	}
	
	
}