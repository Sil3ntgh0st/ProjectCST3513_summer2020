import villageGathererClasses.Player;
import villageGathererClasses.T1Item;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

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
				
				Random rand = new Random();
				int totalSum = 0;
				int decision = rand.nextInt(1000);
				
				if(decision % 2 != 0 ) {
					T1Item sticks = new T1Item("Stick");
					Player.userEnergyLevel-= 5;
					System.out.println("You gained a Stick");
					importantMessages.setText("You gained a Stick");
					
				}
				else {
					T1Item stones = new T1Item("Stone");
					Player.userEnergyLevel-= 5;
					System.out.println("You gained a Stone");
					importantMessages.setText("You gained a Stone");
				}
				
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
