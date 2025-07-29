
public class Pro {
	static int count = 0;	// 클래스변수
	int serialNo;			// 인스턴스변수
	String produceName;
	{
		serialNo = ++count;
	}
	
	// 기본생성자
	Pro(){}
	// 전체생성자
	Pro(String produceName){
		this.produceName = produceName;
	}
}
