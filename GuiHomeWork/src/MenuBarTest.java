import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



public class MenuBarTest extends JFrame {
	
	private JLabel ImageLabel = new JLabel();
	private MyPanel panel = new MyPanel();
	
	
	public MenuBarTest(){
		setTitle("메뉴바 만들기 연습");
		
		add(panel);
		panel.setVisible(false);
		//getContentPane().add(ImageLabel, BorderLayout.CENTER);
		createMenu();
	
		setSize(340,400);
		setVisible(true);
		}
	
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu Open = new JMenu("Open");
		JMenuItem [] item = new JMenuItem[4];
		String [] itemTitle = {"Font","Image","figure","Exit"};
		
		 MenuActiontListener listener = new MenuActiontListener();
		
		
		for (int i =0; i<item.length; i++) {
			item[i] = new JMenuItem(itemTitle[i]);
			item[i].addActionListener(listener);
			Open.add(item[i]);
			
		}
		
		mb.add(Open);
		mb.add(new JMenu("Close"));
		mb.add(new JMenu("menu3"));
		mb.add(new JMenu("메뉴4"));
		mb.add(new JMenu("메뉴5"));
		
		setJMenuBar(mb);

	}
	
	class MenuActiontListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String a = e.getActionCommand();
			
			switch(a) {
			case "Font" :
				panel.setVisible(false);
				break;
			case "Image" :
				ImageLabel.setIcon(new ImageIcon("cat.jpg"));
				break;
			case "figure":
				break;
			case "Exit":
				System.exit(0);
				break;
			}
			
		}
		
	}
	
	
	class MyPanel extends JPanel{
		public void paintComponent (Graphics g) {
		
			Font f = new Font("Arial", Font.BOLD, 30);
			g.setFont(f);
			g.setColor(new Color(255,0,0));
			g.drawString("font out", 40, 50);
		
						
		}	
	
	}
	
	public static void main(String[] args) {
		new MenuBarTest();

	}
			
}