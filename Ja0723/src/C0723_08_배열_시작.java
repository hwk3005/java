import java.util.Scanner;

public class C0723_08_배열_시작 {

	public static void main(String[] args) {
		// 배열
		// Q2. 5개의 숫자를 입력받아, 배열에 넣어서 출력하시오.
		Scanner scan = new Scanner(System.in);
		int[] n = new int[5];
		
//		System.out.println("숫자를 입력하세요.>> ");
//		n[0] = scan.nextInt();
//		System.out.println("숫자를 입력하세요.>> ");
//		n[1] = scan.nextInt();
//		System.out.println("숫자를 입력하세요.>> ");
//		n[2] = scan.nextInt();
//		System.out.println("숫자를 입력하세요.>> ");
//		n[3] = scan.nextInt();
//		System.out.println("숫자를 입력하세요.>> ");
//		n[4] = scan.nextInt();

		for (int i=0; i<5; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.>> \n",i+1);
			n[i] = scan.nextInt();
		}
		for (int i=0; i<5; i++) {
			System.out.println(n[i]+" ");
		}
 		
//		--------------------------------------------------------------------
//		// Q1. 배열 100개 만들고, 1~100까지 숫자를 입력해서 출력하시오.
//		int[] n = new int[100];   // n[0], n[1] .....
//		for (int i=0; i<=100; i++) {
//			n[i] = i+1;
//			System.out.println(n[i]);
//			
//		}
		
//		--------------------------------------------------------------------
//		int score0=0, score1=1, score2=2, score3=3, score4=4, score5=5;
//		System.out.println(score0);
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
//		
//		System.out.println("--------------");
//	
//		// 배열 선언 및 값지정 1
//		int[] s = new int[6];
//		s[0] = 0;
//		s[1] = 1;
//		s[2] = 2;
//		s[3] = 3;
//		s[4] = 4;
//		s[5] = 5;
//		
//		// 배열 선언 및 값지정 2  (많이 쓸 경우)
//		for (int i=0; i<6; i++) {
//			s[i] = i;
//			System.out.println(s[i]);
//		}
//		// 배열 선언 및 값지정 3  (많이 안 쓰는 경우)
//		int [] m = {1,2,3,4,5,6};
//		
//		// 배열 선언 및 값지정 4
//		int [] n = new int[] {1,2,3,4,5,6};
				
//		--------------------------------------------------------------------
//		int score=0, score2=0, score3=0, score4=0, score5=0;
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
//		
//		int[] s = new int[100];
//		for (int i=0; i<100; i++) {
//			System.out.println(s[i]);
//		}
		
	}

}
