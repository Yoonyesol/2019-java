
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
  
	setTitle("신입사원 채용하기");
	setLayout(new FlowLayout());
	Container c = getContentPane();
  
	JLabel name = new JLabel("이름");
	JTextField namef = new JTextField(10);
	JLabel gender = new JLabel("성별");
	JTextField gendf = new JTextField(10);
	JLabel adress = new JLabel("사는곳");
	adrsf = new JTextField(10);
	JLabel age = new JLabel("나이");
	agef = new JTextField(10);
 
	JLabel marriage = new JLabel("결혼여부");
	marf = new JTextField(10);
	JLabel com = new JLabel("전공");
	comf = new JTextField(10);
  
	button = new JButton("입력완료");
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
    if(adrsf.getText().equals("파주") && marf.getText().equals("기혼")
    		&&comf.getText().equals("컴퓨터")&& Intage<30) {
    	ment.setText("당신은 건준 컴퓨터학원 서류전형에 합격하였습니다. 축하합니다.^^");   
     } else {
    	 ment.setText("서류전형에 불합격하셨습니다.");
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
 
