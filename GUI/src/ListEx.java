import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListEx extends JFrame {
	
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear","peach","berry","strawverry","blackberry"};
	private ImageIcon[] images = {new ImageIcon("ic1.jpg"), new ImageIcon("ic2.jpg"), new ImageIcon("ic3.jpg")};
	
	public ListEx() {
		setTitle("리스트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		strList.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				JList<String> d = (JList<String>)e.getSource();
				int index = d.getSelectedIndex();
				
				if(index == 0) {
					System.out.println("리스트 중 첫번째 항목이 선택되면 출력해요");
				}
				
			}
		
		});
		
		
		setSize(300,300);
		setVisible(true);
		
	}


	public static void main(String[] args) {
		new ListEx();
	}

}
