import java.util.ArrayList;

public class C0804_06_지네릭스_StuStCard {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList<Stu>();	// <> 지네릭스
		
		list.add(new Stu("홍길동",100,100,100));
		list.add(new Stu("유관순",90,90,100));
		list.add(new Stu("이순신",80,100,100));
//		list.add(new St(1,"이순신","010-0000-0000"));	// 에러가 안남.
		list.add(new Stu("강감찬",70,100,100));
		list.add(new Stu("김구",60,100,100));
		
		for (int i=0; i<list.size(); i++) {
//			Stu s = (Stu)list.get(i);	// 형변환
//			System.out.println(s.getName()+","+s.getKor());
			System.out.println(list.get(i).getName()+","
					+list.get(i).getKor());	// 지네릭스 사용시 형변환 필요 X
		}
		
		
		
	}

}
