import java.util.Scanner;
public class C0724_13_풀이_2차원배열_랜덤좌표 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[25];
		String[][] arr = new String[5][5];
		
		//1-25까지 숫자 입력, 랜덤으로 번호섞어서 arr배열에 입력해서 출력하시오.
		// num배열 - int, arr배열 - String
		//자동 번호입력
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		int temp = 0;
		int randomNum = 0;
		//랜덤섞기
		for(int i=0;i<300;i++) {
			randomNum = (int)(Math.random()*25); //랜덤번호
			temp = num[0];
			num[0] = num[randomNum]; //랜덤선택번호
			num[randomNum] = temp;
		}
		
		// [5][5] 1-25 순차번호를 입력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = num[5*i+j]+"";
			}
		}
		
		while(true) {
			// [5][5] 출력
			System.out.println();
			System.out.println("            [ 2차원 배열  ] ");
			System.out.println("--------------------------------------");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			
			// 좌표 찍기
			System.out.println("--------------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			String input = scan.next(); //14
			
			// 입력된 번호에 해당하는 숫자를 X표시
			loop:for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j].equals(input)) {
						arr[i][j] = "X";
						break loop;
					}
				}
			}
					
			
			
		}
		
		
		
	}
}





