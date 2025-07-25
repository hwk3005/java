import java.util.Scanner;

public class C0725_04_최종정리_반복문 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 반복문
		
		
//		--------------------------------------------------------------------
		// 2. while문

		// 2-2.
		while (true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("원하는 번호를 입력하세요.(0.종료) >> ");
			int choice = scan.nextInt();
			if (choice == 0) {
				break;
			}
		}
		
		// 2-1.
		int sum2 = 0;
		int i2 = 0;
		while (i2<=10) {
			sum2 += i2;
			i2++;
		}
		System.out.println(i2);
		System.out.println("합계: "+sum2);
		
////		--------------------------------------------------------------------
//		// 1. for문
//		
//		// 1-1. 지역변수 선언
//		for (int i=0; i<10; i++) {
//			System.out.println(i);
//		}
//
//		// 1-2. 전역변수 선언
//		int sum = 0;
//		int i = 0;
//		for (i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(i);
//		System.out.println("합계: "+sum);
//		
//		// 1-3. for - 무한반복(조건식 없을 경우)
//		int j = 0;
//		for (;;j++) {
//			System.out.println(j);
//		}
//		
////		--------------------------------------------------------------------
		
	}
}
