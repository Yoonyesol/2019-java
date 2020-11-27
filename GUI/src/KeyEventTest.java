import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener {
	
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest() {
		panel = new JPanel (new GridLayout(0,20));
		panel.add(new JLabel("���ڸ� �Է�"));
		field = new JTextField(10);
		
		panel.add(field);
		area = new JTextArea(3,30);
		add(panel, BorderLayoutExam.NORTH);
		add(area, BorderLayoutExam.CENTER);
		
		field.addKeyListener(this);
		setTitle("Ű�̺�Ʈ �׽�Ʈ");
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEventTest();

	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "Ű�� �ԷµȰ�");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "Ű�� ������ �����̿�");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "Ű���� ���� ����");
		
	}
	
	protected void display(KeyEvent e, String s) {
		area.append(s+"\n");
	}


}
