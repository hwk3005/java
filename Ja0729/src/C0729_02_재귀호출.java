
public class C0729_02_재귀호출 {

	public static void main(String[] args) {
		// 재귀호출 : 메서드 내에서 자기 메서드를 다시 호출하는 것
		
		
		long result = factorial(5);
		// 5 * 4 * 3 * 2 * 1 = 120
		System.out.println("결과: "+result);
		
		
//		----------------------------------------------
		// 재귀호출보다 for문 돌리는 속도가 더 빠름
		long num = 1;
		for (int i=1; i<=5; i++) {
			num *= i;
		}
		System.out.println("for 결과: "+num);
//		----------------------------------------------
		
	}

	public static long factorial(int n) {
		long result = 0;
		if (n==1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
		}
		return result;
	}
	
}
//-- 꼭 외우기 --
//로또맞추기
//학생성적프로그램
//카드
//-- 추가 --
//숫자맞추기
//구구단





