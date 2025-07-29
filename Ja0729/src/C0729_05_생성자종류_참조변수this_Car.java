
public class C0729_05_생성자종류_참조변수this_Car {

	public static void main(String[] args) {
		
		Car c = new Car();	// 기본생성자
		c.color = "white";
		c.gearType = "auto";
		c.door = 5;
		
		Car c2 = new Car();
		c2.color = "black";
		c2.gearType = "auto";
		c2.door = 5;
		
		Car c3 = new Car("pink","stick",4);		// 전체생성자
		Car c4 = new Car("silver","auto",5);
		
		
//		// 주소값만 복사됨
//		Car c5 = c3;

		// 값이 복사된 다른 객체 생성
		Car c5 = new Car(c3);
		// c3 값이 복사된 c5가 생성
		
//		-------------------------------
		// 참조변수 this - 지역변수와 매개변수명이 같을 때에만 사용
		// this() : 다른 생성자 가리킴.
		// this.  : 인스턴스변수 가리킴.
		// this 뒤에 다른변수 생성하기 (앞에 생성시 에러)
		
	}

}
