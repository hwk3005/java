
public class StuScore {
	
	// 변수
	String name;  // 인스턴스 변수
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
//	static int rank;  // 클래스 변수
	
	
	// 메서드
	void stuTotal() {
		total = kor+eng+math;
	}
	void stuAvg() {
		avg = (kor+eng+math)/3.0;
	}

	

//	클래스 영역
	// 인스턴스 변수 (개별)
		// 90% 대부분 사용 o 
		// 뜻: 각 인스턴스의 개별적인 공간
		// 1. 클래스 내에 선언되어 있는 변수
		// 2. 객체선언 해야 사용 가능
		// 3. 사용법: 객체선언 후, '참조변수명.인스턴스변수명'
		// 4. 개별 사용
	
	// 클래스 변수 (공용)
		// 거의 사용 x
		// static/공유 변수
		// 뜻: 같은 클래스의 모든 인스턴스들이 공유하는 변수
		// 1. 클래스 내에 선언되어 있는 변수
		// 2. 객체선언 없이 '클래스이름.클래스변수명'
		// 3. 공용 사용

	
//	메서드 영역
	// 지역변수
		// 메서드 내에 선언되어 있는 변수
		// 메서드 벗어나면 소멸


}
