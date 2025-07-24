import java.util.Scanner;

public class C0724_07_연습_2차원배열_성적 {

	public static void main(String[] args) {
		// Q1. 이름, 국어,영어,수학 점수를 입력받아 출력하시오. (3명)
		
		// 0. 입력 설정
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 배열선언
		String[] name = new String[3];  // name 1차원
		int[][] score = new int[3][3];  // score 2차원 (국어,영어,수학)
		int[] total = new int[3];		// total 1차원
		double[] avg = new double[3];	// avg 1차원
		String[] title = {"국어","영어","수학"}; // title 선언
		
		// 2. 입력받기
		//   1) name 입력
		for (int i=0; i<score.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ",i+1);
			name[i] = scan.next();
			
			//   2) score 입력
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>> ",i+1,title[j]);
				score[i][j] = scan.nextInt();
				//   3) total 연산
				total[i] += score[i][j];
			}
			//   4) avg 연산
			avg[i] = total[i]/3.0;
		}
		
		// 3. 출력
		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("------------------------------------------------------");
		//   1) name 출력
		for (int i=0; i<score.length; i++) {
			System.out.printf("%s\t",name[i]);
			//   2) score 출력
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			//   3) total, avg 출력
			System.out.printf("%d\t",total[i]);
			System.out.printf("%.2f\t",avg[i]);
			
			System.out.println();
		}
		
		
//		END ------------------------------------------
	}

}
