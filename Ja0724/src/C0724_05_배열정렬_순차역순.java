import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class C0724_05_배열정렬_순차역순 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];  // 기본형 타입
		
		Integer[] input2 = {10,20,3,9,5};  // 객체타입
		
		for (int i=0; i<6; i++) {
			System.out.printf("%d 번째 입력: \n",i+1);
			input[i] = scan.nextInt();
		}
		Arrays.sort(input);  // 순차정렬: input 배열 바로 수정
//		Arrays.sort(input,Collections.reverseOrder());  // 역순정렬: 기본타입-정렬불가, 객체타입-정렬가능.
		System.out.println("입력번호: "+Arrays.toString(input));
		
	}

}
