import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
	// 파일읽어오기	(완료) - aaa/student.txt 읽어오기, list에 저장
	// 2. 성적출력 	(완료)
	// 6. 이름정렬	(완료)
	// 5. 등수처리	(완료)
	// 9. 파일저장	(완료)
	//	-------
	// 1. 성적입력	(완료)
	// 3. 성적수정	
	Scanner scan = new Scanner(System.in);	// Scanner 설정
	StuDeck stuDeck = new StuDeck();		// StuDeck 객체 선언
	ArrayList<Student> list = new ArrayList<Student>();	// Student list 객체 선언
	int no=0,kor=0,eng=0,math=0,total=0;
	double avg = 0;
	String name = "";
	int temp = 0;	// temp 선언
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};	// title 배열선언
	int[] score = new int[3];	// 국어,영어,수학
	
	// 파일읽어오기
	stuDeck.stu_FileRead(list);
	
	loop:while (true) {
		// 상단메뉴 출력메소드 호출	
		int choice = stuDeck.stu_menuPrint();
		
		switch (choice) {
		case 1:	// 성적입력
			stuDeck.stu_input(list);
			break;
		case 2: // 성적출력
			stuDeck.stu_output(list);
			break;
		case 3: // 성적수정
			stuDeck.stu_update(list);
			break;
		case 5: // 등수처리
			stuDeck.stu_rank(list);
			break;
		case 6: // 이름정렬
			stuDeck.sort_name(list);
			break;
		case 9: // 파일저장
			stuDeck.stu_fileWrite(list);
			break;
		case 0: // 프로그램종료
			System.out.println("[ 프로그램 종료 ]");
			System.out.println();
			break loop;
		}
		
	}
		
		
		
		
		
	}

	
}
