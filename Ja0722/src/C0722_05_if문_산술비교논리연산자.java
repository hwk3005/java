import java.util.Scanner;

public class C0722_05_if문_산술비교논리연산자 {
	public static void main(String[] args) {
		
//		// 논리연산자
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		
		String input = scan.next();  // scan.nextChar() 없음
		char ch = input.charAt(0);	 // abc -> a: 0, b: 1, c: 2
		System.out.println("입력문자: "+ch);
		
		
////		// Q1. 1과 10사이인지 확인해서 -> 1~10사이의 숫자입니다. 1~10사이의 숫자가 아닙니다. 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
////		// AND연산자
//		if (num>=1 && num<=10) {
//			System.out.println("1~10사이의 숫자입니다.");
//		}else {
//			System.out.println("1~10사이의 숫자가 아닙니다.");
//		}
////		// OR연산자
//		if (num<1 || num>10 ) {
//			System.out.println("1~10사이의 숫자가 아닙니다.");
//		}else {
//			System.out.println("1~10사이의 숫자입니다.");
//		}
		
		
//		// 비교연산자
//		double d = 0.1f;
//		System.out.println(d);	 // 0.10000000149011612
//		double d_2 = 0.1;
//		System.out.println(d_2); // 0.1
//		if (d==d_2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		if('0'==48) {	// A: 65, a: 97, 0: 48
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
				
//		// 비교연산자
//		// Q1. 숫자를 입력받아, 10보다 큰수인지, 작은수인지 출력하시오.
//		// 10보다 큰수입니다. 10보다 작은수입니다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		int num = scan.nextInt();
//		if (num>10) {
//			System.out.println("10보다 큰수입니다.");
//		}else {
//			System.out.println("10보다 작은수입니다.");
//		}
		
		
//		// 산술연산자
////		double share2 = 10/8.0;
//		int share = 10/8;	// 몫
//		int remain = 10%8;	// 나머지
//		System.out.println(share);
//		System.out.println(remain);
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		int input = scan.nextInt();
//		if(input%2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
				
	}
}
