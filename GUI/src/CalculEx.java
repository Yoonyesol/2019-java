import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calculator extends JFrame{
	
	JButton zero;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton CE;
	JButton calres;
	JButton plus;
	JButton minus;
	JButton mult;
	JButton div;
	
	JTextField entert;
	
	public Calculator() {
		setTitle("계산기 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		
		JPanel c = new JPanel();
		JPanel d = new JPanel();
		JPanel e = new JPanel();
		setLayout(new BorderLayout());
		add(c, BorderLayout.NORTH);
		add(d, BorderLayout.CENTER);
		add(e, BorderLayout.SOUTH);
		
		
		c.setLayout(new FlowLayout());
		c.setSize(500,30);
		JLabel enterl = new JLabel ("수 식");
		c.setBackground(Color.GRAY);
		entert = new JTextField(20);
		c.add(enterl);
		c.add(entert);
  
  
		d.setLayout(new GridLayout(4, 4, 5, 7));
		d.setSize(500,200);
		d.setBackground(Color.white);
		
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		CE = new JButton("CE");
		calres = new JButton("=");
		plus = new JButton("+");
		minus = new JButton("-");
		mult = new JButton("x");
		div = new JButton("/");
		
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
		CE.setBackground(Color.pink);
		calres.setBackground(Color.pink);
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
		
		
		
		zero.addActionListener(new MyListener());
		one.addActionListener(new MyListener());
		two.addActionListener(new MyListener());
		three.addActionListener(new MyListener());
		four.addActionListener(new MyListener());
		five.addActionListener(new MyListener());
		six.addActionListener(new MyListener());
		seven.addActionListener(new MyListener());
		eight.addActionListener(new MyListener());
		zero.addActionListener(new MyListener());
		zero.addActionListener(new MyListener());
		zero.addActionListener(new MyListener());
		zero.addActionListener(new MyListener());

		
		e.setLayout(new FlowLayout());
		e.setSize(50,10);
		JLabel result = new JLabel ("계 산 결 과");
		JTextField resultField = new JTextField(20);
		e.setBackground(Color.orange);
		e.add(result);
		e.add(resultField);
		
		setVisible(true);
		}
	
	
	private class MyListener implements ActionListener{
		double temp = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
			if(e.getSource()==zero) {
				entert.setText("0");
				temp = 0;
				
			}
		}
	}
	}
public class CalculEx {

	public static void main(String[] args) {
		Calculator a = new Calculator();

	}

}
 
