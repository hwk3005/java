import java.util.Scanner;

public class C0725_03_최종정리_조건문 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 조건문
		
		
//		--------------------------------------------------------------------
		// 2. switch문
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("번호를 입력하세요.>> ");
		int input_2 = scan.nextInt();
		
		switch (input_2) {
		case 1:		// (가능) case 문자:  /  (불가) case 문자열: 
			System.out.println("[ 성적입력 ]");
			break;
		case 2:
			System.out.println("[ 성적출력 ]");
			break;
		case 3:
			System.out.println("[ 성적수정 ]");
			break;
		}
		
//		--------------------------------------------------------------------
		// 1. if문
		
		System.out.println("숫자를 입력하세요.>> ");
		int input = scan.nextInt();
		
		// 1-1. 짝수, 홀수
		if (input%2 == 0) {				// 한줄은 { } 중괄호 생략 가능
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

//		--------------------------
		// 1-2. 양수, 0, 음수
		if (input > 0) {
			System.out.println("양수");
		}else if (input == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
//		--------------------------------------------------------------------
		
		
	}
}
