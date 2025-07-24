import java.util.Scanner;

public class C0723_02_복습풀이_if문_계절성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Q2. 해당 월을 입력받아, 3,4,5: 봄, 6,7,8: 여름, 9,10,11: 가을 그외 겨울
		// if, switch
		System.out.println("월을 입력하세요.>> ");
		int month = scan.nextInt();
		
		// if문 (AND)
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		}else if (month >= 6 && month <=8) {
			System.out.println("여름");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
//		-----------------
//		// if문 (OR, 등가비교)
//		if (month==3 || month==4 || month==5) {
//			System.out.println("봄");
//		}else if (month==6 || month==7 || month==8) {
//			System.out.println("여름");
//		}else if (month==9 || month==10 || month==11) {
//			System.out.println("가을");
//		}else {
//			System.out.println("겨울");
//		}
		
//		-----------------
//		// Switch문
//		switch (month) {
//		case 3: case 4: case 5:
//			System.out.println("봄");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("여름");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("가을");
//			break;
//		case 12: case 1: case 2:
//			System.out.println("겨울");
//			break;
//		}
		
//		-----------------
//		// Q1. 성적을 입력받아, 90점이상 A, 80점 B, 70점 C, 60점 D, 60점미만 F 를 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성적을 입력하세요.>> ");
//		int score = scan.nextInt();
//		
//		// if else if else
//		if (score >= 90) {
//			System.out.println("A");
//		}else if (score >= 80) {
//			System.out.println("B");
//		}else if (score >= 70) {
//			System.out.println("C");
//		}else if (score >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
		
		
	}

}
