import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JoinToClub extends JFrame{
	
	static JTextField name;
	static JTextField gender;
	static JTextField age;
	static JTextField adress;
	static JLabel result;
	static JButton button;
	
	public JoinToClub() {
		setTitle("���Ƹ� ȸ�������ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸�"));
		name = new JTextField(10);
		c.add(name);
		c.add(new JLabel("����"));
		gender = new JTextField(10);
		c.add(gender);
		c.add(new JLabel("����"));
		age = new JTextField(10);
		c.add(age);
		c.add(new JLabel("������"));
		adress = new JTextField(10);
		c.add(adress);
		
		button = new JButton("���԰��ɿ���Ȯ��");
		c.add(button);
		result = new JLabel("");
		c.add(result);
	

		button.addActionListener (new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(age.getText());
				JButton b = (JButton)e.getSource();
					
					if(a>=20 & (adress.getText()).contains("����")==true) {
						try {
							method();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						result.setText(name.getText()+"�� ���Ƹ��� ������ �Ǿ����ϴ�.");
						
					} else {
						result.setText(name.getText()+"�� ���Ƹ��� ������ �Ұ��մϴ�.");
					}						
			}
					
		});
		
		setSize(400,350);
		setVisible(true);
	}
	


	public static void main(String[] args) throws IOException {
		
		new JoinToClub();
		
	}
	
	
	public void method() throws IOException {
		FileOutputStream fout = new FileOutputStream("C:/Users/yoon/Desktop/file.txt",true);
		Writer in = new OutputStreamWriter(fout);
		in.write("�̸�: "+name.getText());
		in.write("\r\n");
		in.write("����: "+gender.getText());
		in.write("\r\n");
		in.write("����: "+age.getText());
		in.write("\r\n");
		in.write("������: "+adress.getText());
		in.write("\r\n================\n");
		in.close();
		fout.close();
		}
}	