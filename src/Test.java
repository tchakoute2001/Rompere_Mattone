package Tchakoute;

import javax.swing.JFrame;

public class Test {
		
	public static void main(String[] args) {
	
	    JFrame frame = new JFrame("BreakBrick");
	    GamePanel panel = new GamePanel();
	    frame.setContentPane(panel);
	    frame.setSize(GameConstants.WINDOW_WIDTH, GameConstants.WINDOW_HEIGHT);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
