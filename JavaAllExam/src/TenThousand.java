import java.util.Scanner;

public class TenThousand {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("�ټ� �ڸ� ���� �Է����ּ���.");
		  int num = sc.nextInt();
		  
		  int b = num/10000;
		  int c = (num%(b*10000))*1/1000;
		  int d = (num%(b*10000+c*1000))*1/100;
		  int e = (num%(b*10000+c*1000+d*100))*1/10;
		  int f = (num%(b*10000+c*1000+d*100+e*10));
		  
		  System.out.println("10000�� �ڸ���: "+b);
		  System.out.println("1000�� �ڸ���: "+c);
		  System.out.println("100�� �ڸ���: "+d);
		  System.out.println("10�� �ڸ���: "+e);
		  System.out.println("1�� �ڸ���: "+f);
		    
	 }
}
