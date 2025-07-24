import java.util.Scanner;

public class C0724_06_풀이_2차원배열_성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // 입력받기 설정
		
		// Q2. 성적 입력받고 출력하기 (2차원 배열)
		// 이름   국어 영어 수학 합계 평균
		// 홍길동 100  100  99   299  ...
		// 유관순 90   90   91   ...  ...
		
		// 1) 배열 선언
		String[] name = new String[3];  // 1차원
		int[][] score = new int[3][3];  // 2차원
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"국어","영어","수학"};
		
		// 2) 이름,점수 입력, 합계,평균 계산
		for (int i=0; i<score.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> \n",i+1);
			name[i] = scan.next();
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>> ",i+1,title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
//			total[i] = score[i][0]+score[i][1]+score[i][2]; // for(i)문으로 total 빼는 경우
			avg[i] = total[i]/3.0;
		}
		// 3) 입력내역 출력
		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("--------------------------------------------------");
		// name 출력
		for (int i=0; i<score.length; i++) {
			System.out.printf("%s\t",name[i]);
			// score 출력
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			// total, avg 출력
			System.out.printf("%d\t",total[i]);
			System.out.printf("%.2f\t",avg[i]);
			System.out.println();
		}
		
		
//		-------------------------------------------
//		// Q1. 5,5 배열  (2차원 배열)
//		// 1 2 3 4 5
//		// 6 7 8 9 10
//		// ...
//		// 21 22 23 24 25
//		
//		// 1) 배열 생성
//		int[][] score = new int[5][5];
//
//		for (int i=0; i<score.length; i++) {
//			for (int j=0; j<score[i].length; j++) {
//				score[i][j] = 5*i+j+1;
//			}
//		}
//		// 2) 배열 출력
//		for (int i=0; i<score.length; i++) {
//			for (int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
//		-------------------------------------------
//		// 2차원 배열
//		// 1) 배열 생성
//		int[][] score = new int[5][3];
//		
//		for (int i=0; i<score.length; i++) {
//			for (int j=0; j<score[i].length; j++) {
//				score[i][j] = 3*i+j;  // 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14
//			}
//		}
//		// 2) 배열 출력
//		for (int i=0; i<score.length; i++) {
//			for (int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
//		-------------------------------------------
//		// 1차원 배열
//		int[] num = new int[5];
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] = i;  // 0,1,2,3,4
//		}
		
		
//		END ------------------------------------------
	}

}
