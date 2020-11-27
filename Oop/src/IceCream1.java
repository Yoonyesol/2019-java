import java.util.*;

class bsc{
	
	public void ice(int k) /*매개변수가 하나인 메소드*/ {
		
		switch(k) {
		case 1:
			System.out.printf("딸기맛");
			break;
		case 2:
			System.out.printf("초코맛");
			break;
		case 3:
			System.out.printf("레몬맛");
			break;
		case 4:
			System.out.printf("녹차맛");
			break;
		case 5:
			System.out.printf("오렌지맛");
			break;
		case 6:
			System.out.printf("복숭아맛");
			break;		
		case 7:
			System.out.printf("메론맛");
			break;
		case 8:
			System.out.printf("피스타치오맛");
			break;
		}
		
		System.out.print(" ");
	}
	

}

public class IceCream1 {

	public static void main(String[] args) {
		System.out.print("주문하실 아이스크림의 개수를 선택해주세요.");
		Scanner sc = new Scanner (System.in);
		int menu = sc.nextInt();
			
			if(menu == 2) {
				System.out.println("A가 주문을 도와드립니다. 1-8 중 맛을 2가지 선택해주세요.");
				System.out.println("1.딸기맛  2.초코맛  3.레몬맛  4.녹차맛  5.오렌지맛  6.복숭아맛  7.메론맛  8.피스타치오맛");
				
				
				int i= sc.nextInt(); //변수 하나를 생성해서 입력받은 수를 저장
				int j = sc.nextInt();
				bsc choice = new bsc();
				
				System.out.print("선택하신 아이스크림의 종류는 ");
				
				choice.ice(i); //ice메소드의 매개변수에 인자값 i(입력받은 수)를 전달
				choice.ice(j);
				
				System.out.println("입니다.");
			    
			
			} else if(menu ==3) {
				System.out.println("B가 주문을 도와드립니다. 1-8 중 맛을 3가지 선택해주세요.");
				System.out.println("1.딸기맛  2.초코맛  3.레몬맛  4.녹차맛  5.오렌지맛  6.복숭아맛  7.메론맛  8.피스타치오맛");
			
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				
				System.out.print("선택하신 아이스크림의 종류는 ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				
				System.out.println("입니다.");
			
			} else if(menu ==4) {
				System.out.println("C가 주문을 도와드립니다. 1-8 중 맛을 4가지 선택해주세요.");
				System.out.println("1.딸기맛  2.초코맛  3.레몬맛  4.녹차맛  5.오렌지맛  6.복숭아맛  7.메론맛  8.피스타치오맛");
				
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				int l =sc.nextInt();
				
				System.out.print("선택하신 아이스크림의 종류는 ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				choice.ice(l);
				
				System.out.println("입니다.");
			
			} else if(menu ==5) {
				System.out.println("D가 주문을 도와드립니다. 1-8 중 맛을 5가지 선택해주세요.");
				System.out.println("1.딸기맛  2.초코맛  3.레몬맛  4.녹차맛  5.오렌지맛  6.복숭아맛  7.메론맛  8.피스타치오맛");
				
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				int l =sc.nextInt();
				int m = sc.nextInt();
				
				System.out.print("선택하신 아이스크림의 종류는 ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				choice.ice(l);
				choice.ice(m);
				
				System.out.println("입니다.");
			
			} else if(menu ==6) {
				System.out.println("E가 주문을 도와드립니다. 1-8 중 맛을 6가지 선택해주세요.");
				System.out.println("1.딸기맛  2.초코맛  3.레몬맛  4.녹차맛  5.오렌지맛  6.복숭아맛  7.메론맛  8.피스타치오맛");
				
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				int l =sc.nextInt();
				int m = sc.nextInt();
				int n = sc.nextInt();
				
				System.out.print("선택하신 아이스크림의 종류는 ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				choice.ice(l);
				choice.ice(m);
				choice.ice(n);
				
				System.out.println("입니다.");
			
			} else {
				System.out.println("2-6중에서 선택해주세요.");
			}
	}

}
