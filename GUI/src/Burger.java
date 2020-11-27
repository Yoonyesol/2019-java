import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Menu extends JFrame{
	private JCheckBox[] burger = new JCheckBox[9]; //메뉴의 개수만큼 체크박스 생성
	private String [] name = {"건준불고기 버거", "치킨 샐러드", "오렌지 주스", "건준치즈 버거",
			"망고 샐러드", "밀크쉐이크", "불갈비 버거", "베이컨 샐러드", "사이다"};
	//name이라는 배열에 메뉴판 주문 메뉴 이름들을 입력해서 배열생성
	JLabel sumLabel;
	int sum =0;
	JButton button= new JButton("선택완료");
	
	//여기까지 공용으로 쓸 변수들 정의하기 
	
	public Menu() {
		setTitle("건준리아 햄버거 주문하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyItemListener listener = new MyItemListener(); //아이템 리스너 생성
		
		for (int i =0; i<burger.length; i++) {
			burger[i] = new JCheckBox(name[i]); //배열의 개수만큼 각 이름을 단 체크박스 생성
			burger[i].setBorderPainted(false); //체크박스 외곽선이 보이도록 허용x
			c.add(burger[i]); //배열의 개수만큼 체크박스 부착
			burger[i].addItemListener(listener); //배열의 개수만큼 아이템리스너 부착			
		}
		
		sumLabel = new JLabel("주문하신 총 금액은 0000원입니다.");
		button.addActionListener(new MyListener());
		c.add(button);
		c.add(sumLabel);
		setResizable(false);
		setSize(350,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) { //체크박스의 선택/해제 상태가 변하는 경우 호출
			if(e.getStateChange()==ItemEvent.SELECTED) { //체크박스가 선택된 경우 리턴
				if(e.getItem()==burger[0])
					sum+=3500;
				else if(e.getItem()==burger[1])
					sum+=4000;
				else if(e.getItem()==burger[2])
					sum+=1000;
				else if(e.getItem()==burger[3])
					sum+=4000;
				else if(e.getItem()==burger[4])
					sum+=3800;
				else if(e.getItem()==burger[5])
					sum+=3000;
				else if(e.getItem()==burger[6])
					sum+=5000;
				else if(e.getItem()==burger[7])
					sum+=4500;				
				else
					sum+=1000;
			}
			
			else {
				if(e.getItem()==burger[0])
					sum-=3500;
				else if(e.getItem()==burger[1])
					sum-=4000;
				else if(e.getItem()==burger[2])
					sum-=1000;
				else if(e.getItem()==burger[3])
					sum-=4000;
				else if(e.getItem()==burger[4])
					sum-=3800;
				else if(e.getItem()==burger[5])
					sum-=3000;
				else if(e.getItem()==burger[6])
					sum-=5000;
				else if(e.getItem()==burger[7])
					sum-=4500;				
				else
					sum-=1000;
				
			}

		}
	
	}
	
class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				sumLabel.setText("주문하신 총 금액은 "+sum+"원입니다.");
			}
			
		}
		
	}
		
	}

public class Burger {

	public static void main(String[] args) {
		Menu order = new Menu();

	}

}
