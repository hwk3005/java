import java.util.Scanner;

public class C0723_05_풀이_for문 {

	public static void main(String[] args) {
		
		// Q3. 1~100까지의 합을 출력하시오.
		// Q3-1. 1에서 얼마까지 해야 합계 100 넘는지 넘는 시점을 출력하시오.
		// Q3-2. 500 넘는 시점 바로 전단계를 출력하시오.
		int sum = 0;
		int i = 0;  // i 전역변수 선언
		for (i=1; i<100; i++) { 
			sum += i;
			System.out.printf("i: %d, sum: %d \n",i,sum);
			if (sum>=500) break;
		}
		System.err.println("--------------------------");
		System.out.printf("i: %d, sum: %d \n ",i-1,sum-i);
		
//		-----------------
//		// Q2. 두수를 입력받아, 2,7 2에서 7까지의 합을 구하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.>> ");
//		int input2 = scan.nextInt();
//		
//		// 치환, temp변수 생성
//		int temp = 0;
//		if (input > input2) {
//			// 입력숫자를 서로 바꿔줘야 함
//			temp = input;
//			input = input2;
//			input2 = temp;
//		}
//		int sum = 0;
//		for (int i=input; i<=input2; i++) {
//			sum += i;
//		}
//		
//		System.out.println("합계: "+sum);
		
//		-----------------
//		// Q1. 1~10까지 숫자의 합을 출력하시오.
//		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("합계: "+sum);
		
	}
}
