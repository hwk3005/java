import java.util.Scanner;

public class C0722_14_풀이_if문switch사계절 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.println("월을 입력하세요.>> ");
		int input = scan.nextInt();
		// 12,1,2: 겨울, 3,4,5: 봄, 6,7,8: 여름, 9,10,11: 가을
		// Q1. if문으로 구현, Q2. switch 구현하시오.
		
		// A1. if문
		if ( 3 <= input && input <= 5) {
			System.out.println("봄");
		}else if ( 6 <= input && input <= 8) {
			System.out.println("여름");
		}else if ( 9 <= input  && input <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		// A2. switch문
		switch (input) {
		
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
			
//		case 3,4,5 -> System.out.println("봄"); // 화살표함수 (람다식)
//		case 3,4,5: System.out.println("봄");   // 에러
		}
		
		
		System.out.println("입력: "+input);
	}

}
