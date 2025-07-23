

import java.util.Scanner;

public class C0721_10_풀이_Scanner2 {

	public static void main(String[] args) {
		// Q1. 이름, 국어,영어,수학, 합계,평균 점수를 입력받아 출력하시오.
		// 1. Scanner 2.이름 3.국어 4.영어 5.수학 -> 이름,국어,영어,수학,합계,평균 점수 출력

		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.>> ");
		String name = scan.nextLine();
		System.out.println("국어점수를 입력하세요.>> ");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>> ");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>> ");
		int math = scan.nextInt();
		int total = kor + eng + math;
		double avg = (double) total / 3;
		System.out.println("이름: " + name);
		System.out.println("합계: " + total); // 자리수 결정이 안 됨.
		System.out.println("합계: %d \n" + total); // 자리수 결정이 안 됨.
		System.out.printf("평균: %.2f \n", avg);
		System.out.printf("평균: %e \n", avg);

		System.out.printf("이름: %s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f \n", name, kor, eng, math, total, avg);
	}

}
