
public class C0728_04_객체배열_Time {

	public static void main(String[] args) {
		
		// h,m,s 변수 3개 던져줘야 함 (100개 있을 경우 100개 다 일일히 보내야 함)
		int h = 12;
		int m = 0;
		int s = 0;
		
		// 배열도 각각 던져줘야 함.
		int[] hour = new int[3];
		int[] minute = new int[3];
		int[] second = new int[3];
		
//		-----------------
		// t 변수 1개만 던져주면 됨 (100개 있어도 t 1개만 보내면 됨)
		Time t = new Time();
		t.hour = 12;
		t.minute = 0;
		t.second = 0;
		
		// 객체 배열
		Time[] tt = new Time[3];	// 배열선언 - 뒤에 [ ];
		tt[0] = new Time();			// 객체선언 - 뒤에 ( );
		tt[0].hour = 1;
		tt[0].minute = 0;
		tt[0].second = 0;
		tt[1] = new Time();			// 객체선언
		tt[2] = new Time();
		
		
		
		
	}

}
