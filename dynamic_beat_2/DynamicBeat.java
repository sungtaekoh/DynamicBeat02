package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
	//���� ���۸�
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	//�̹��� ��ü
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//ũ�⺯�� �Ұ�
		setLocationRelativeTo(null); //���߾ӿ��� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ ���������� �����ϱ� ���� ���
		setVisible(true); //������ ���������� ��µǰ� �ϴ� ���
		
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
