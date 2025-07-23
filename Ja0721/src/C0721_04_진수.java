public class C0721_04_진수 {
	public static void main(String[] args) {
		
		boolean power = true;
		char ch = 'A';
		char ch2 = '\u0061';  // 역슬래시u: 16진수 의미, 16*4+1*1 = 65
		char ch3 = 55;  // 아스키문자표 참고  // 외우기 - 65: A, 97: a, 48(10진수): 0(문자)
		char tab = '\t';
		char enter = '\n';
		
		System.out.println("power: "+power);
		System.out.println("ch: "+ch);
		System.out.println("ch2: "+ch2);
		System.out.println("ch3: "+ch3);
		System.out.println("aaa"+ch3+"bbb");
		System.out.println("aaa"+tab+"bbb");
		System.out.println("aaa"+enter+"bbb");
		System.out.println("aaa\t\tbbb");
		
		byte b = 127;
		System.out.println("byte: "+b);
		
		int hex = 0x100;  //16진수 16*16*1 (0x 일 경우)
		System.out.println("hex: "+hex);
		
		int oct = 0100;   //8진수 8*8*1 (맨앞에 0인 경우)
		System.out.println("oct: "+oct);
		
		long l = 10000000000L;
		float f = 3.14F;
		double d = 3.14;
		double d2 = 3.14D;
		double d3 = 3.14d;
		
		double d4 = 100;
		System.out.println("d4: "+d4);
		
		
	}
}
