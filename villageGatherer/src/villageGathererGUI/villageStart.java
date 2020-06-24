package villageGathererGUI;

import java.awt.*;
import javax.swing.*;

public class villageStart extends villageMainMenu {
	
	private JButton startGame;
	private JTextField usernameInput;

	public villageStart() {
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 200, 200, 100);
		buttonPanel.setBackground(Color.black);
		
		titleFrame = new JPanel();
		titleFrame.setBounds(100, 100, 300, 150);
		titleFrame.setBackground(newOrange);
		titleFrame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.HORIZONTAL;

	
		importantMessages = new JLabel("<html>Welcome to your Village<br/><br>" + "\n Enter your username" + "</html>");
		c.gridx=0;
		c.gridwidth = 2;
		c.gridy= 0;
		titleFrame.add(importantMessages, c);
		
		
		usernameInput = new JTextField();
		c.gridx=0;
		c.gridwidth = 2;
		c.gridy=1;
		usernameInput.setPreferredSize(null);
		titleFrame.add(usernameInput, c);
		
		
		
		
		startGame = new JButton("START");
		startGame.setBackground(Color.black);
		startGame.setForeground(newOrange);
		

		
		frame = new JFrame("Village Gatherer");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2,1));
		con = frame.getContentPane();
		
		buttonPanel.add(startGame);

		con.add(titleFrame);
		con.add(buttonPanel);
		
		frame.pack();
		frame.setVisible(true);
		

		
	}

}
