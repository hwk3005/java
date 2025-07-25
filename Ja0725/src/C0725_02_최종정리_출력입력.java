import java.util.Scanner;

public class C0725_02_최종정리_출력입력 {
	public static void main(String[] args) {

//		-----------------
		// Scanner
		Scanner scan = new Scanner(System.in);  // 콘솔창에서 입력받을 때
//		-----------------
		
		// 1. 숫자 입력받을 때
		// 정수 - nextInt(), nextLong(), nextByte(), nextShort()
		// 실수 - nextDouble(), nextFloat()
		System.out.println("숫자를 입력하세요.>> ");
		int a_1 = scan.nextInt();
		System.out.println("숫자: "+a_1);
		
		
//		--------------------------------------------------------------------
		// 2. 문자열 입력받을 때
		// 문자열 - nextLine() : enter키까지 입력받음, 띄어쓰기까지 입력받음
		// 문자열 - next()	   : enter키 입력받지 x,   띄어쓰기 입력받지 x
		System.out.println("이름을 입력하세요.>> ");
		String a_2 = scan.next();
		scan.nextLine();
		System.out.println("아이디를 입력하세요.>> ");
		String b_2 = scan.nextLine();
		System.out.println("이름: "+a_2);
		System.out.println("아이디: "+b_2);

		
//	--------------------------------------------------------------------

		// println / print / printf

		
		// 1. println
		System.out.println("a");  // println (자동 enter키 입력)
		System.out.println("b");
		System.out.println("c");
		
		System.out.println("------------------");

//		--------------------------------------------------------------------
		// 2. print
		System.out.print("d\n");  // \n  (enter키 입력)
		System.out.print("e\t");  // \t  (tab키 입력)
		System.out.print("f");
		
		System.out.println("\n------------------");

//		--------------------------------------------------------------------
		// 3. printf  ( %d: 정수 / %f: 실수 / %s: 문자열 / %c: 문자 )
		int a = 10;
		int b = 20;
		int c = 30;
		String d = "홍길동";
		double e = 1.12345678;
		int h = 123;
//		System.out.println("a: "+a+"b: "+b);					// println
		System.out.printf("이름: %s, a: %d, b: %d \n",d,a,b);	// %s / %d
		System.err.printf("값: %.5f \n",e);						// %f, %.2f
		System.out.printf("%5d \n",h);							// %5d  - 5자리 출력 (빈자리 공백)
		System.out.printf("%05d \n",h);							// %05d - 5자리 출력 (빈자리 0으로 채움)
		
//		--------------------------------------------------------------------
	}
}
