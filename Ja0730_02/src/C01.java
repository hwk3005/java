
public class C01 {

	public static void main(String[] args) {
		//배열5개를 선언
		// for문을 사용해서 5개를 출력하시오. 
		//1:1:1, 2:2:2, ....5:5:5
		Time[] t = new Time[5];
//		t[0] = new Time(1,1,1);
		for(int i=0;i<t.length;i++) {
			t[i] = new Time(i+1,i+1,i+1);
			System.out.println(t[i]);
		}
		
		// t[1] = 12:59:30 수정하시오.
		// 출력 : 12시 59분 30초 
		t[1].setHour(12);
		t[1].setMinute(59);
		t[1].setSecond(30);
		System.out.printf("출력 : %d시 %d분 %d초 \n",
				t[1].getHour(),t[1].getMinute(),t[1].getSecond());
		
		
		
		
		
		
		
		
//		Time t1 = new Time(10,10,10);
//		Time t2 = new Time();
//		t2.setHour(11);
//		t2.setMinute(11);
//		t2.setSecond(11);
//		System.out.println(t1);
//		System.out.println(t2);

	}

}