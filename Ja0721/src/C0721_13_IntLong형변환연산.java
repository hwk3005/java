

public class C0721_13_IntLong형변환연산 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
//		long c = a*b;  // 에러: long = int*int
		long c = (long)a*b;
//		a/3.0;
		System.out.println("c: "+c);  //2000000000000;
		
		int d = 1000000;
		int e = 1000000;
		int f = (int)((long)d * e);
		System.out.println("f: "+f);
		int g = d / e * e;
		System.out.println("e: "+e);
		
		
	}

}
