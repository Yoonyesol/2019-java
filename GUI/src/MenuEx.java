
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {

 
	public MenuEx() {
		setTitle("Menu����� ����");
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
 
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); //�޴��� ����
		JMenuItem [] menuItem = new JMenuItem[4];
		String [] ItemTitle = {"Load","Hide","Reshow","Exit"};
		JMenu screenMenu = new JMenu("Screen"); //Screen �޴� ����
		
		//4���� �޴��������� Screen�޴��� �����Ѵ�.
		MenuActionListener listener = new MenuActionListener();
		//ActionListener ����
		for(int i = 0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(ItemTitle[i]);
			menuItem[i].addActionListener(listener);
			
			if(i==3) {
				screenMenu.addSeparator();
			}
			
			screenMenu.add(menuItem[i]);
			}
		 
		//�޴��ٿ� �޴� ����
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
  
  
		//�޴��ٸ� �����ӿ� ����
		setJMenuBar(mb);
  
	}
 
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			//����ڰ� ������ �޴��������� ���ڿ� ����
			
			switch(cmd){
			case "Load" :
				System.out.println("Load�� ���õǾ����ϴ�.");
				break;
     
			case "Hide":
				System.out.println("Hide�� ���õǾ����ϴ�.");
				break;
     
			case "Reshow":
				System.out.println("Reshow�� ���õǾ����ϴ�.");
				break;
    
			case "Exit":
				System.out.println("Exit�� ���õǾ����ϴ�.");
				System.exit(0);
				break;
      
				
			}
   
		}
  
	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
 
