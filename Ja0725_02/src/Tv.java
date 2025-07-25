
public class Tv {
	
	// - 클래스 내에 변수 선언시 초기값이 자동으로 들어감.
	// - 초기값: String(null), boolean(false), int(0)
	
	// 변수
	String color;	// 변수  
	boolean power;	// 변수
	int channel;	// 변수
	
	
	
//	----------------------------------------------------
	// 함수 - 메소드
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
