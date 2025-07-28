
public class C0728_03_복습풀이_객체선언_StuScore {

	public static void main(String[] args) {
		// Q1. StuScore 객체 - 홍길동 100 100 100
		// 			객체선언 - 유관순 90 90 91
		
		StuScore s = new StuScore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 100;
		s.total = s.kor + s.eng + s.math;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%n",s.name,s.kor,s.eng,s.math,s.total);
		
		StuScore s2 = new StuScore();
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.total = s2.kor + s2.eng + s2.math;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%n",s2.name,s2.kor,s2.eng,s2.math,s2.total);
		
		
		s2 = s;
		// 홍길동 
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%n",s2.name,s2.kor,s2.eng,s2.math,s2.total);
		
		s.name = "이순신";
		System.out.printf("%s\t%d\t%d\t%d\t%d\n",s2.name,s2.kor,s2.eng,s2.math,s2.total);
		
		

	}

}
