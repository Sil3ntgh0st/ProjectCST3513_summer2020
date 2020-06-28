//import villageGathererClasses.Player;
//import villageGathererClasses.T1Item;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class forestRoom extends villageMainMenu {
	
	public JFrame frame;
	private Container con;
	private JPanel infoFrame;
	private JPanel buttonPanel;
	private JPanel topHUD;
	private JButton goBack, search;
	private JLabel importantMessages, topHUDinfo;
	
	public forestRoom() {
		
		frame = new JFrame("Welcome to the Forest Room");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,1));
		con = frame.getContentPane();
		
		topHUD = new JPanel();
		topHUD.setBackground(Color.black);
		
		topHUDinfo = new JLabel("Username: "+ Player.userName + " Energy: " + Player.getEnergyLevel());
		topHUDinfo.setForeground(newOrange);
		
		infoFrame = new JPanel();
		infoFrame.setBackground(Color.green);
		importantMessages = new JLabel("Important Alerts Go Here");
		
		topHUD.add(topHUDinfo);
		infoFrame.add(importantMessages);
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.black);
		
		search = new JButton("Search");

		
		goBack = new JButton("Go Back");
		
		buttonPanel.add(search);
		buttonPanel.add(goBack);
		frame.add(topHUD);
		frame.add(infoFrame);
		frame.add(buttonPanel);
		
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//giveItem() goes here ---> Make sure giveItem will give either sticks or stones
				/*getDescription() goes here --> Should have a way to be added 
				 * to "importantMessages somehow)
				 */
			}
		});
		
		goBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		frame.pack();
		
	}
	
}
