import java.util.Scanner;

public class C0731_01_객체_쇼핑몰프로그램 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer("aaa","홍길동",10000000,0);
		
		System.out.printf("%s님 로그인성공! \n",b1.name);
		System.out.printf("현재잔액 : %,d\n",b1.money);
		System.out.println("------------------------");
		
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. TV - 1000000");
			System.out.println("2. AUDIO - 500000");
			System.out.println("3. COMPUTER - 1500000");
			System.out.println("4. 구매내역");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("TV를 구매했습니다.");
				b1.buy(new Tv());
				System.out.printf("현재잔액 : %,d\n",b1.money);
				break;
			case 2:
				System.out.println("AUDIO를 구매했습니다.");
				b1.buy(new Audio());
				System.out.printf("현재잔액 : %,d\n",b1.money);
				break;
			case 3:
				System.out.println("COMPUTER를 구매했습니다.");
				b1.buy(new Computer());
				System.out.printf("현재잔액 : %,d\n",b1.money);
				break;
			case 4:
				System.out.println("[ 구매내역 ]");
				for(int i=0;i<b1.list.size();i++) {
					System.out.printf("%s : %d \n",
							( (Product)b1.list.get(i) ).name,
							( (Product)b1.list.get(i) ).price); 
			    }//for
			case 5:
				System.out.println("[ 현재보유금액 ]");
				System.out.printf("금액: %,d \n",b1.money);
				System.out.println();
				break;
			}//switch
		}//while
		
		
	}//main

}//class