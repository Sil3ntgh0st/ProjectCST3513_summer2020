package villageGathererGUI;

import java.awt.*;
import javax.swing.*;

public class villageStart extends villageMainMenu {
	
	private JButton startGame;
	private JTextField usernameInput;

	public villageStart() {
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 400, 200, 100);
		buttonPanel.setBackground(Color.black);
		
		titleFrame = new JPanel();
		titleFrame.setBounds(100, 100, 300, 150);
		titleFrame.setLayout(new GridLayout(1,1));
		titleFrame.setBackground(newOrange);
		
		
		importantMessages = new JLabel("<html>Welcome to your Village<br/><br>" + "\n Enter your username" + "</html>");
		importantMessages.setHorizontalAlignment(JLabel.CENTER);
		usernameInput = new JTextField();
		usernameInput.setPreferredSize(null);
		//setSize(new Dimension(20, 20));
		
		
		
		
		startGame = new JButton("START");
		startGame.setBackground(Color.black);
		startGame.setForeground(newOrange);
		

		
		frame = new JFrame("Village Gatherer");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2,1));
		con = frame.getContentPane();
		
		titleFrame.add(importantMessages);
		titleFrame.add(usernameInput);
		buttonPanel.add(startGame);

		con.add(titleFrame);
		con.add(buttonPanel);
		
		frame.pack();
		frame.setVisible(true);
		

		
	}

}
