
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Text extends JFrame{
 
	JButton button;
	JLabel result;
	JTextField nameField;
	JTextField genField;
	JTextField adField;
	JTextField agField;
 
	public Text() {
		setTitle("�ؽ�Ʈ �ʵ� �����ϱ�");
		setLayout(new FlowLayout());
		Container c = getContentPane();
		
		JLabel name = new JLabel("�̸�");
		nameField = new JTextField(10);
		JLabel gender = new JLabel("����");
		genField = new JTextField(10);
		JLabel adress = new JLabel("�ּ�");
		adField = new JTextField(10);
		JLabel age = new JLabel("����");
		agField = new JTextField(10);
		result = new JLabel("����� ()�� ��� �ִ� ()�� () ()�̱���.");
  
		button = new JButton("�Է¿Ϸ�");
		button.addActionListener(new MyListener());
  
		c.add(name);
		c.add(nameField);
		c.add(gender);
		c.add(genField);
		c.add(adress);
		c.add(adField);
		c.add(age);
		c.add(agField);
		c.add(result);
		c.add(button);
		setSize(300,200);
		setVisible (true);
  
	}
 
 private class MyListener implements ActionListener{

  @Override
  	public void actionPerformed(ActionEvent e) {
	  if (e.getSource()==button) {
		  result.setText("����� ("+adField.getText()+")�� ��� �ִ� ("+agField.getText()+")�� "+"("+
				  genField.getText()+") "+"("+nameField.getText()+")"+"�̱���.");  
   }
   
  }
  
 }
 
}
public class informEx {

 public static void main(String[] args) {
  Text n = new Text();

 }

}
 
