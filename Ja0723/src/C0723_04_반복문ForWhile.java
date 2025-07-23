import java.util.Scanner;

public class C0723_04_반복문ForWhile {

	public static void main(String[] args) {
		// for문 초기값(2개도가능), 조건식, 증감식, 블럭(중괄호){} or 문장
		// 반복문 - for, while
		
		// Q1. 숫자 맞추기 프로그램
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*10)+1;  // 1~10까지 랜덤숫자 생성
		
		for (int i=0; i<5; i++) {
//			System.out.println(i);
			
			System.out.printf("%d 번째 숫자를 입력하세요.>> ",i+1);
			int input = scan.nextInt();
			if (rnum == input) {
				System.out.printf("정답: %d, 입력값: %d \n",rnum,input);
				break;
			}else if (rnum > input) {
				System.out.printf("입력: %d, 입력값이 더 작습니다. \n",input);
			}else {
				System.out.printf("입력: %d, 입력값이 더 큽니다. \n",input);
			}
		}		
		System.out.println("정답: "+rnum);
		
//		-----------------
//		int a = 1;
//		int b = 2;
//		int c,d = 0;
//		int e=0, f=10;  	  // 같은 타입 - 한줄 표기 가능
//		int g=0, double h=0;  // 다른 타입 - 한줄 표기 불가
		
//		-----------------
//		for (int i=0;;i++) {
//			System.out.println(i);
//		}

//		-----------------
//		while (true) {
//			
//		}

//		-----------------
//		int sum = 0;
//		for (int i=1; i<=10; i++) {
////			sum = sum + i;
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		-----------------
//		// 1-10: 55, 1-100: 5050, 1-1000: 500500, 1-10000: 50005000
//		int sum = 0;
//		int i = 0;
//		for(i=1; i<=10; i++) {
//			System.out.println(i);
//			sum += i;
//		}
//		// 정수 %05d (5자리출력,빈공백0으로 채움), 실수 %.2f (소수점 2자리까지 출력), 문자열: %s, 문자: %c
//		System.out.printf("[ 1 ~ %d 까지 합: %d ] \n",(i-1), sum);  // for문 안에만 i 선언되어 있음.
//		System.out.println("합계: "+sum);
		
		
//		-----------------		
//		// for문 - 반복개수
//		for (int i=0; i<10; i++) {   // i++  - 1씩 증가  /  i+=2  - 2씩 증가
//			System.out.println(i);
//		}
		
//		-----------------	
//		// while문 - 조건
//		int j=0;  // 초기화
//		while (j<10) {  // 조건식
//			System.out.println(j);
//			j++;  // 증감식
//		}
		
//		-----------------
//		// do while문 - 조건 (한번은 꼭 실행돼야 할 때)
//		int k=0;
//		do {
//			System.out.println(k);
//		}while(k<10);
	}

}
