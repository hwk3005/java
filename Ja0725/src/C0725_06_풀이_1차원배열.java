import java.util.Arrays;
import java.util.Scanner;

public class C0725_06_풀이_1차원배열 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Q2. 45개 배열을 생성해서 1~45까지 랜덤숫자를 섞고 입력하시오.

		// 1) 배열선언
		int[] arr = new int[45];	// 랜덤번호 45개
		int[] lotto = new int[6];	// 로또번호 6개
		int[] myNo = new int[6];	// 입력번호 6개
		int[] okNo = new int[6];	// 정답번호 6개
		int count = 0;

		// 2) 배열 번호입력
		for (int i=0; i<45; i++) {
			arr[i] = i+1;
		}

		// 입력번호 받기
		for (int i=0; i<6; i++) {
			System.out.println("입력된 번호: "+Arrays.toString(myNo));
			System.out.println("1~45까지 번호를 입력하세요.>> ");
			myNo[i] = scan.nextInt();
		}
		
		
		// 3) 랜덤섞기
		int temp = 0;	// 임시저장 번호
		int rnum = 0;	// 랜덤 번호
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		// 배열복사 메소드 사용
		System.arraycopy(arr, 0, lotto, 0, 6);
		
		
		// 4) 배열 번호출력
		System.out.println("로또번호: ");
		for (int i=0; i<6; i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}
}
