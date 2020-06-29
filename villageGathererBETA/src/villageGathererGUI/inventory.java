import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import villageGathererClasses.Player;
import villageGathererClasses.T1Item;

public class inventory extends villageMainMenu {
	
	public JFrame frame;
	public Container con;
	public JPanel infoFrame;
	public JPanel buttonPanel;
	public JPanel topHUD;
	public JButton goBack, search;
	public JLabel importantMessages, topHUDinfo;
	public int itemListSize = T1Item.allItemsSize();
//	public JList list = new JList(new DefaultListModel());
	public String format = "<html>Sticks: " + T1Item.stickCount 
						 + "<br/>Stones: " + T1Item.stoneCount + 
						   "<br/>Axe: "+ T1Item.axeCount + "</html>";
	
	
	public inventory() {
	
	frame = new JFrame("Inventory");
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new GridLayout(3,1));
	con = frame.getContentPane();
	
	topHUD = new JPanel();
	topHUD.setBackground(Color.black);
	
	topHUDinfo = new JLabel("Username: "+ Player.userName + " Energy: " + Player.getEnergyLevel());
	topHUDinfo.setForeground(newOrange);
	
	infoFrame = new JPanel();
	infoFrame.setBackground(Color.gray);
	
	importantMessages = new JLabel();
	infoFrame.add(importantMessages);
	if(itemListSize != 0) {
		
		importantMessages.setText(format);
	}

	
	topHUD.add(topHUDinfo);

	
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
