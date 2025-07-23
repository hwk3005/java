public class C0721_06_오버플로우 {

	public static void main(String[] args) {
		// 오버플로우
		byte b = 127;
		System.out.println("b: "+b);
		b = (byte) (b + (byte)1);  //127+10 = 137
		// byte -128~127 : 137 숫자는 넣을 수 없음.
		System.out.println("b: "+b);
		
		int a = 2147483647;
		a = a+3;
		System.out.println("a: "+a);
		
	}

}
