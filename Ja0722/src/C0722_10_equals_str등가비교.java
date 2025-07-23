import java.util.Scanner;

public class C0722_10_equals_str등가비교 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String input = scan.next();
		String str1 = "c";  // String == 등가비교안됨, equals()함수를 사용해야 비교가능
		
		if (input.equals("c") || input.equals("C")) {
			System.out.println("프로그램 종료");
		}else {
			System.out.println("프로그램 종료가 안 됩니다.");
		}

		if (input.equalsIgnoreCase(str1)) {
			System.out.println("c 입니다.");
		}else {
			System.out.println("c가 아닙니다.");
		}
	}

}
