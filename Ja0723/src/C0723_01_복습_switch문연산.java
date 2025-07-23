import java.util.Scanner;

public class C0723_01_복습_switch문연산 {

	public static void main(String[] args) {
		// 숫자 입력받아
		Scanner scan = new Scanner(System.in);
		
		//
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억이하 덧셈");
		System.out.println("2. 21억이상 덧셈");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();  // nextDouble()
		
		switch (choice) {
		case 1:
			// 21억이하 int
			System.out.println("1. 21억이하 덧셈");
			System.out.println("21억이하 숫자1를 입력하세요.>> ");
			int input1 = scan.nextInt();
			System.out.println("21억이하 숫자2를 입력하세요.>> ");
			int input2 = scan.nextInt();
			int add = input1 + input2;
			System.out.println("합계: "+add);
			break;
		case 2:
			// 21억이상 long
			System.out.println("2. 21억이상 덧셈");
			System.out.println("21억이상 숫자1를 입력하세요.>> ");
			int input3 = scan.nextInt();
			System.out.println("21억이상 숫자2를 입력하세요.>> ");
			int input4 = scan.nextInt();
			int add2 = input3 + input4;
			System.out.println("합계: "+add2);
			break;
		}
		
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.>> ");  // 숫자 입력하라는 내용 출력
//		int input = scan.nextInt();					  // 숫자 입력받기
//		System.out.println("숫자2를 입력하세요.>> ");  // 숫자 입력하라는 내용 출력
//		int input2 = scan.nextInt();					  // 숫자 입력받기
//		
////		int add = input + input2;
//		long add = (long)input + input2;
//		
//		
//		System.out.println("입력숫자: "+input);
//		System.out.println("입력숫자2: "+input2);
//		System.out.println("합계: "+add);
	}

}
