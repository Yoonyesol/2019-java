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
		
		cake cos = new cake("��", "��", "����");
		
		System.out.println("���� ������ �Է��� �ּ���.");
		String bread = sc.nextLine();
		cos.bread = bread;
		System.out.println("ũ���� ������ �Է����ּ���.");
		String cream = sc.nextLine();
		cos.cream = cream;
		System.out.println("������ ������ �Է����ּ���.");
		String topping = sc.nextLine();
		cos.topping = topping;
		
	
		System.out.print("�մ��� �ֹ��Ͻ� "+cos.bread+"���� "+cos.cream+"ũ�� "
		+cos.topping+"���� �ɟ��� ���Խ��ϴ�.");

	}

}
