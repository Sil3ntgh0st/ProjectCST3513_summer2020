import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import villageGathererClasses.Player;
import villageGathererClasses.T1Item;

public class inventory extends villageMainMenu 
{
	
	public JFrame frame;
	public Container con;
	public JPanel infoFrame;
	public JPanel buttonPanel;
	public JPanel topHUD;
	public JButton goBack, search;
	public JLabel importantMessages, topHUDinfo;
	public int itemListSize = T1Item.allItemsSize();
//	public JList list = new JList(new DefaultListModel());
	public String format = "<html>Sticks: " + T1Item.stickCount//Created a String format consisted of all the objects that can searched and crafted into the game.
						 + "<br/>Stones: " + T1Item.stoneCount + 
						  "<br/>Fish: " + T1Item.fishCount +
						   "<br/>Axe: "+ T1Item.axeCount + 
						   "<br/>Fishing Rod: "+T1Item.fishingrodCount+"</html>";
	
	
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
	
	buttonPanel.add(search);//Added buttons search and goBack to the panel.
	buttonPanel.add(goBack);
	frame.add(topHUD);//Added frames of topHUD, infoFrame, and buttonPanel.
	frame.add(infoFrame);
	frame.add(buttonPanel);
	
	search.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//giveItem() goes here ---> Make sure giveItem will give either sticks or stones
			/*getDescription() goes here --> Should have a way to be added 
			 * to "importantMessages somehow)
			 */
		}
	});
	
	goBack.addActionListener(new ActionListener()//Create the goBack method with addition to the addActionListener event.
	{
		@Override
		public void actionPerformed(ActionEvent e)//Create the actionPerformed method to setting the frame.setVisible to be false. 
		{
			frame.setVisible(false);
		}
	});
	
	frame.pack();
	
}

}
