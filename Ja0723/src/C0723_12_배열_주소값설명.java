
public class C0723_12_배열_주소값설명 {

	public static void main(String[] args) {
		int[] s = new int[5];
		int[] arr = {1,2,3,4,5};  // arr - 주소값 들어가있음
		int[] a = new int[] {1,2,3,4,5};
		
		System.out.println(arr);	 // 주소값 출력
		System.out.println(arr[0]);  // 직접값 출력
	}

}
