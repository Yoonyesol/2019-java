class Box5{
	int width;
	int height;
	int depth;
	
	public Box5() {
		width=1;
		height=1;
		depth=1;
	}
	public Box5(int w) {
		width = w;
		height= 1;
		depth=1;
	}
	public Box5(int w, int h) {
		width=w;
		height=h;
		depth=1;
	}
	public Box5(int w, int h, int d) {
		width=w;
		height=h;
		depth=d;
	}
}
public class Box5Test1 {

	public static void main(String[] args) {
		Box5 mybox1= new Box5(); //매개변수가 없는 생성자 호출
		int vol= mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개 변수 없음): "+vol);
		
		mybox1= new Box5(10); //매개변수가 하나 있는 생성자 호출
		vol= mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개 변수 1개): "+vol);
		
		mybox1= new Box5(10,20); //매개변수가 두 개 있는 생성자 호출
		vol= mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개 변수 2개): "+vol);

		mybox1= new Box5(10,20,30); //매개변수가 세 개 있는 생성자 호출
		vol= mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개 변수 3개): "+vol);

	}

}
