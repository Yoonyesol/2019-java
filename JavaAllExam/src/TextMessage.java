import java.util.ArrayList;
import java.util.Scanner;

public class TextMessage {
	public static void main(String[] args) {
  
		Scanner sc = new Scanner (System.in);
  
		ArrayList<String> Message = new ArrayList<String>() ;
		int sum = 0;
  
		System.out.println("문자를 입력해주세요.");
		String text = sc.nextLine();
  
		Message.add(text);
  
  
		int a = text.length();
		
		for(int i=0; i<a/80+1; i++) {
			if(0 < a & a <= 80) {
				sum = 100; 
			} else if(a < 80+(80*i)) {
				sum = 100+100*i;
			}
		}
  
		
		System.out.println("요금: "+sum+"원");
  
  
	}
}
 