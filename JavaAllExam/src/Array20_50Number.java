import java.util.Scanner;

public class Array20_50Number {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int [][] a = new int [3][3];
		int sum = 0;
		System.out.println("[3][3]�迭�� ���� �Է����ּ���.");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = sc.nextInt();
				System.out.println(a[i][j]);
				
				if(20<=(a[i][j]) & a[i][j]<=50) {
					sum+=1;
				}
			}
		}
		System.out.println("20�� 50���� ������ ����: "+sum);
		

	}


}
