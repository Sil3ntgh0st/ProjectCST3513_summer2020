package villageGathererGUI;
import villageGathererClasses.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class villageStart extends villageMainMenu {
	
	private JButton startGame;
	private JTextField usernameInput;
	

	public villageStart() {
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.black);
		
		titleFrame = new JPanel();
		titleFrame.setBackground(newOrange);
		titleFrame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.HORIZONTAL;

	
		importantMessages = new JLabel("<html>Welcome to your Village<br/><br/>" + "\n Enter your username" + "</html>");
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
		startGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				UIManager UI=new UIManager();
				UI.put("OptionPane.background", newOrange);
				UI.put("Panel.background", Color.black);
				
				Player.userName = usernameInput.getText();
				villageMainMenu newWindow = new villageMainMenu();				
				newWindow.frame.setVisible(true);
				frame.setVisible(false);
				
				Player createdPlayer = new Player(usernameInput.getText());
				System.out.println("successfully created->" + createdPlayer.userName);
				
				JFrame f = new JFrame();
				JLabel alert = new JLabel("<html>:::Your new character::: <br/>:::" + createdPlayer.userName + " was created::</html>");
				alert.setForeground(Color.white);
				JOptionPane.showMessageDialog(f, alert, "Congratulations", JOptionPane.OK_CANCEL_OPTION);
				
			}	
		});
		con.add(titleFrame);
		con.add(buttonPanel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	


}
