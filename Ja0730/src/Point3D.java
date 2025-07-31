
public class Point3D extends Point {	// Point 상속받음
	int z;
	
	Point3D (int x, int y, int z){
//		super();	// 조상의 기본생성자를 자동입력되어 호출
		super(x,y);	// 기본생성자가 없을경우, 설정을 해줘야 함. super(); -> Point();
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	String getLocation() {
		return String.format("x: %d, y: %d, z: %d \n", x,y,z);	// String.format() == printf의 개념
//		return "x: "+x+", y: "+y+", z: "+z;		// 이렇게 해도 됨.
	}
	
}
