package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//ũ�⺯�� �Ұ�
		setLocationRelativeTo(null); //���߾ӿ��� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ ���������� �����ϱ� ���� ���
		setVisible(true); //������ ���������� ��µǰ� �ϴ� ���
		
	}

}
