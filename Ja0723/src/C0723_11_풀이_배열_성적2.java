import java.util.Scanner;

public class C0723_11_풀이_배열_성적2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];  // 이름
		int[] kor = new int[2]; 		// 국어점수
		int[] eng = new int[2];			// 영어점수
		int[] math = new int[2];		// 수학점수
		int[] total = new int[2];		// 합계
		double[] avg = new double[2];	// 평균
		
		// 1) 이름 배열개수만큼 입력받기
		int i = 0;
		for (i=0; i<name.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ",i+1);
			name[i] = scan.next();
			System.out.printf("%d번째 국어점수를 입력하세요.>> ",i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영어점수를 입력하세요.>> ",i+1);
			eng[i] = scan.nextInt();
			System.out.printf("%d번째 수학점수를 입력하세요.>> ",i+1);
			math[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i]/3.0;
		}

		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("------------------------------------------------------");
		for (i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
		
	}

}
