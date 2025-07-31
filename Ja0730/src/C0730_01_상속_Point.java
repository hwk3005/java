
public class C0730_01_상속_Point extends Point {

	
	
//	int x;	// 인스턴스변수 - 객체선언후사용, 개별, 참조변수명.변수명
//	int y;
	int z;
	
	public static void main(String[] args) {
		C0730_01_상속_Point c = new C0730_01_상속_Point();
		System.out.println("x: "+c.x);	// 상속을 받아 x 출력가능
		System.out.println("z: "+c.z);
		c.x = 100;
		c.add();
		
		
	}

}
