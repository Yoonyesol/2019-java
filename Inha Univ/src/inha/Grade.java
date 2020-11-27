package inha;

import java.util.Scanner;

public class Grade {

	public interface GradeOut{
		int scorecount(int scr);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.: ");
		int score = sc.nextInt();
		
		GradeOut output = (a) -> {
			return score/10;
		};
		
		System.out.println(output.scorecount(score));
		
	}

}
