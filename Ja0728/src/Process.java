import java.util.Arrays;
import java.util.Scanner;

public class Process {
	Scanner scan = new Scanner(System.in);	// 인스턴스변수

	
//	------------------------------------------------------------------
	// 로또맞추기 메소드
	int lottoProcess(int[]num,int[]lotto,int[]myNo,int[]okNo,int count) {
		// Q1. Process.java에 메소드를 구현해서 입력번호,로또번호,맞춘번호를 출력하시오.
		// 매개변수 전달 - myNo, lotto, okNo, count

		
		// 1-45까지 숫자입력
		for (int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		// 랜덤섞기
		int temp = 0;
		int rnum = 0;
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		// 배열복사
		System.arraycopy(num, 0, lotto, 0, 6);

		// myNo 번호입력
		for (int i=0; i<myNo.length; i++) {
			System.out.printf("1-45까지 %d번째 숫자를 입력하세요.>> ",i+1);
			myNo[i] = scan.nextInt();
		}
		
		// 로또번호와 myNo번호 비교
		for (int i=0; i<lotto.length; i++) {
			for (int j=0; j<lotto.length; j++) {
				if (lotto[i] == myNo[j]) {
					okNo[count] = lotto[i];
					count++;
					break;
				}
			}
		}
		return rnum;
	}
	
//	------------------------------------------------------------------
	// 자바 메소드 단점: return 1개만 가능
	void resultProcess(int a,int b, double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	
//	------------------------------------------------------------------
	void gugudan() {	 // number 매개변수 넘김
		// 구구단
		System.out.println("2단에서부터 원하는 단을 입력하세요.>> ");
		int number = scan.nextInt();
		
		System.out.println("[ 구구단 ]");
		for (int i=2; i<=number; i++) {
			System.out.printf("[ %d 단 ]\n",i);
			for (int j=1; j<9; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}

//	------------------------------------------------------------------
	void numProcess() {
		// 숫자맞추기 프로그램
		// 1-100까지 10번 입력받아, 10이후 정답 출력
		int[] input = new int[10];
		int answer = (int)(Math.random()*100)+1;
		int i = 0;
		while (i<10) {
			System.out.println("[ 숫자맞추기 ]");
			System.out.println("1-100까지 숫자를 입력하세요.>> ");
			input[i] = scan.nextInt();
			if (answer > input[i]) {
				System.out.println("입력한 값이 작습니다. 더 큰수를 입력하세요.");
			}else if (answer < input[i]) {
				System.out.println("입력한 값이 큽니다. 더 작은수를 입력하세요.");
			}else {
				System.out.println("정답입니다.");
				break;
			}
			i++;
		} // while
		
		System.out.println("정답: "+answer);
		System.out.println("입력번호: "+Arrays.toString(input));
	}
	
}
