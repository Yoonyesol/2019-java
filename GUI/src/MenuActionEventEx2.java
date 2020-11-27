import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx2 extends JFrame{
	private JLabel imgLabel = new JLabel();
	public MenuActionEventEx2() {
		setTitle("Menu에 Action 리스너 만들기 예제");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250,220);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu screenMenu = new JMenu("Screen");
		
		JMenuItem [] menuItem = new JMenuItem[4];
		String [] ItemTitle = {"Load","Hide","Reshow","Exit"};
		
		MenuActionListener listener = new MenuActionListener();
		
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(ItemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);			
		}
		
		mb.add(screenMenu);
		setJMenuBar(mb);
		
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String a = e.getActionCommand();
			
			switch(a) {
			case "Load" :
				if(imgLabel.getIcon() != null)
					return;
				imgLabel.setIcon(new ImageIcon("cat.jpg"));
				break;
			case "Hide" :
				imgLabel.setVisible(false);
				break;
			case "Reshow":
				imgLabel.setVisible(true);
				break;
			case "Exit": 
				System.exit(0);
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new MenuActionEventEx2();

	}

}
