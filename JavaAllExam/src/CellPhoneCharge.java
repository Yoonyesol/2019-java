import java.util.Scanner;

public class CellPhoneCharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 Scanner sc = new Scanner(System.in);
		  
		  System.out.println("사용시간을 입력해주세요.: ");
		  
		  int use = sc.nextInt();
		  int sum = 0;
		  
		  while(use>0) {
		   
		   if(use-1>0) {
		    use-=1;
		    sum+=180;
		   } else if(use-3>0) {
		    
		   } 
		     
		  }
		  
		  System.out.println("요금:"+sum+"원");
		 }
}
