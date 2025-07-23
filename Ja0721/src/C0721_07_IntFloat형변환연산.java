

public class C0721_07_IntFloat형변환연산 {

	public static void main(String[] args) {
		int a = 7000000;
		int result = 7000000 * 7000000 / 7000000;  // -183 (곱하기 먼저)
		// 49,000,000,000,000 (49조) -> 21
		System.out.println("result: "+result);
		
		int result2 = 7000000 / 7000000 * 7000000;  // 7000000 (나누기 먼저)
		System.out.println("result2: "+result2);
		
		int n = 65;
		System.out.println("n: "+n);
		char ch = (char) n;
		System.out.println("ch: "+ch);
		
		float f =  1.6f;
		System.out.println("f: "+f); // 1.6
		int num = (int) f;
		System.out.println("num: "+num); //1
		float f2 = num;
		System.out.println("f2: "+f2);   //1.0
		
		
		
	}

}
