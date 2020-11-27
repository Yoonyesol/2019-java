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
	private JCheckBox[] burger = new JCheckBox[9]; //�޴��� ������ŭ üũ�ڽ� ����
	private String [] name = {"���غҰ�� ����", "ġŲ ������", "������ �ֽ�", "����ġ�� ����",
			"���� ������", "��ũ����ũ", "�Ұ��� ����", "������ ������", "���̴�"};
	//name�̶�� �迭�� �޴��� �ֹ� �޴� �̸����� �Է��ؼ� �迭����
	JLabel sumLabel;
	int sum =0;
	JButton button= new JButton("���ÿϷ�");
	
	//������� �������� �� ������ �����ϱ� 
	
	public Menu() {
		setTitle("���ظ��� �ܹ��� �ֹ��ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyItemListener listener = new MyItemListener(); //������ ������ ����
		
		for (int i =0; i<burger.length; i++) {
			burger[i] = new JCheckBox(name[i]); //�迭�� ������ŭ �� �̸��� �� üũ�ڽ� ����
			burger[i].setBorderPainted(false); //üũ�ڽ� �ܰ����� ���̵��� ���x
			c.add(burger[i]); //�迭�� ������ŭ üũ�ڽ� ����
			burger[i].addItemListener(listener); //�迭�� ������ŭ �����۸����� ����			
		}
		
		sumLabel = new JLabel("�ֹ��Ͻ� �� �ݾ��� 0000���Դϴ�.");
		button.addActionListener(new MyListener());
		c.add(button);
		c.add(sumLabel);
		setResizable(false);
		setSize(350,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) { //üũ�ڽ��� ����/���� ���°� ���ϴ� ��� ȣ��
			if(e.getStateChange()==ItemEvent.SELECTED) { //üũ�ڽ��� ���õ� ��� ����
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
				sumLabel.setText("�ֹ��Ͻ� �� �ݾ��� "+sum+"���Դϴ�.");
			}
			
		}
		
	}
		
	}

public class Burger {

	public static void main(String[] args) {
		Menu order = new Menu();

	}

}
