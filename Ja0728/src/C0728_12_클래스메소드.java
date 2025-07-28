
public class C0728_12_클래스메소드 {

	public static void main(String[] args) {
		// 객체 선언
		Data d = new Data();
		d.x = 10;
		System.out.println("change메소드 호출전 d.x : "+d.x);
		
		// 클래스변수 - 객체선언없이 사용, 공용사용, 클래스명.변수명
		// 클래스메소드 - 객체선언없이 사용, 공용사용, 클래스명.메소드명
		
		C0728_12_클래스메소드.change(d);	// 메소드 호출
		System.out.println("change메소드 호출후 d.x : "+d.x);
		
	}

	static void change(Data d) {
		d.x = 1000;	// 지역변수
		System.out.println("d.x : "+d.x);
	}
	
}

class Data{
	int x;	// 인스턴스변수 - 객체선언후 사용, 객체개별사용, 참조변수명.변수명
	
	
}
