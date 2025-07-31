
public class C0730_02_풀이_상속관계_원형삼각형_PointShapeCircleTriangle {

	public static void main(String[] args) {
		
		// 원형 그림
		Circle c1 = new Circle();
		c1.draw(c1.sname, c1.center);
		Circle c2 = new Circle(new Point(150,150),50);	// Circle, Point 클래스 참고
		c2.draw(c2.sname, c2.center);	// Shape 클래스 참고
		
		// 삼각형 그림
		Point[] p = {
				new Point(100,100),	// Point(x축,y축)
				new Point(140,50),	// -> 객체타입
				new Point(200,100)
		};	// 객체배열 생성
		
		Triangle t1 = new Triangle(p);
		t1.draw(t1.sname,p);
		
		
		
//		----------------------
//		int[] a = {
//				1,	// -> 기본타입
//				2,
//				3
//		};
//		int[] b = {1,2,3};
		
		
		
	}

}
