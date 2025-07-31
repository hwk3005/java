
public class C0730_06_Time {

	public static void main(String[] args) {

		
		Time t1 = new Time();
//		t1.hour = 10;	// 에러
		
		t1.setHour(10);
//		System.out.println(t1.hour);	// 에러
		System.out.println("시간: "+t1.getHour());
		
		
	}

}
