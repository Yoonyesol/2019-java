import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestEx extends JFrame {
	public TestEx() {
		setTitle("마우스 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new panel());
		setSize(500,500);
		setVisible(true);  
  
	}
 
	public static void main(String[] args) {
		new TestEx();
	}
 
	}
 
	class panel extends JPanel{
  
	 BufferedImage img = null;
	 String a; 
	 int imagx=0, imagy=0;
  
	 public panel() {
		 try {
			 img = ImageIO.read(new File("cat.jpg"));
		 } catch(IOException e) {
			 System.out.println("이미지 어딨니?");
			 System.exit(1);
		 }
   

		 addMouseListener(new MouseListener() {
    
			 @Override
			 public void mouseReleased(MouseEvent e) {
				 // TODO Auto-generated method stub
     
			 }
    
			 @Override
			 public void mousePressed(MouseEvent e) {
				 a = "마우스가 클릭되었습니다.";
				 imagx = e.getX();
				 imagy = e.getY();
				 repaint();
     
			 }
    
			 @Override
			 public void mouseExited(MouseEvent e) {
				 // TODO Auto-generated method stub
     
			 }
    
			 @Override
			 public void mouseEntered(MouseEvent e) {
				 // TODO Auto-generated method stub
     
			 }
    
			 @Override
			 public void mouseClicked(MouseEvent e) {
				 // TODO Auto-generated method stub
     
			 }
		 });
	 }
  
 
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawImage(img, imagx, imagy, null);
		 g.drawString(a, 30, 50);
   
	 } 
 
}
 
