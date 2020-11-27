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
		setTitle("동아리 회원가입하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름"));
		name = new JTextField(10);
		c.add(name);
		c.add(new JLabel("성별"));
		gender = new JTextField(10);
		c.add(gender);
		c.add(new JLabel("나이"));
		age = new JTextField(10);
		c.add(age);
		c.add(new JLabel("거주지"));
		adress = new JTextField(10);
		c.add(adress);
		
		button = new JButton("가입가능여부확인");
		c.add(button);
		result = new JLabel("");
		c.add(result);
	

		button.addActionListener (new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(age.getText());
				JButton b = (JButton)e.getSource();
					
					if(a>=20 & (adress.getText()).contains("파주")==true) {
						try {
							method();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						result.setText(name.getText()+"님 동아리에 가입이 되었습니다.");
						
					} else {
						result.setText(name.getText()+"님 동아리에 가입이 불가합니다.");
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
		in.write("이름: "+name.getText());
		in.write("\r\n");
		in.write("성별: "+gender.getText());
		in.write("\r\n");
		in.write("나이: "+age.getText());
		in.write("\r\n");
		in.write("거주지: "+adress.getText());
		in.write("\r\n================\n");
		in.close();
		fout.close();
		}
}	