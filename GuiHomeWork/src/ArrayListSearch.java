import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListSearch {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
	
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.println("����Ʈ�� ������ �߰����ּ���. �����Ͻ÷��� 0�� �Է����ּ���.");
		String a = "";
		
		while (a.equals("0") == false) {
			a = sc.nextLine();
			list.add(a);	
		}
		if(a.equals("0") == true) {
			list.remove("0");
		}
		
		System.out.println("�˻��Ͻ� �̸��� �Է����ּ���.");
		String name = sc.nextLine();
	
	
		for(int i = 0; i< list.size(); i++) {
			if((list.get(i)).equals(name) == true) {
				result = 1;
				break;
			} else if(list.get(i).equals(name) == false) {
				result = 2;
			}
		}
		
		if(result == 1)
			System.out.println("�Է��Ͻ� �̸��� ����Ʈ�� �����մϴ�.");
		else if(result == 2)
			System.out.println("�Է��Ͻ� �̸��� ����Ʈ�� �������� �ʽ��ϴ�.");
	}

}
