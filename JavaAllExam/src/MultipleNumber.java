import java.util.Scanner;

public class MultipleNumber {

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.println("����� �Է����ּ���.");
		  int num = sc.nextInt();
		  int sum = 0;
		  
		  for(int i=1; i<=100; i++) {
		   if(i%num==0) {
		    sum += 1;
		   }
		  }
		  
		  System.out.println("����� ����: "+sum);
		 }
	

}
