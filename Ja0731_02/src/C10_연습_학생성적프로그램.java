import java.util.Scanner;

public class C10_연습_학생성적프로그램 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no,kor,eng,math,total;
		String name;
		double avg;
		
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			// 학생성적입력 메소드
			System.out.println("학생이름을 입력하세요.>> \n");
			name = scan.next();
			System.out.println("국어점수를 입력하세요.>> ");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>> ");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>> ");
			math = scan.nextInt();
			
			System.out.printf("%s 학생성적이 저장되었습니다. \n",name);
			
			break;
		case 2:
			// 학생성적출력 메소드
			
			
			break;
			
		}
		
		
		
		
		
	}

}
