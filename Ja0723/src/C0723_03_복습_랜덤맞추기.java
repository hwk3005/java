import java.util.Scanner;

public class C0723_03_복습_랜덤맞추기 {
	public static void main(String[] args) {
		
		// Q1. 랜덤숫자 맞추기 
		
		Scanner scan = new Scanner(System.in);
//		double ran = (int)(Math.random()*10);  // 0~9
		double rnum = (int)(Math.random()*10)+1;  // 1~10
		System.out.println("[ 랜덤숫자 맞추기 ]");
		System.out.println("1~10까지 숫자를 입력하세요.>> ");
		int input = scan.nextInt();
		
		// if문 사용, 정답, 오답(입력숫자가 더 큽니다. / 입력숫자가 더 작습니다.)
		if (rnum == input) {
			System.out.println("정답");
		}else if (rnum < input) {
			System.out.println("오답-입력숫자가 더 큽니다.");
		}else {
			System.out.println("오답-입력숫자가 더 작습니다.");
		}
		
		
		System.out.println("랜덤숫자: "+rnum);
		System.out.println("입력숫자: "+input);
	}
}
