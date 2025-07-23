import java.util.Scanner;

public class C0722_11_풀이_타입연산_if문가위바위보 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Q1. 랜덤숫자 1-100까지 랜덤숫자를 출력하시오.
		int rnum = (int)(Math.random()*3)+1;  // 1-5
		
		// 가위-1, 바위-2, 보-3
		// 1-3=-2,2-1=1,3-2=1 - 승리
		// 1-1=0,2-2=0,3-3=0 - 무승부
		// 1-2=-1,2-3=-1,3-1=2 - 패
		// if문을 사용해서 가위바위보 게임을 완성하시오.
		System.out.println("[ 가위바위보 게임 ]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("-------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		String my = "";
		String you = "";

		// 가위바위보 내기 
		if (choice == 1) {
			my = "가위";
		}else if (choice == 2) {
			my = "바위";
		}else {
			my = "보";
		}
		
		// 랜덤
		if (rnum == 1) {
			you = "가위";
		}else if(rnum == 2) {
			you = "바위";
		}else {
			you = "보";
		}
		
		// Q1-1. 승리, 무승부, 패 출력하시오.
		if (choice - rnum == -2 || choice - rnum == 1) {
			System.out.println("승리");
		}else if (choice - rnum == 0) {
			System.out.println("무승부");
		}else {
			System.out.println("패");
		}
		
		System.out.println("랜덤: "+you);
		System.out.println("선택: "+my);
		
//		-----------------
//		System.out.println("숫자를 입력하세요.>> ");
//		int input = scan.nextInt();
//		if (input == rnum) {
//			System.out.println("정답");
//		}else {
//			System.out.println("오답");
//		}
//		System.out.println("랜덤숫자: "+rnum);
				
//		-----------------
//		System.out.println("숫자를 입력하세요.>> ");
		// 0.0*10 <= Math.random()*10 < 1*10
		// 0+1 <= x+1 < 10+1
		// 1   <= x   < 11
		// 0.7529661706559259 -> 0.7 : 7
//		System.out.println((int)(Math.random()*10)+1);  // 1 <= x = 10 
//		System.out.println(Math.floor(Math.random()*10));  // 0.7529661706559259
			
//		-----------------
//		// boolean 비교 연산
//		boolean power = false;
//		if (!power) {
//			power = true;
//		}
				
//		-----------------
//		// String 공백 연산
//		System.out.println("문자를 입력하세요.>> ");
//		String input = scan.nextLine();  // enter키 문자로 인식, 입력으로 받음
////		String input = "";
//		char ch = ' ';
//		if (input != null && !input.equals("")) {
//			ch = input.charAt(0);
//		}
//		
//		System.out.println("출력: "+ch);
		
	}
}
