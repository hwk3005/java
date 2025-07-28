import java.util.Scanner;

public class C0728_10_풀이_메서드_사칙연산_Cal2 {

	public static void main(String[] args) {
		// 
		// 3개의 숫자를 입력받아, 더하기,빼기,곱하기,나누기
		// Cal2.java를 만들어서 구성하시오.
		// a,b 입력받아, 더하기,빼기,곱하기,나누기 계산을 하는 프로그램
		Cal2 cal2 = new Cal2();	// 객체선언
		Scanner scan = new Scanner(System.in); // 입력설정
		
		System.out.println("3개 숫자를 입력하세요.>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = 0;
		
		System.out.println("[ 사칙연산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			cal2.add(a, b, c);
			break;
		case 2:
			cal2.minus(a, b, c);
			break;
		case 3:
			cal2.multi(a, b, c);
			break;
		case 4:
			cal2.divide(a, b, c);
			break;
		}
		
		

	}

}