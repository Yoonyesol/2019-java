package inha;
import java.util.Scanner;

public class rd_parser {
	static int lookahead = 0;
	static int nexttoken(){
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
        return get;
	}
	static void match(int token){
	        if(lookahead == token)
	                lookahead = nexttoken();
	        else error((char) token);
	}
	static void error(char c){
	       System.out.println("Systax Error :"+ c );
	       System.exit(-1);
	}
	static void K(){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			S(); match('\n'); K();
		}
	}
	static void S(){
	        if(lookahead == '('){
	           match('('); S(); match(')'); S();
	        }
	        else ;
	}
	public static void main(String[] args) {
		lookahead = nexttoken();
        K();  
	}
	
}