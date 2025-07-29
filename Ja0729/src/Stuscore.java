
public class Stuscore {
	static int count = 0;	// 클래스변수 - 공용사용 (count증가)
	int no;					// 인스턴스변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	{	this.no = count+1;
		count++;	}	// 초기화블럭
	
	
	Stuscore(){		// 기본생성자
					// no 가져오지 말고 자동생성되게 함
	}	
	Stuscore(String name,int kor,int eng,int math){	// 전체생성자
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		
	}
	
}
