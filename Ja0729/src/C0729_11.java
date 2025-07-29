import java.util.Scanner;

public class C0729_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stuscore s1 = new Stuscore();	// 객체선언 - 기본생성자
		System.out.println(s1.no);
		Stuscore s2 = new Stuscore();
		System.out.println(s2.no);
		Stuscore s3 = new Stuscore("이순신",100,100,99);  // 전체생성자
		System.out.println(s3.no);
		Stuscore s4 = new Stuscore("강감찬",90,90,99);	
		System.out.println(s4.no);
		
		
		Stuscore[] stu = new Stuscore[4];  // 배열선언
		stu[0] = new Stuscore();		   // 객체선언 - 기본생성자
		stu[1] = new Stuscore();
		stu[2] = new Stuscore("이순신",100,100,99);	// 객체선언 - 전체생성자
		stu[3] = new Stuscore("강감찬",90,90,99);
		
		s4.name = scan.next();		// 참조변수명.변수
		stu[0].name = scan.next();	// 참조변수명.변수

		
//		Stuscore stu = new Stuscore();	// 객체선언
//		Stuscore stu[0] = new Stuscore();
		
		
	}

}
 