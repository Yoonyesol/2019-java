import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Order extends JFrame {
	
	public int money2;
	public int sum=0;
	boolean a = false;
	boolean b= false;
	boolean c= false;
	boolean d= false;
	boolean f= false;
	boolean g= false;
	public int order = 0;
	JLabel sumLabel;
	JTextField money;
	JButton Result;
	JButton ReSel;
	JButton Compl;
	JCheckBox menu1;
	JCheckBox menu2;
	JCheckBox menu3;
	JCheckBox menu4;
	JCheckBox menu5;
	JCheckBox menu6;
	
	public Order() {
		setTitle("�ֹ� ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		JPanel a = new JPanel();
		JPanel b = new JPanel();
		JPanel c = new JPanel();
		con.setLayout(new BorderLayout());
		con.add(a, BorderLayout.NORTH);
		con.add(b, BorderLayout.CENTER);
		con.add(c, BorderLayout.SOUTH);
		
		a.setLayout(new FlowLayout());
		a.add(new JLabel("�ֹ���"));
		
		b.setLayout(new GridLayout(3,2));
	
		MyItemListener listener = new MyItemListener();
		
		ImageIcon bulgogi = new ImageIcon("bulgogi.jpg");
		menu1 = new JCheckBox("�Ұ�����, 3400", bulgogi);
		menu1.setBorderPainted(true);
		b.add(menu1);
		menu1.addItemListener(listener);
		
		ImageIcon cyburger = new ImageIcon("cyburger.jpg");
		menu2 = new JCheckBox("���̹���, 3600", cyburger);
		menu2.setBorderPainted(true);
		b.add(menu2);
		menu2.addItemListener(listener);
		
		ImageIcon shrimp = new ImageIcon("shrimp.jpg");
		menu3 = new JCheckBox("�������, 3800", shrimp);
		menu3.setBorderPainted(true);
		b.add(menu3);
		menu3.addItemListener(listener);
		
		ImageIcon cider = new ImageIcon("cider.jpg");
		menu4 = new JCheckBox("���̴�, 1000", cider);
		menu4.setBorderPainted(true);
		b.add(menu4);
		menu4.addItemListener(listener);
		
		ImageIcon cola = new ImageIcon("cola.jpg");
		menu5 = new JCheckBox("�ݶ�, 1200", cola);
		menu5.setBorderPainted(true);
		b.add(menu5);
		menu5.addItemListener(listener);
	
		ImageIcon fanta = new ImageIcon("fanta.jpg");
		menu6 = new JCheckBox("ȯŸ, 2000", fanta);
		menu6.setBorderPainted(true);
		b.add(menu6);
		menu6.addItemListener(listener);
		
		
		c.setLayout(new FlowLayout());
		JLabel money3 = new JLabel("������ ��: ");
		money = new JTextField(10);
		Compl = new JButton("�Ϸ�");
		ReSel = new JButton("�缱��");
		Result = new JButton("���");
		sumLabel = new JLabel("");
		c.add(money3);
		c.add(money);
		c.add(sumLabel);
		c.add(Compl);
		c.add(ReSel);
		c.add(Result);
		
		Result.addActionListener(new MyListener());
		ReSel.addActionListener(new MyListener());
		Compl.addActionListener(new MyListener());
	
		setSize(700,650);
		setVisible(true);
	}
	
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			money2 = Integer.parseInt(money.getText());
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem()==menu1) {
					sum+=3400; 
					a=true;
					}
				else if(e.getItem()==menu2) {
					sum+=3600;
					b=true;
				}
					
				else if(e.getItem()==menu3) {
					sum+=3800;
					c=true;
				}
					
				else if(e.getItem()==menu4) {
					sum+=1000;
					d=true;
				}
					
				else if(e.getItem()==menu5) {
					sum+=1200;
					f=true;
				}
					
				else {
					sum+=2000;
					g=true;
				}
					
			}
			
			else {
				if(e.getItem()==menu1)
					sum-=3400;
				else if(e.getItem()==menu2)
					sum-=3600;
				else if(e.getItem()==menu3)
					sum-=3800;
				else if(e.getItem()==menu4)
					sum-=1000;
				else if(e.getItem()==menu5)
					sum-=1200;
				else
					sum-=2000;
			}	
			
		}		
	}	
	
class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==Compl) {
			order = sum;
		}
		if(e.getSource()==Result) {
			
			if (sum<=money2) {
				sumLabel.setText("�Ž����� "+ (money2-sum) +"���� �޾��ּ���.");
				try {
					File();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			else 
				sumLabel.setText("���� �����մϴ�.");
			
			}
		
		
		if(e.getSource()==ReSel) {
			sum+=order;
			
			menu1.setSelected(false);
			menu2.setSelected(false);
			menu3.setSelected(false);
			menu4.setSelected(false);
			menu5.setSelected(false);
			menu6.setSelected(false);

				if (sum<=money2)
					money2 = money2-sum;
				else 
					sumLabel.setText("���� �����մϴ�.");
		
		}
		
	}
}
public void File() throws IOException {
	FileOutputStream fout = new FileOutputStream("C:\\Users\\yoon\\Desktop\\file.txt",true);
	Writer in = new OutputStreamWriter(fout);
	in.write("=======������=======");
	in.write("\r\n");
	in.write("�ֹ��Ͻ� ����\r\n");
	if(a==true) {
		in.write("�Ұ�� ���� 3400��\n");
	} if(b==true) {
		in.write("���̹��� 3600��\n");
	} if(c==true) {
		in.write("������� 3800��\n");
	} if(d==true) {
		in.write("���̴� 1000��\n");
	} if(f==true) {
		in.write("�ݶ� 1200��\n");
	} if(g==true) {
		in.write("ȯŸ 2000��\n");
	}
	in.write("\r\n");
	in.write("�� �ֹ� �ݾ�: "+sum+"��\r\n");
	in.write("���� �ݾ�: "+money2+"��\r\n");
	in.write("�Ž�����: "+(money2-sum)+"��\r\n");
	in.close();
	fout.close();
	
	a=false;
	b=false;
	c=false;
	d=false;
	f=false;
	g=false;
	
}

}
		
public class BurgerOrderProgram {
	
	public static void main(String[] args) {
		Order od = new Order();
	}

}


