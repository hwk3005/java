import java.util.Scanner;

public class C0725_11_자습 {

	public static void main(String[] args) {
		// [ 학생성적 프로그램 ]
		// 1. 학생성적입력
		// 2. 학생성적출력
		// 3. 학생성적수정
		// 0. 프로그램종료
//		---------------------------------
		
		// 1. 배열 선언
		int[] no = new int[3];			// 번호
		String[] name = new String[3];	// 이름
		int[][] score = new int[3][3];	// 점수 (국어,영어,수학)
		int[] total = new int[3];		// 합계
		double[] avg = new double[3];	// 평균
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};	// title

		// 변수 선언
		int choice = 0;		// 선택한 번호
		int count = 0;		// 학생수
		
		Scanner scan = new Scanner(System.in);
		
		// 2. 입력받기
		System.out.println("------------------------------");
		System.out.println("     [ 학생성적 프로그램 ]");
		System.out.println("------------------------------");
		System.out.println(" 1. 학생성적입력");
		System.out.println(" 2. 학생성적출력");
		System.out.println(" 3. 학생성적수정");
		System.out.println(" 0. 프로그램 종료");
		System.out.println("------------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		
		// choice 선택했을 때! 조건문 Switch
		switch (choice) {
		case 1:
			System.out.println("[ 1. 학생성적입력 ]");
			// 1) 번호 배열값 입력
			no[count] = count+1;

			// 2) 이름 입력받기
			System.out.printf("%d번째 학생이름을 입력하세요.(0.취소)>> ",count+1);
			name[count] = scan.next();
			// 0.취소
			if (name[count].equals("0")) {
				System.out.println("이전화면으로 이동합니다.");
				System.out.println();
				break;
			}
			
			// 3) 점수 입력받기
			for (int i=0; i<score.length; i++) {		// 행
				System.out.printf("%s점수를 입력하세요.>> ",title[i+2]);
				score[count][i] = scan.nextInt();
			}
			
			count++;
			break;
		case 2:
			System.out.println("[ 2. 학생성적출력 ]");
			break;
		case 3:
			System.out.println("[ 3. 학생성적수정 ]");
			break;
		case 0:
			System.out.println("[ 0. 프로그램 종료 ]");
			break;
			
		}
		
		
		
		
		
		// 성적 입력받기
		
	}

}
