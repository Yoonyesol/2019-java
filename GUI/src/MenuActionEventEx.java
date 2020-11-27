import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuListener;

public class MenuActionEventEx extends JFrame {
	
	public MenuActionEventEx() {
		setTitle("Menu�� Action ������ ����� ����");
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem[4];
		String [] itemTitle = {"Load","Hide","Reshow","Exit"};
		JMenu screenMenu = new JMenu("Screen");
		
		
		MenuActionListener listener = new MenuActionListener();
		
		for(int i =0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			
			screenMenu.add(menuItem[i]);
		}
		
		mb.add(screenMenu);
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			switch (cmd) {
				case "Load" : 
					System.out.println("Load�� ���õǾ����ϴ�.");
					break;
				case "Hide" : 
					System.out.println("Hide�� ���õǾ����ϴ�.");
					break;
				case "Reshow" : 
					System.out.println("Reshow�� ���õǾ����ϴ�.");
					break;
				case "Exit" : 
					System.out.println("Exit�� ���õǾ����ϴ�.");
					System.exit(0);
					break;
				
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		 MenuActionEventEx ex = new  MenuActionEventEx();

	}

}
