import java.util.Scanner;

public class TriangleWidth {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("밑변을 입력해주세요: ");
		  double a = sc.nextDouble();
		  
		  System.out.println("높이를 입력해주세요: ");
		  double b = sc.nextDouble();
		  
		  System.out.println("넓이: "+(a*b*0.5));
		 }

}
