
public class C0725_02_객체선언_Stuscore {

	public static void main(String[] args) {
		// Q1. 홍길동 100 100 99 299 99.67
		
		// 객체선언 (Stuscore class 사용)
		// s - 참조형 변수 (참조변수): 주소값 저장
		Stuscore s = new Stuscore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		s.total = s.kor + s.eng + s.math;
		s.avg = s.total/3.0; 
		
		System.out.println("이름: "+s.name);
		System.out.println("국어: "+s.kor);
		System.out.println("합계: "+s.total);
		System.out.println("평균: "+s.avg);
		
		System.out.println(s); // Stuscore@1218025c

		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);  // [I@816f27d
	}

}
