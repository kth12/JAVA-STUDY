package Application;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Helloworld {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(()->{
			JFrame mainFrame = new JFrame();
			mainFrame.setSize(600,400); //창사이즈 가로 세로순
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫을시 프로그렘종료
			mainFrame.setVisible(true);
		});
		
	}
}
