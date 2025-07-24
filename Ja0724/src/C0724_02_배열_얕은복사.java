import java.util.Arrays;

public class C0724_02_배열_얕은복사 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int num = 5;
		
		System.out.println(Arrays.toString(arr));  // arr값 출력 : [1, 2, 3, 4, 5]
		System.out.println(arr);				   // 주소값 출력: [I@28a418fc
		
		
		// 기본변수: 정수형 값변경
		int num2 = 0;
		num2 = num;				   // 위에 int num = 5; 값 가져옴.
		System.out.println(num2);  // 5
		num = 10;				   // 무효처리됨
		System.out.println(num2);  // 5
		
		// 배열: 값변경
		int[] arr2 = {0,0,0,0,0};
		System.out.println(Arrays.toString(arr2));  // [0, 0, 0, 0, 0]
		arr2 = arr;									// 얕은 복사 - 주소값만 복사됨
		System.out.println(Arrays.toString(arr2));  // [1, 2, 3, 4, 5]
		arr[0] = 100;
		arr[1] = 200;
		System.out.println(Arrays.toString(arr2));	// [100, 200, 3, 4, 5]
		
		System.out.println(arr);
		System.out.println(arr2);
		
	}
}
