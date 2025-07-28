
public class Cal {

	
	void powProcess(double input, int n, double[] number) {
		// 반올림
		number[0] = Math.round(input*Math.pow(10, n))/Math.pow(10, n);
		// 올림
		number[1] = Math.round(input*Math.pow(10, n))/Math.pow(10, n);
		// 버림
		number[2] = Math.round(input*Math.pow(10, n))/Math.pow(10, n);
		
		
	}
	
	
//	--------------------------------------
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void minus(int a,int b) {
		System.out.println(a-b);
	}
	void multi(int a,int b) {
		System.out.println(a*b);
	}
	void divide(int a,int b) {
		System.out.println((double)a/b);
	}
	
	
}
