import java.util.Scanner;

public class JoinMembership {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		String id = "aljjjojopjdkjgjsjgksjgkjd";
		String pw = "ddojflhhlo";
		
		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt();
		
		if(age>14) {
			System.out.println("����ť�� �Է����ּ���.");
			int iq = sc.nextInt();
			
			if(iq>100) { 
			//���̵� ��й�ȣ�� ����
				
				while(id.length()>=8) {
					System.out.println("���̵� ������ �ּ���.(����, ����, Ư������ ���� 8�ڸ� �̻�): ");
					id = str.nextLine();
		
					while(id.length()<8) {
						System.out.println("���̵�� 8�ڸ� �̻����� �����Ǿ�� �մϴ�. �ٽ� �Է����ּ���.");
						System.out.println("���̵� ������ �ּ���.(����, ����, Ư������ ���� 8�ڸ� �̻�): ");
						id = str.nextLine();
					}
					
					System.out.println("��й�ȣ�� ������ �ּ���.(����, ����, Ư������ ���� 4�ڸ� �̻�): ");
					
					
					while(pw.length()>=4) {
						
						pw = str.nextLine();
						
						while(pw.length()<4) {
							System.out.println("��й�ȣ�� 4�ڸ� �̻����� �����Ǿ�� �մϴ�. �ٽ� �Է����ּ���.");
							System.out.println("��й�ȣ�� ������ �ּ���.(����, ����, Ư������ ���� 4�ڸ� �̻�): ");
							pw = str.nextLine();
						}
						
						System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						
					}
					
					break;
					
				} 
				
				
			} else {
				System.out.println("����ť�� 100������ ��� ������ �Ұ��մϴ�.");
			}
		} else {
			System.out.println("���̰� 14�� �̸��� ��� ������ �Ұ��մϴ�.");
		}

	}

}
