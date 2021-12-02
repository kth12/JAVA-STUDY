package gui;

import java.awt.BorderLayout;


import javax.swing.JFrame;


public class mainFrame extends JFrame {
	private static final long serialversionUID = 1L;

	public mainFrame(String title) { // 생성자
		super(title); // 창의 이름을 넣어서 생성
		
		//먼저 레이아웃 설정
		setLayout(new BorderLayout()); //창에 컴포넌트(버튼등)들을 붙이기 위함
		
//		JPanel panel = new JPanel(); //패널을 생성
//		panel.setBackground(Color.green); //색설정
		add(new Toolbar(),BorderLayout.NORTH);
		add(new MainPanel(),BorderLayout.CENTER);
		
		add(new MainPanel(),BorderLayout.CENTER); //위에서 만든 패널을 레이아웃의 가운데 붙이기
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
