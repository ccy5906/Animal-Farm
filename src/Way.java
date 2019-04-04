
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Way {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Way();			
			}			
		});
		
	}//main
	
	public Way() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame();
				frame.setTitle("게임 방법"); 
				frame.setLocation(300, 250);	
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.PINK);
				panel.setPreferredSize(new Dimension(1100,500));
					
		
				frame.add(panel);
				frame.setResizable(false);
				frame.pack();
				frame.setVisible(true);
				
			}//run
			
		});
	}

}//class
