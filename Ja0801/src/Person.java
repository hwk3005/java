
public class Person {
	long id;		// 주민번호
	String name;	// 성명
	String address;	// 주소
	
	Person(){}
	Person(long id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// 두 객체의 id를 비교해서 같은지 확인
		boolean temp = false;
		if ( this.id == ((Person)obj).id && this.name.equals(((Person)obj).name) ) {
			temp = true;
		}
		return temp;
	}
	
	@Override	// 상속에서 메서드를 재정의하는 것
	public String toString() {
		return ""+id;
	}
	
}	
