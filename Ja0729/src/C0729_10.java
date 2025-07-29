import java.util.Scanner;

public class C0729_10 {

	public static void main(String[] args) {
		// 학생성적입력
		// no - 객체선언을 하면 자동으로 번호가 증가되도록 구현
		// 이름, 국어,영어,수학, 합계,평균까지 입력되도록 구현
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];	// 배열선언
		int n = 0;	// 배열에 사용되는 번호
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			// 프로그램 구현
			// 이름,국어,영어,수학입력받아
			// 매개변수가 있는 생성자를 사용하여 저장하시오.
			// Stuscore 클래스 -> 초기화블럭 사용해서 번호증가
			
			
			System.out.printf("%d번째 이름을 입력하세요.>> \n");
			String name = scan.next();
			System.out.println("국어점수를 입력하세요.>> ");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>> ");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>> ");
			int math = scan.nextInt();
			
			
			
			
			
			// 입력정보 : 1,홍길동,100,100,99,299,99.67
			// 입력정보 : 2,유관순,90,90,91,271,90.33
//			no++;
			break;
			
		}
		
		
		
	}
	

}
