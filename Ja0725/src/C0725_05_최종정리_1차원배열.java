import java.util.Scanner;

public class C0725_05_최종정리_1차원배열 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1차원 배열
		
		
//		--------------------------------------------------------------------
		
		// Q2. 45개 배열을 생성해서 1~45까지 랜덤숫자를 섞고 입력하시오.

		// 1) 배열선언
		int[] arr = new int[45];

		// 2) 배열 번호입력
		for (int i=0; i<45; i++) {
			arr[i] = i+1;
		}
		
		// 3) 랜덤섞기
		int temp = 0;	// 임시저장 번호
		int rnum = 0;	// 랜덤 번호
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		// 4) 배열 번호출력
		for (int i=0; i<6; i++) {
			System.out.println(arr[i]+" ");
		}
		
//		for (int i=0; i<45; i++) {
//			if (i == 0) {
//				System.out.print(arr[i]+"\t");
//				continue;
//			}else if (i%5 == 0) {
//				System.out.println();
//			}
//			System.out.print(arr[i]+"\t");
//		}

		
////		--------------------------------------------------------------------
		// 2. Math.random
		double a = Math.random();
//		int rnum = (int)(Math.random()*45)+1;
		
		// 0*10 <= x*10 < 1*10
		// (int)0 <= (int)(x*10) < (int)10
		// (int)0+1 <= (int)(x*10)+1 < (int)10+1
		// 1 <= (int)(x*10)+1 <= 10
		
		int a_1 = (int)(Math.random()*10)+1;
		int a_2 = (int)(Math.random()*100)+1;
		int a_3 = (int)(Math.random()*50)+1;
		int a_4 = (int)(Math.random()*50);	// 0 ~ 49
		int a_5 = (int)(Math.random()*10);	// 0 ~ 9
		int a_6 = (int)(Math.random()*10);	// 0 ~ 9

		
////		--------------------------------------------------------------------
//		// Q1. 45개 배열을 생성해서 1~45까지 숫자를 입력하시오.
//		int[] arr = new int[45];
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
		
		
////		--------------------------------------------------------------------
//		// 1. 배열 생성 (선언 및 값입력)
//		
//		// 1-1.
//		int[] arr = new int[5];	// 배열선언
//		arr[0] = 1;				// 배열값 입력
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		
//		// 1-2.
//		int[] arr2 = {1,2,3,4,5}; // 배열선언 직접입력
//
//		// 1-3.
//		int[] arr3 = new int[] {1,2,3,4,5};
//
//		// 1-4.
//		int[] arr4 = new int[5];
//		for (int i=0; i<5; i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
//		
////		--------------------------------------------------------------------
	}

}
