
public class MyMath {
	
	static long c;	// 클래스변수 - static (O), 클래스 내 선언
	long a,b;		// 인스턴스변수 - 자동초기화됨.
	
	long add() {	// 인스턴스메서드 - static (X)
		int d = 0;	// 지역변수 - 값을 입력해야 함. 자동초기화 안됨.
		System.out.println(d);
		return a+b;
	}
		
	static long add(long a, long b) {	// 클래스메소드 - static (O)
		return a+b;
	}

	
	
}
