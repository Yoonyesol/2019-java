import java.util.*;
class cake{
	String bread;
	String cream;
	String topping;
	
	public cake(String b, String c, String t){
		bread=b;
		cream=c;
		topping=t;
	}
}
public class CakeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		cake cos = new cake("흰", "흰", "딸기");
		
		System.out.println("빵의 종류를 입력해 주세요.");
		String bread = sc.nextLine();
		cos.bread = bread;
		System.out.println("크림의 종류를 입력해주세요.");
		String cream = sc.nextLine();
		cos.cream = cream;
		System.out.println("토핑의 종류를 입력해주세요.");
		String topping = sc.nextLine();
		cos.topping = topping;
		
	
		System.out.print("손님이 주문하신 "+cos.bread+"빵에 "+cos.cream+"크림 "
		+cos.topping+"토핑 케잌이 나왔습니다.");

	}

}
