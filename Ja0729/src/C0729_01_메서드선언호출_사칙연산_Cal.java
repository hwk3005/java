import java.util.Scanner;

public class C0729_01_메서드선언호출_사칙연산_Cal {

	public static void main(String[] args) {  // main 메서드 부분부터 시작
		// 다른클래스 사용시 - 객체선언후 사용
		Cal cal = new Cal();	// 객체선언
		Scanner scan = new Scanner(System.in);
		int a = 10;
		int b = 5;
		System.out.println("[ 두수 계산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 모든계산");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		int result = 0;
		double[] number = new double[4];
		
		switch (choice) {
		case 1:		// add
			cal.add(a, b);
			break;
			
		case 2:		// minus
			cal.minus(a, b);
			break;
			
		case 3:		// multi
			cal.multi(a, b);
			break;
			
		case 4:		// sub
			cal.sub(a, b);
			break;
			
		case 5:		// 모든계산 
			// (a,b,배열) num 매개변수
			// 더하기,빼기,곱하기,나누기
			// 결과값을 여기에서 출력하시오.
			cal.calProcess(a, b, number);
			System.out.println("더하기: "+number[0]);
			System.out.println("빼기: "+number[1]);
			System.out.println("곱하기: "+number[2]);
			System.out.println("나누기: "+number[3]);
			break;
			
			
		}
		
		
		
	}

}
