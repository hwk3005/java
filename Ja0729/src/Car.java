
public class Car {
	
	String color;
	String gearType;
	int door;
	int door_size;
	
	Car(){
//		color = "white";
//		gearType = "auto";
//		door = 5;
		this("white","auto",5);	// this() 다른 생성자 가리킴.
	}	// 기본생성자 - 자동생성
	
	Car(String color, String gearType, int door){	// 전체생성자
		// 인스턴스변수 지정
		this.color = color;		// this. 인스턴스변수 가리킴.
		this.gearType = gearType;	// this. 안 붙일경우 지역변수라 매개변수 가리킴.
		this.door = door;
		
	}
	
	// 객체를 매개변수로 받음
	Car(Car c){
		// 다른생성자 호출
		this(c.color,c.gearType,c.door);
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
	}
	
}
