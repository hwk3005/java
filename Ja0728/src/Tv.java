
public class Tv {

	// 다른 클래스를 사용하려면 객체선언을 해야 사용가능
	// C0728_01 c = new C0728_01();
	
	
	
	// 변수
	String color;
	boolean power;
	int channel;
	
	
	// 함수
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
