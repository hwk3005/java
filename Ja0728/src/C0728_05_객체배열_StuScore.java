import java.util.Scanner;

public class C0728_05_객체배열_StuScore {

	public static void main(String[] args) {
		// Q1. (객체 배열 관련 문제)
		// 홍길동 100 100 100 300 100.0
		// 유관순 90  90  90  270  90.0
		// 이순신 80  80  80  240  80.0
		
		// 객체에 대한 배열을 선언
		// 객체를 선언해서
		// 위 3개 정보를 입력하고
		// 위 3개를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		
		// 객체 배열 선언, 입력받기
		StuScore[] s = new StuScore[3];	// 배열 선언
		for (int i=0; i<s.length; i++) {
			s[i] = new StuScore();			// 객체 선언
			System.out.println("이름을 입력하세요.>> ");		
			s[i].name = scan.next();
			System.out.println("국어점수를 입력하세요.>> ");		
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>> ");		
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>> ");		
			s[i].math = scan.nextInt();
			s[i].stuTotal();
			s[i].stuAvg();
		}
		
		// 객체 배열 출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		
		for (int i=0; i<s.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
		
		
		
//		s[1] = new StuScore();			// 객체 선언
//		s[1].name = "유관순";
//		s[1].kor = 90;
//		s[1].eng = 90;
//		s[1].math = 90;
//		s[1].total = s[1].kor + s[1].eng + s[1].math;
//		s[1].avg = s[1].total/3.0;
//		
//		s[2] = new StuScore();			// 객체 선언
//		s[2].name = "이순신";
//		s[2].kor = 80;
//		s[2].eng = 80;
//		s[2].math = 80;
//		s[2].total = s[2].kor + s[2].eng + s[2].math;
//		s[2].avg = s[2].total/3.0;
		
		

	}

}
