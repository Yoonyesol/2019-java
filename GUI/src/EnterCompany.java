
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Ex2 extends JFrame{
	JButton button;
	JLabel ment;
	JTextField agef;
	JTextField adrsf;
	JTextField marf;
	JTextField comf;
	int Intage;
	
	
public Ex2() {
  
	setTitle("���Ի�� ä���ϱ�");
	setLayout(new FlowLayout());
	Container c = getContentPane();
  
	JLabel name = new JLabel("�̸�");
	JTextField namef = new JTextField(10);
	JLabel gender = new JLabel("����");
	JTextField gendf = new JTextField(10);
	JLabel adress = new JLabel("��°�");
	adrsf = new JTextField(10);
	JLabel age = new JLabel("����");
	agef = new JTextField(10);
 
	JLabel marriage = new JLabel("��ȥ����");
	marf = new JTextField(10);
	JLabel com = new JLabel("����");
	comf = new JTextField(10);
  
	button = new JButton("�Է¿Ϸ�");
	button.addActionListener(new MyListener());
  
	ment = new JLabel("");
  
  
	c.add(name);
	c.add(namef);
	c.add(gender);
	c.add(gendf);
	c.add(adress);
	c.add(adrsf);
  	c.add(age);
  	c.add(agef);
  	c.add(marriage);
  	c.add(marf);
  	c.add(com);
  	c.add(comf);
  	c.add(button);
  	c.add(ment);
  
  
  	setSize(330,350);
  	setResizable(false);
  	setVisible(true);
 	}
 
 class MyListener implements ActionListener{

  @Override
  public void actionPerformed(ActionEvent e) {
   if(e.getSource()==button) {
    int Intage = Integer.parseInt(agef.getText());
    if(adrsf.getText().equals("����") && marf.getText().equals("��ȥ")
    		&&comf.getText().equals("��ǻ��")&& Intage<30) {
    	ment.setText("����� ���� ��ǻ���п� ���������� �հ��Ͽ����ϴ�. �����մϴ�.^^");   
     } else {
    	 ment.setText("���������� ���հ��ϼ̽��ϴ�.");
    	 }
    }
   
   }
  
  }
 
}
public class EnterCompany {

 public static void main(String[] args) {
  Ex2 t = new Ex2();

 }

}
 
