
public class TryCatch {

	public static void main(String[] args) {
		int [] array = new int [10];
		for (int i =0; i<10; i++) 
			array[i]=0;
		try {
			int result = array[12];	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 잘못되었어요");
		}
		
		System.out.println("이문장이 출력이 되나요?");
	}

}
