import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("milk");
		list.add("bread");
		list.add("butter");
		list.add(1,"apple");
		list.set(2,"grape");
		//0.milk 1.apple 2.grape
		list.remove(3);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		for(String s: list)
			System.out.println(s);
	}

}
