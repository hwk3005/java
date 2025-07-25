import java.util.Scanner;

public class C0725_10_연습_배열_학생성적프로그램 {

	public static void main(String[] args) {
		// 학생성적프로그램
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// -------------------
		// 원하는 번호를 입력하세요.>>
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열 선언
		int[] no = new int[3];			// 번호
		String[] name = new String[3];	// 이름
		int[][] score = new int[3][3];	// 점수 (kor, eng, math)
		int[] total = new int[3];		// 합계
		double[] avg = new double[3];			// 평균
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};  // title
		
		int count = 0;	 // 입력된 학생수
		int choice = 0;  // 선택한 번호

		// 2. 전체 반복문
		while (true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("---------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();  // 원하는 번호 입력받기
			
			// 3. 조건문
			switch (choice) {
			case 1: 
				System.out.println("[ 성적입력 ]");
				// 1) 번호 입력
				no[count] = count+1;
				// 2) 이름 입력
				System.out.printf("%d번 학생이름을 입력하세요.>> \n",count+1);
				name[count] = scan.next();
				// 3) 점수 입력
				for (int i=0; i<score.length; i++) {
					System.out.printf("%s점수를 입력하세요.>> \n",title[i+2]);
					score[count][i] = scan.nextInt();
				}
				// 4) 합계,평균 저장
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				// 5) 입력됐다는 문구 출력
				System.out.printf("%d번 학생성적이 저장되었습니다.",count+1);
				count ++;
				System.out.println();
				break;
				
			case 2:
				System.out.println("[ 성적출력 ]");
				// 1) 상단 title 표시
				for (int i=0; i<title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("-----------------------------------------------------");
				// 2) 
				for (int i=0; i<count; i++) {
					System.out.printf("%d\t",no[i]);  // 번호
					System.out.printf("%s\t",name[i]);  // 이름
					for (int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t",score[i][j]);  // 성적
					}
					System.out.printf("%d\t",total[i]);  // 합계
					System.out.printf("%d\t",total[i]);  // 평균
				}
				
				break;
				
			case 3: 
				System.out.println("[ 성적수정 ]");
				break;
				
			}
			
		}

		

	}

}
