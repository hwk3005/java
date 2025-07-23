import java.util.Scanner;

public class C0722_13_풀이_switch문가위바위보 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Q1. 랜덤숫자 1-100까지 랜덤숫자를 출력하시오.
		// 가위-1, 바위-2, 보-3
		// 1-3=-2, 2-1=1, 3-2=1 -> 승리
		// 1-1=0,  2-2=0, 3-3=0 -> 무승부
		// 1-2=-1, 2-3=-1, 3-1=2 -> 패
		System.out.println("[ 가위바위보 게임 ]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("--------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int rnum = (int)(Math.random()*3)+1;  //1-5
		int choice = scan.nextInt();
		
		String my = "";
		String you = "";
		
//		-----------------
		// switch문으로 해서 출력하시오.
		int result = choice-rnum;
		switch(result) {
		case -2: case 1:
			System.out.println("승리");
			break;
		case 0:
			System.out.println("무승부");
			break;
		case -1: case 2:
			System.out.println("패");
			break;
		}
		
//		-----------------
		// 랜덤
		switch(rnum) {
		case 1:
			you = "가위";
			break;
		case 2:
			you = "바위";
			break;
		case 3:
			you = "보";
			break;
		}
		System.out.println("랜덤: "+you);
		
//		-----------------
		// 직접
		switch(choice) {
		case 1:
			my = "가위";
			break;
		case 2:
			my = "바위";
			break;
		case 3:
			my = "보";
			break;
		}
		System.out.println("선택: "+my);
		
//	-----------------
		
	}
}
