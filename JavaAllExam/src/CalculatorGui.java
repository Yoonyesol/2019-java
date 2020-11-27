import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calculator extends JFrame{
	
	public Calculator() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		JPanel c = new JPanel();
		JPanel d = new JPanel();
		JPanel e = new JPanel();
		setLayout(new BorderLayout());
		add(c, BorderLayout.NORTH);
		add(d, BorderLayout.CENTER);
		add(e, BorderLayout.SOUTH);
		
		
		c.setLayout(new FlowLayout());
		c.setSize(500,30);
		JLabel enterl = new JLabel ("수 식 입 력");
		c.setBackground(Color.GRAY);
		JTextField entert = new JTextField(20);
		c.add(enterl);
		c.add(entert);
  
  
		d.setLayout(new GridLayout(4, 4, 5, 7));
		d.setSize(500,200);
		d.setBackground(Color.white);
		
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton CE = new JButton("CE");
		JButton calres = new JButton("=");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton mult = new JButton("x");
		JButton div = new JButton("/");
		
		zero.setBackground(Color.green);
		one.setBackground(Color.green);
		two.setBackground(Color.green);
		three.setBackground(Color.green);
		four.setBackground(Color.green);
		five.setBackground(Color.green);
		six.setBackground(Color.green);
		seven.setBackground(Color.green);
		eight.setBackground(Color.green);
		nine.setBackground(Color.green);
		CE.setBackground(Color.green);
		calres.setBackground(Color.green);
		plus.setBackground(Color.pink);
		minus.setBackground(Color.pink);
		mult.setBackground(Color.pink);
		div.setBackground(Color.pink);
		
		d.add(zero);
		d.add(one);
		d.add(two);
		d.add(three);
		d.add(four);
		d.add(five);
		d.add(six);
		d.add(seven);
		d.add(eight);
		d.add(nine);
		d.add(CE);
		d.add(calres);
		d.add(plus);
		d.add(minus);
		d.add(mult);
		d.add(div);

		
		e.setLayout(new FlowLayout());
		e.setSize(50,10);
		JLabel result = new JLabel ("계 산 결 과");
		JTextField resultField = new JTextField(20);
		e.setBackground(Color.orange);
		e.add(result);
		e.add(resultField);
		
		setVisible(true);
		}
	}
public class CalculatorGui {

	public static void main(String[] args) {
		Calculator a = new Calculator();

	}

}
 
