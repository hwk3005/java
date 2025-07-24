import java.util.Scanner;

public class C0724_10_연습_배열whileSwitch_성적 {

	public static void main(String[] args) {
		// 0. Scanner 설정
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 배열선언
		int[] no = new int[3];  		// no
		String[] name = new String[3];  // name
		int[][] score = new int[3][3];  // score
		int[] total = new int[3]; 		// total
		double[] avg = new double[3];	// avg
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"}; // title

		int count = 0; 
		
		// 2. 출력구문 - while(true), switch구문
		while (true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("--------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요.(0.종료) >> ");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				// 3. 입력구문
				// 4. 취소부분추가
				System.out.println("[ 학생성적입력 ]");
				System.out.printf("%d번 학생이름을 입력하세요.(0.취소) >> ",count+1);
				System.out.println();
				break;
				
			case 2:
				// 5. 출력부분
				System.out.println("[ 학생성적출력 ]");
				
				System.out.println();
				break;
				
			case 3:
				System.out.println("[ 학생성적수정 ]");
				
				System.out.println();
				break;
				
			case 0:
				// 6. 프로그램 종료
				System.out.println("[ 프로그램종료 ]");
				System.out.println("프로그램이 종료되었습니다.");
				System.out.println();
				break;
				
			} // switch

		}
		
		
	} // main

} // class

