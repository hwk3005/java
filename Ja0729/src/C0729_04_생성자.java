
public class C0729_04_생성자 {

	public static void main(String[] args) {
		// 생성자
		Data1 d1 = new Data1();		// 에러 없음.
		d1.value = 50;
//		Data2 d2 = new Data2();		// 에러
		Data2 d2 = new Data2(5,7);	// 매개변수 포함해야 에러나지 않음 (전체생성자)
									// 매개변수 타입, 개수와 같아야 함
		
		
	}

}

class Data1 {
	Data1(){}	// 생성자 - 기본생성자 자동생성
	int value;
}

class Data2 {
	int value;
//	Data2(){}		// 기본생성자 - 다른생성자 1개라도 있을시 자동으로 생성 안됨
	Data2(int x, int y){	// 전체생성자 - 매개변수 있는 생성자
		value = x;
		
	}
}
