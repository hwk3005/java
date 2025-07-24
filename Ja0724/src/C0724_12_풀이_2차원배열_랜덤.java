import java.util.Scanner;

public class C0724_12_풀이_2차원배열_랜덤 {

	public static void main(String[] args) {
		// 1~25까지 숫자를 자동 입력한 후, 랜덤으로 번호를 섞어 출력하시오. 
		
		// 0. 입력 설정
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열 생성
		int[] num = new int[25];
		int[][] arr = new int[5][5];
		
		
		// 2. 자동번호 입력
		for (int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		// 3. 랜덤 섞기 (자동번호를 300번 섞기)
		int temp = 0;  // 임시저장
		int rnum = 0; // 랜덤 번호
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*25);  // 랜덤번호
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 번호 출력
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]+"\t");
		}
		
		// [5][5] 1~25 순차번호 입력
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		System.out.println();
		System.err.println("--------------------------------");
		// [5][5] 1~25 출력
		System.out.println("[5][5] 배열");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
