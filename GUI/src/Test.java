import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� Ǯ��");
		
		
		setLayout(null);
		
		JLabel textLabel = new JLabel("����1");
		textLabel.setSize(40, 20);
		textLabel.setLocation(20,10);
		JLabel textLabel2 = new JLabel("���� �� �ڹٿ��� �����");
		textLabel2.setSize(150,20);
		textLabel2.setLocation(20,60);
		JLabel textLabel3 = new JLabel("�� ��ɾ �ƴѰ��� ��");
		textLabel3.setSize(150,20);
		textLabel3.setLocation(20,80);
		JLabel textLabel4 = new JLabel("�� ���ÿ�!");
		textLabel4.setSize(150,20);
		textLabel4.setLocation(20,100);
				
		
		
		
		JCheckBox p = new JCheckBox("print", true);
		p.setSize(70,50);
		p.setLocation(250,20);
		JCheckBox sc = new JCheckBox("scanf");
		sc.setSize(70,50);
		sc.setLocation(380,20);
		JCheckBox fo = new JCheckBox("for", true);
		fo.setSize(70,50);
		fo.setLocation(250,70);
		JCheckBox i = new JCheckBox("if", true);
		i.setSize(70,50);
		i.setLocation(380,70);
		JCheckBox wh = new JCheckBox("while");
		wh.setSize(70,50);
		wh.setLocation(250,120);
		JCheckBox imp = new JCheckBox("import", true);
		imp.setSize(70,50);
		imp.setLocation(380,120);
					
				
		
		
		JButton button =new JButton("���ÿϷ�");
		button.setSize(130,50);
		button.setLocation(200,200);
		JButton button2 =new JButton("�������");
		button2.setSize(130,50);
		button2.setLocation(350,200);
		
			
		
		add(textLabel);
		add(textLabel2);
		add(textLabel3);
		add(textLabel4);
		
		
		add(p);
		add(sc);
		add(fo);
		add(i);
		add(wh);
		add(imp);
		
		add(button);
		add(button2);
		

		setVisible(true);
	}
}
public class Test {

	public static void main(String[] args) {
		MyFrame t = new MyFrame(); 
		
	}

}
