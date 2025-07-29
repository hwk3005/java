
public class Cal {
	
	// 더하기, 빼기, 곱하기, 나누기
	
	int result;	// 인스턴스변수 - 객체선언후사용, 개별사용, 참조변수명.변수명
	
	
	void calProcess(int a, int b, double[] number) {
		// 더하기,빼기,곱하기,나누기
		number[0] = a+b;
		number[1] = a-b;
		number[2] = a*b;
		number[3] = a/b;
	}
	
	
	
	
	
	// 더하기
	void add(int a,int b) {
		result = a + b;
		System.out.println("결과: "+result);
	}
	
	// 빼기
	void minus(int a,int b) {
		result = a - b;
		System.out.println("결과: "+result);
	}
	
	// 곱하기
	void multi(int a,int b) {
		result = a * b;
		System.out.println("결과: "+result);
	}
	
	// 나누기
	void sub(int a,int b) {
		double result2 = (double)a / b;
		System.out.println("결과: "+result2);
	}
	
	
	
}
