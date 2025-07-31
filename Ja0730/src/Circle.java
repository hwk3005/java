
public class Circle extends Shape {
	
	String sname = "Circle";
	// 원형그리기 - 원점, 반지름 필요
	Point center;	// 원점, Point 객체 - x,y(축)
	int r;			// 반지름
	
	// 기본생성자
	Circle(){
		this(new Point(0,0),100);
	}
	
	// 전체생성자 - 매개변수 있는 생성자
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}
	
}
