
public class C03 {

	public static void main(String[] args) {
		Car car = null; //주소값 - 저장공간없음
		// 객체선언 - 저장공간 생김.
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null; // 주소값-저장공간없음
		
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;
		Car car2 = new Car();
		
		
		fe.water();
		car = fe; //(Car)fe; //형변환생략
//		car.water(); //에러, Car객체 water기능없음.
		fe2 = (FireEngine)car;
		fe2.water();
		
//		fe2 = (FireEngine)car2;
//		fe2.water();
		
		car = ab;
		if(car instanceof Ambulance) {
			System.out.println("Ambulance 변경가능");
		}
		if(car instanceof FireEngine) {
			fe2 = (FireEngine)car; //에러
			System.out.println("FireEngine 변경가능");
		}else {
			System.out.println("FireEngine 변경불가");
			System.out.println("형변환 하면 안됨.");
		}
		
		
//		if(ab instanceof Ambulance) {
//			System.out.println("Ambulance");
//		}
//		if(ab instanceof Car) {
//			System.out.println("Car Ambulance");
//		}
//		if(ab instanceof Object) {
//			System.out.println("Object Ambulance");
//		}
		
		
		
//		fe2 = (FireEngine)car;
		
		
		
		

	}

}