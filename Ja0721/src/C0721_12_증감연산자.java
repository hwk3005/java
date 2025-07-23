

public class C0721_12_증감연산자 {
	
	public static void main(String[] args) {
		System.out.printf("[%5d] \n",12);
		System.out.printf("[%05d] \n",12);
		
		int a = 5;
//		a++;
//		++a;
//		System.out.println("a: "+(++a));  //6
		System.out.println("a: "+(a++));  //5
		System.out.println("-------");
		System.out.println(a);
		
		char ch = 65;  //65:A, 97:a, 48:0
		System.out.println("ch: "+ch);
		System.out.println("ch+1: "+(char)(ch+5));
		System.out.println("ch: "+(++ch));
		
		
		
	}
}
