import java.util.ArrayList;
import java.util.Comparator;

public class C0804_04_컬렉션_sort_문자정렬 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add("유관순");
		list.add("이순신");
		list.add("강감찬");
		list.add("김구");
		list.add("김유신");
		list.add("홍길자");

		// 문자정렬 (보통 DB에서 정렬해서 많이 사용 X)
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);	// 문자비교: compareTo - 순차정렬 (ㄱ-ㅎ)
				return o2.compareTo(o1);	// 역순정렬
			}
			
		});
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
