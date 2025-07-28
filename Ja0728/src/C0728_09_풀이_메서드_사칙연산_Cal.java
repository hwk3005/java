import java.util.Scanner;

public class C0728_09_풀이_메서드_사칙연산_Cal {

	public static void main(String[] args) {
		// a,b 입력받아, 더하기,빼기,곱하기,나누기 계산을 하는 프로그램
		Cal c = new Cal();
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하세요.>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = 0;
		
		System.out.println("[ 사칙연산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		
		switch (choice) {
		case 1:
			c.add(a, b);
			break;
		case 2:
			c.minus(a, b);
			break;
		case 3:
			c.multi(a, b);
			break;
		case 4:
			c.divide(a, b);
			break;
		}
		
		
	}

}
