import java.util.Scanner;

public class C0724_14_연습_2차원배열_랜덤좌표 {

	public static void main(String[] args) {
		// Q1. 연습문제
		// 1차원 배열 -> 1~25까지 순차번호 입력
		// 랜덤으로 번호섞기 (ex. 300번)
		// 2차원 배열 -> [5][5] 랜덤번호를 입력해서 출력하시오.

		// 0. Scanner 설정
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열 선언
		int[] num = new int[25]; 			// 1차원
		String[][] arr = new String[5][5];  // 2차원
		
		
		// 2. 자동 번호입력
		for (int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		
		// 3. 랜덤 번호섞기
		int temp = 0;
		int randomNum = 0;
		
		for (int i=0; i<300; i++) {
			randomNum = (int)(Math.random()*25); // 랜덤 생성
			temp = num[0];
			num[0] = num[randomNum];
			num[randomNum] = temp;
		}
		
		
		// 4. [5][5]에 1~25 랜덤번호 입력
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j] + "";
			}
		}
		
		// 5. [5][5] 랜덤번호 출력
		int countX = 0;  // X 개수 세기
		
		stop:while (true) {
			System.out.println("           [ 2차원 배열  ]");
			System.out.println("--------------------------------------");
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}

//      --------------- 내가 추가로 gpt에 물어봐서 연습해본 부분 --------------
			// 5-5. X가 25개 되면 종료 출력 및 반복문 종료
			//  - X 개수 계산
			countX = 0;
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					if (arr[i][j].equals("X")) {
						countX ++;
					}
				}
			}
			// - 종료 출력
			if (countX == 25) {
				System.out.println("--------------------------------------");
				System.out.println("X좌표가 모두 채워졌습니다. 종료합니다.");
				break stop;
			}
//      ------------------------------     끝     -----------------------------
			
			
			// 6. [5][5] 랜덤번호 출력 - 좌표 X 표시
			System.out.println("--------------------------------------");
			System.out.println("위에서 원하는 번호를 입력하세요.");
			String input = scan.next(); 
			
			loop:for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					if (arr[i][j].equals(input)) {
						arr[i][j] = "X";
						break loop;
					} // if
				} // for - j
			} // for - i
			
			
		} // while
		

		
	} // main

} // class
