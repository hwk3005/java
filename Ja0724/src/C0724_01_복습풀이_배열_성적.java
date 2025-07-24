import java.util.Scanner;

public class C0724_01_복습풀이_배열_성적 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Q1. 이름 5개를 입력받아 출력하시오.
		// 국어, 영어, 수학, 합계, 평균 출력하시오.
		// 이름 국어 영어 수학 합계 평균
		// 홍길동 100 100 99   299  99.67
		
		// 1. 배열선언
		String[] name = new String[5];  // name_문자열_배열선언
		int[] kor = new int[5];			// kor_정수_배열선언
		int[] eng = new int[5];			// eng_정수_배열선언
		int[] math = new int[5];		// math_정수_배열선언
		int[] total = new int[5];		// total_정수_배열선언
		double[] avg = new double[5];	// avg_실수_배열선언
		
		// 2. 입력받기
		int i = 0;
		for (i=0; i<name.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ",i+1);
			name[i] = scan.next();
			System.out.printf("국어점수를 입력하세요.>> ",i+1);
			kor[i] = scan.nextInt();
			System.out.printf("영어점수를 입력하세요.>> ",i+1);
			eng[i] = scan.nextInt();
			System.out.printf("수학점수를 입력하세요.>> ",i+1);
			math[i] = scan.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		// 3. 출력하기
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("----------------------------------------------------");
		for (i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
		
		
//		------------------------------------
//		// 배열선언_1
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		
//		for (int i=0; i<5; i++) {
//			arr[i] = i+1;
//		}
//		
//		// 배열선언_2
//		int[] arr2 = {1,2,3,4,5};
//		
//		// 배열선언_3
//		int[] arr3 = new int[] {1,2,3,4,5};
//		
//		// 출력
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
