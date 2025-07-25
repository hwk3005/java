import java.util.Scanner;

public class C0725_09_풀이_2차원배열_랜덤맞추기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Q1. 순차번호 - arr 출력
		// Q2. 랜덤번호 - arr2 출력

		
		// 0. 배열 선언
		String[] num = new String[45];
		String[][] arr = new String[9][5];	// 순차번호
		String[][] arr2 = new String[9][5];	// 랜덤번호
		
		
		// 1. 번호 넣기
		// 1-1. 45개 번호 넣기 - num
		for (int i=0; i<num.length; i++) {
			num[i] = (i+1)+"";	// "" 문자열!!
		}
		
		// 1-2. 2차원배열 순차번호 넣기 - arr
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		
		// 2. 번호 섞기
		String temp = "";
		int rnum = 0;
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}

		// 1-3. 2차원배열 랜덤번호 넣기 - arr2
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = num[5*i+j];
			}
		}
		
		// 3. 번호 출력
		// 3-1. 순차번호 출력 (2차원 배열)
//		System.out.println("[ 순차번호 출력 ]");
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		// 3-2. 랜덤번호 출력
		while (true) {
			System.out.println("[ 랜덤번호 출력 ]");
			System.out.println("-----------------------------");
			for (int i=0; i<arr2.length; i++) {
				for (int j=0; j<arr2[i].length; j++) {
					System.out.print(arr2[i][j]+"\t");
				}
				System.out.println();
			}
		// 4. 번호 입력받아 해당번호 위치에 X를 표시하시오.
			System.out.println("_____________________________");
			System.out.println("원하는 번호를 입력하세요.>> ");
			String choice = scan.next();
			loop:for (int i=0; i<arr2.length; i++) {
				for (int j=0; j<arr2[i].length; j++) {
					if (arr2[i][j].equals(choice)) {
						arr2[i][j] = "X";
						break loop;
					}
				}
			}
			
		} // while
		
		

	} // main

} // class
