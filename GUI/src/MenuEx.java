
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {

 
	public MenuEx() {
		setTitle("Menu만들기 예제");
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
 
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); //메뉴바 생성
		JMenuItem [] menuItem = new JMenuItem[4];
		String [] ItemTitle = {"Load","Hide","Reshow","Exit"};
		JMenu screenMenu = new JMenu("Screen"); //Screen 메뉴 생성
		
		//4개의 메뉴아이템을 Screen메뉴에 삽입한다.
		MenuActionListener listener = new MenuActionListener();
		//ActionListener 생성
		for(int i = 0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(ItemTitle[i]);
			menuItem[i].addActionListener(listener);
			
			if(i==3) {
				screenMenu.addSeparator();
			}
			
			screenMenu.add(menuItem[i]);
			}
		 
		//메뉴바에 메뉴 삽입
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
  
  
		//메뉴바를 프레임에 부착
		setJMenuBar(mb);
  
	}
 
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			//사용자가 선택한 메뉴아이템의 문자열 리턴
			
			switch(cmd){
			case "Load" :
				System.out.println("Load가 선택되었습니다.");
				break;
     
			case "Hide":
				System.out.println("Hide가 선택되었습니다.");
				break;
     
			case "Reshow":
				System.out.println("Reshow가 선택되었습니다.");
				break;
    
			case "Exit":
				System.out.println("Exit가 선택되었습니다.");
				System.exit(0);
				break;
      
				
			}
   
		}
  
	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
 
