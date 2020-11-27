import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Calculate extends JFrame{
	public Calculate() {
		setTitle ("간이 계산기");
		setSize(100,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		Container c = getContentPane();
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		JButton mult = new JButton("*");
		JButton div = new JButton("/");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton result = new JButton("=");
		JLabel label = new JLabel("");
		
		result.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a;
				int b;
				String printresult;
				
				if(one == e.getSource()) 
					a = 1;
				else if(two == e.getSource()) 
					a = 2;
				else if (three == e.getSource()) 
					a = 3;
				else if (four == e.getSource()) 
					a = 4;
				else if (five == e.getSource()) 
					a = 5;
				else if (six == e.getSource()) 
					a = 6;
				else if (seven == e.getSource()) 
					a = 7;
				else if (eight == e.getSource()) 
					a = 8;
				else if (nine == e.getSource()) 
					a = 9;
				else if (zero == e.getSource()) 
					a = 0;
				
					
				int Intprintresult = Integer.parseInt(printresult);
				if(result == e.getSource()) {
					label.setText(Intprintresult);
				}
				
			}
			
		});
		
		
		c.add(one);
		c.add(two);
		c.add(three);
		c.add(four);
		c.add(five);
		c.add(six);
		c.add(seven);
		c.add(eight);
		c.add(nine);
		c.add(zero);
		c.add(plus);
		c.add(minus);
		c.add(mult);
		c.add(div);
		c.add(result);
		c.add(label);
		
		setVisible(true);
		
		
	}
}
public class CalculatorEx {

	public static void main(String[] args) {
		Calculate n = new Calculate();

	}

}
