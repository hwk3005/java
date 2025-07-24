import java.util.Scanner;

public class C0724_04_풀이_배열_로또2 {
	public static void main(String[] args) {
		// Q1. 1~45까지 숫자 6개를 입력받고
		// 로또번호 6개를 생성해서 출력하시오.
		// 입력번호: 1 45 3 10 5 20
		// 로또번호: 20 4 9 35 7 21
		Scanner scan = new Scanner(System.in);
		
		// 1. 1~45 배열생성
		int[] input = new int[6];  // 입력
		int[] lotto = new int[6];  // 출력(로또)
		int[] num = new int[45];   // 1~45 로또번호

		int rnum = 0;  // 랜덤번호 생성사용
		int temp = 0;  // 임시저장
		
		// 2. 입력번호 입력
		for (int i=0; i<input.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1~45) >> ",i+1);
			input[i] = scan.nextInt();
		}
		// 3. 로또번호 생성
		for (int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		// 4. 로또번호 섞기
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		// 5. 입력번호 출력
		System.out.print("입력번호: ");
		for (int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		// 6. 로또번호 출력
		System.out.print("로또번호: ");
		for (int i=0; i<lotto.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}	
}
