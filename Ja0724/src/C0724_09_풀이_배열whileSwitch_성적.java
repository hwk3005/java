import java.util.Scanner;

public class C0724_09_풀이_배열whileSwitch_성적 {
	public static void main(String[] args) {
		// 입력 설정
		Scanner scan = new Scanner(System.in);

		// 1. 변수 배열선언
		int[] no = new int[3];			// 번호
		String[] name = new String[3];  // 이름
		int[][] score = new int[3][3];  // 점수 (국어,영어,수학)
		int[] total = new int[3];		// 합계
		double[] avg = new double[3];	// 평균
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};  // title
		
		int count = 0;  // 입력된 학생수
		int choice = 0; // 선택한 번호
		int input = 0;  // 수정 점수
		
		// 반복문 while
		loop: while (true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요.(0.종료)>> ");
			choice = scan.nextInt();
			System.out.println();
			
			// 조건문 switch
			switch (choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				// 1) 번호 입력
				no[count] = count+1; 
				// 2) 이름 입력
				System.out.printf("%d번 학생이름을 입력하세요.(0.취소) >> \n",count+1);
				name[count] = scan.next();
				// (취소)
				if (name[count].equals("0")) {
					System.out.println("이전화면으로 이동합니다.");
					System.out.println();
					break;
				}
				
				// 3) 점수 입력
				for (int i=0; i<score.length; i++) {
					System.out.printf("%s 점수를 입력하세요.>> \n",title[i+2]);
					score[count][i] = scan.nextInt();
				}
				// 4) 합계,평균 저장
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				// 5) 문구 출력
				System.out.printf("%d번 학생성적이 저장되었습니다.\n",count+1);
				count++;
				System.out.println();
				break;  // 1. 학생성적입력
				
			case 2:
				System.out.println("[ 학생성적출력 ]");
				for (int i=0; i<title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("-----------------------------------------------------");
				// 학생수만큼 출력
				for (int i=0; i<count; i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for (int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%d\t",total[i]);
					System.out.printf("%.2f\n",avg[i]);
				}
				System.out.println();
				System.out.println();
				break;  // 2. 학생성적출력
				
			case 3:
				System.out.println("[ 학생성적수정 ]");
				System.out.println("찾고자 하는 학생이름을 입력하세요.>> ");
				String search = scan.next();  // 검색내용 입력받기
				int temp = 0; 				  // 임시저장
				for (int i=0; i<count; i++) {
					if (search.equals(name[i])) {
						System.out.printf("%s 학생을 찾았습니다.\n",name[i]);
						System.out.println();
						System.out.println("[ 점수 수정 ]");
						System.out.println("-----------------------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("4. 취소-이전화면 이동");
						System.out.println("-----------------------------");
						System.out.println("원하는 번호를 입력하세요.>> ");
						choice = scan.nextInt();
						
						// 점수 수정 - 원하는 과목 선택 후
						switch (choice) {
						case 1: case 2: case 3:
							System.out.printf("현재 %s점수: %d\n",title[choice+1],score[i][choice-1]);  // 현재국어점수: 100
							System.out.println("변경점수를 입력하세요.>> ");
							input = scan.nextInt();  // 수정점수 입력받기
							score[i][choice-1] = input;	 // score 배열에 수정 적용
							total[i] = score[i][0]+score[i][1]+score[i][2];
							avg[i] = total[i]/3.0;
							System.out.printf("%d 점으로 점수가 변경되었습니다.\n",score[i][choice-1]);
							System.out.println();
							break;
						case 4:
							System.out.println("점수변경을 취소했습니다.");
							System.out.println();
							break;
						}
						temp = 1;  // 학생 있을시
					}
				} // for
				if (temp == 0) {
					System.out.printf("%s 찾고자 하는 학생이 없습니다.\n",search);
					System.out.println();
				}
				
				break; // 3. 학생성적수정
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop; // 0. 프로그램종료
			} //switch
			
		} //while
		
	} //main
	
} //class
