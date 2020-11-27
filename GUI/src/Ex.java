import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LogIn extends JFrame{
	
	public LogIn () {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID: ");
		JLabel pswd = new JLabel("Password: ");
		JTextField txtID = new JTextField(20);
		JPasswordField txtPass = new JPasswordField(20);
		JButton logbtn = new JButton("Log In");
		
		
		add(panel);
		panel.add(label);
		panel.add(txtID);
		panel.add(pswd);
		panel.add(txtPass);
		panel.add(logbtn);
		
		
		logbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String id = "yesol";
				String pass = "12345";
				
				if(id.equals(txtID.getText()) & pass.equals(txtPass.getText())){
					JOptionPane.showMessageDialog(null, "You logged In");
					} else {
						JOptionPane.showMessageDialog(null, "You failed log in");
					}
			}
		});
		
		
		setTitle("·Î±×ÀÎ");
		setPreferredSize(new Dimension(840, 840/12*9));
		setSize(840, 840/12*9);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}
	
}
public class Ex {

	public static void main(String[] args) {
		LogIn test = new LogIn();

	}

}
