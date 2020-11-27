import java.util.Scanner;

public class TenThousand {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("다섯 자리 수를 입력해주세요.");
		  int num = sc.nextInt();
		  
		  int b = num/10000;
		  int c = (num%(b*10000))*1/1000;
		  int d = (num%(b*10000+c*1000))*1/100;
		  int e = (num%(b*10000+c*1000+d*100))*1/10;
		  int f = (num%(b*10000+c*1000+d*100+e*10));
		  
		  System.out.println("10000의 자리수: "+b);
		  System.out.println("1000의 자리수: "+c);
		  System.out.println("100의 자리수: "+d);
		  System.out.println("10의 자리수: "+e);
		  System.out.println("1의 자리수: "+f);
		    
	 }
}
