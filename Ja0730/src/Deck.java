
public class Deck {
	
	final int CARD_NUM = 52;	// 상수: 값이 한번 정해지면 수정불가
//	CARD_NUM = 53;
	Card[] c = new Card[52];	// 52장 - 1~10, J, Q, K 13장 * 4종류 = 52장
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	String[] c_shape = {
			"","A","2","3","4","5","6","7","8","9","10","J","Q","K"
	};
	
	
	
	// 기본생성자 - 클래스 이름과 동일, void x, 
	Deck() {
		for(int i=0;i<52;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				c[i*13+j] = new Card(j+1,shape[i]);
//			}
//		}
	} // 생성자

	
	//카드1장 뽑기
	Card pick(int index) {
		if(index>52 || index<0) {
			return c[0];
		}else {
			return c[index]; // 100
		}
	}
	//카드1장 뽑기
	Card pick() {
	   int index = (int)(Math.random()*52);
	   return c[index];
	}
	
	
	//카드섞기
	void shuffle() {
		Card temp = null;
		int rnum = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*52); //0-51
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
	
	
	//전체카드 출력
	void deck_print(){
		for(int i=0;i<52;i++) {
			System.out.printf("[%s,%s]\n",c_shape[c[i].number],c[i].kind);
		}
	}
	
	
	
}
