import java.util.Scanner;

public class C0722_07_삼항식 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1을 입력하세요.>> ");
		int n1 = scan.nextInt();
		
		System.out.println("숫자2를 입력하세요.>> ");
		int n2 = scan.nextInt();

		System.out.println("숫자3을 입력하세요.>> ");
		int n3 = scan.nextInt();
		
		
		// Q4. 제일 큰 수를 출력하시오.
		int result = (n1>n2)? ( n1>n3? n1:n3 ):( n2>n3? n2:n3 );
		System.out.println("제일 큰 수: "+result);
		System.out.printf("n1: %d, n2: %d, n3: %d \n",n1,n2,n3);
		
		
		
//		-----------------
//		// Q3. n1 크다, n1,n2가 같다, n1 작다
//		String result = ( (n1>n2)? "n1 크다":(n1==n2)? "n1,n2가 같다":"n1 작다");
//		System.out.println(result);
		
//		-----------------
//		// Q2. 0보다 크다, 0이다, 0보다 작다.
//		String result2 = (result>0)? "0보다 크다":(result==0)? "0이다":"0보다 작다";
//		System.out.println("결과: "+result2);	
		
//		-----------------
//		// Q1. 삼항식 60점 이상이면 합격, 미만이면 불합격
//		String result2 = result >= 60 ?  "합격":"불합격";
//		System.out.println("결과: "+result2);
				
//		-----------------
//		int  x = -10;
//		int absX = x >= 0 ? x : -x;  // 해석: x>=0 이면(?) x(true) 아닐경우(:) -x(false);
//		System.out.println(absX);
//		
//		String result = x%2==0?"짝수":"홀수";  // 삼항식
//		System.out.println(result);
//		
//		// 짝수인지 아닌지
//		if (x%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
	}

}
