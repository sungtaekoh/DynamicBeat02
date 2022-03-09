package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//크기변경 불가
		setLocationRelativeTo(null); //정중앙에서 게임 실행
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임을 정상적으로 종료하기 위한 기능
		setVisible(true); //게임이 정상적으로 출력되게 하는 기능
		
	}

}
