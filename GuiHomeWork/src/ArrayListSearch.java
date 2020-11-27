import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListSearch {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
	
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.println("리스트에 내용을 추가해주세요. 종료하시려면 0을 입력해주세요.");
		String a = "";
		
		while (a.equals("0") == false) {
			a = sc.nextLine();
			list.add(a);	
		}
		if(a.equals("0") == true) {
			list.remove("0");
		}
		
		System.out.println("검색하실 이름을 입력해주세요.");
		String name = sc.nextLine();
	
	
		for(int i = 0; i< list.size(); i++) {
			if((list.get(i)).equals(name) == true) {
				result = 1;
				break;
			} else if(list.get(i).equals(name) == false) {
				result = 2;
			}
		}
		
		if(result == 1)
			System.out.println("입력하신 이름이 리스트에 존재합니다.");
		else if(result == 2)
			System.out.println("입력하신 이름이 리스트에 존재하지 않습니다.");
	}

}
