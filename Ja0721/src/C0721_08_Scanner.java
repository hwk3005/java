

import java.util.Scanner;

public class C0721_08_Scanner {

	public static void main(String[] args) {
//		print("");
//		input("숫자를 입력하세요. ");
		Scanner scan = new Scanner(System.in);  // import 안해놓을경우: java.util.Scanner 다 붙여야 함.
		System.out.println("숫자를 입력하세요.");
//		double num = scan.nextDouble();
		// next(), nextLine(): 문자열
		// nextByte(),nextShort(),nextInt(),nextLong(): 정수형
		// nextFloat(), nextDouble(): 실수형
		int num = scan.nextInt();  // 5 + enter키
		scan.nextLine();		   // nextLine문자만 할 때 넣음
		System.out.println("입력한 숫자: "+num);
		System.out.println("숫자2를 입력하세요. ");
		String str = scan.nextLine();  //입력받은 내용을 input에 저장
		//int타입으로 변경
		int num2 = Integer.parseInt(str);  //입력받은 내용을 int타입의 값으로 변환, 문자열을 정수형으로 변환
		System.out.println("숫자 더하기: "+(num+num2)); //5+100 = 105
		
		
		
//		String str = "abc";
//		String str2 = new String("abc");  // String 많이 써서 예외처리 해줌. 원래 import, new 타입 붙여줘야함.
//		int a = 100;
		
		
	}

}
