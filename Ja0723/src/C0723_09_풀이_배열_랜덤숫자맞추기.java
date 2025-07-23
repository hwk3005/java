import java.util.Scanner;

public class C0723_09_풀이_배열_랜덤숫자맞추기 {

	public static void main(String[] args) {
		
		// Q1. 1~100까지 랜덤숫자를 생성해서
		// 5번을 입력해서 정답, 오답-입력숫자가 큽니다. 오답-입력숫자가 작습니다.
		// 입력된 숫자: 1,2,3,4,5
		// 정답: 50
		
		// 1) 랜덤숫자 생성
		int rnum = (int)(Math.random()*100)+1;
		// 2) 5번 입력받기
		Scanner scan = new Scanner(System.in);
		int[] input = new int[20];
		int i = 0;
		int count = 0;
		
		for (i=0; i<input.length; i++) {
			System.out.println("숫자를 입력하세요.>> ");
			input[i] = scan.nextInt();
			count++;
			// if문
			if (rnum == input[i]) break;
			else if (rnum < input[i]) {
				System.out.println("오답-입력숫자가 큽니다.");
			}else {
				System.out.println("오답-입력숫자가 작습니다.");
			}
		}
		System.out.print("입력한 값: ");
		for (i=0; i<count; i++) {		     // 입력한 값까지만 표시되도록 i<count or i<input[i] 
			System.out.print(input[i]+" ");
		}
		System.out.println();
		System.out.println("정답: "+rnum);
		
//		-----------------------------------
//		int[] score = {10,20,5,2,3};
//		for (int i=0; i<score.length; i++) {  //score.length 배열길이
//			System.out.println(score[i]);
//		}
//		System.out.println(score[2]);

	}

}
