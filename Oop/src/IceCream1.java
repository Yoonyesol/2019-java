import java.util.*;

class bsc{
	
	public void ice(int k) /*�Ű������� �ϳ��� �޼ҵ�*/ {
		
		switch(k) {
		case 1:
			System.out.printf("�����");
			break;
		case 2:
			System.out.printf("���ڸ�");
			break;
		case 3:
			System.out.printf("�����");
			break;
		case 4:
			System.out.printf("������");
			break;
		case 5:
			System.out.printf("��������");
			break;
		case 6:
			System.out.printf("�����Ƹ�");
			break;		
		case 7:
			System.out.printf("�޷и�");
			break;
		case 8:
			System.out.printf("�ǽ�Ÿġ����");
			break;
		}
		
		System.out.print(" ");
	}
	

}

public class IceCream1 {

	public static void main(String[] args) {
		System.out.print("�ֹ��Ͻ� ���̽�ũ���� ������ �������ּ���.");
		Scanner sc = new Scanner (System.in);
		int menu = sc.nextInt();
			
			if(menu == 2) {
				System.out.println("A�� �ֹ��� ���͵帳�ϴ�. 1-8 �� ���� 2���� �������ּ���.");
				System.out.println("1.�����  2.���ڸ�  3.�����  4.������  5.��������  6.�����Ƹ�  7.�޷и�  8.�ǽ�Ÿġ����");
				
				
				int i= sc.nextInt(); //���� �ϳ��� �����ؼ� �Է¹��� ���� ����
				int j = sc.nextInt();
				bsc choice = new bsc();
				
				System.out.print("�����Ͻ� ���̽�ũ���� ������ ");
				
				choice.ice(i); //ice�޼ҵ��� �Ű������� ���ڰ� i(�Է¹��� ��)�� ����
				choice.ice(j);
				
				System.out.println("�Դϴ�.");
			    
			
			} else if(menu ==3) {
				System.out.println("B�� �ֹ��� ���͵帳�ϴ�. 1-8 �� ���� 3���� �������ּ���.");
				System.out.println("1.�����  2.���ڸ�  3.�����  4.������  5.��������  6.�����Ƹ�  7.�޷и�  8.�ǽ�Ÿġ����");
			
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				
				System.out.print("�����Ͻ� ���̽�ũ���� ������ ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				
				System.out.println("�Դϴ�.");
			
			} else if(menu ==4) {
				System.out.println("C�� �ֹ��� ���͵帳�ϴ�. 1-8 �� ���� 4���� �������ּ���.");
				System.out.println("1.�����  2.���ڸ�  3.�����  4.������  5.��������  6.�����Ƹ�  7.�޷и�  8.�ǽ�Ÿġ����");
				
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				int l =sc.nextInt();
				
				System.out.print("�����Ͻ� ���̽�ũ���� ������ ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				choice.ice(l);
				
				System.out.println("�Դϴ�.");
			
			} else if(menu ==5) {
				System.out.println("D�� �ֹ��� ���͵帳�ϴ�. 1-8 �� ���� 5���� �������ּ���.");
				System.out.println("1.�����  2.���ڸ�  3.�����  4.������  5.��������  6.�����Ƹ�  7.�޷и�  8.�ǽ�Ÿġ����");
				
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				int l =sc.nextInt();
				int m = sc.nextInt();
				
				System.out.print("�����Ͻ� ���̽�ũ���� ������ ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				choice.ice(l);
				choice.ice(m);
				
				System.out.println("�Դϴ�.");
			
			} else if(menu ==6) {
				System.out.println("E�� �ֹ��� ���͵帳�ϴ�. 1-8 �� ���� 6���� �������ּ���.");
				System.out.println("1.�����  2.���ڸ�  3.�����  4.������  5.��������  6.�����Ƹ�  7.�޷и�  8.�ǽ�Ÿġ����");
				
				int i= sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				int l =sc.nextInt();
				int m = sc.nextInt();
				int n = sc.nextInt();
				
				System.out.print("�����Ͻ� ���̽�ũ���� ������ ");
				
				bsc choice = new bsc();
				choice.ice(i);
				choice.ice(j);
				choice.ice(k);
				choice.ice(l);
				choice.ice(m);
				choice.ice(n);
				
				System.out.println("�Դϴ�.");
			
			} else {
				System.out.println("2-6�߿��� �������ּ���.");
			}
	}

}
