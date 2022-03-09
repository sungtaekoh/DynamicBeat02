package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
	//더플 버퍼링
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	//이미지 객체
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//크기변경 불가
		setLocationRelativeTo(null); //정중앙에서 게임 실행
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임을 정상적으로 종료하기 위한 기능
		setVisible(true); //게임이 정상적으로 출력되게 하는 기능
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
