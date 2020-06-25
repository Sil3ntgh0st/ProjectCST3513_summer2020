package villageGathererGUI;
import javax.swing.*;

import villageGathererClasses.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class villageMainMenu {
	
	protected JFrame frame;
	protected Container con;
	protected JPanel titleFrame, textFrame;
	protected JPanel buttonPanel;
	protected JPanel topHUD;
	protected JButton inventoryChoice, blacksmithChoice, jobsChoice;
	protected JLabel importantMessages, topHUDinfo;
	public Font defaultFont = new Font("HERCULANUM", Font.PLAIN, 18);
	public Color newOrange = new Color(255, 153, 51);
	private String location;
	
	
	public static void setUIFont (javax.swing.plaf.FontUIResource f){
	    java.util.Enumeration keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements()) {
	      Object key = keys.nextElement();
	      Object value = UIManager.get (key);
	      if (value instanceof javax.swing.plaf.FontUIResource)
	        UIManager.put (key, f);
	      }
	    } 
	
	public static void main(String[] args) {
		
		
		new villageStart();
		
	}
	
	
	public villageMainMenu() {

		setUIFont(new javax.swing.plaf.FontUIResource("HERCULANUM",Font.PLAIN,15));
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 400, 200, 100);
		buttonPanel.setBackground(Color.black);
		
		textFrame = new JPanel();
		textFrame.setBackground(newOrange);
		
		topHUD = new JPanel();
		topHUD.setBackground(Color.black);
		
		importantMessages = new JLabel("What would you like to do today?");
		topHUDinfo = new JLabel("Username:  " + Player.userName + " Energy: ");
		topHUDinfo.setForeground(newOrange);
		
		
		jobsChoice = new JButton("Jobs");
		jobsChoice.setBackground(Color.black);
		jobsChoice.setForeground(newOrange);
		
		
		blacksmithChoice = new JButton("Blacksmith");
		blacksmithChoice.setBackground(Color.black);
		blacksmithChoice.setForeground(newOrange);
		
		inventoryChoice = new JButton("Inventory");		
		inventoryChoice.setBackground(Color.black);
		inventoryChoice.setForeground(newOrange);
		
		
		buttonPanel.add(jobsChoice);
		jobsChoice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				forestRoom forestWindow = new forestRoom();
				forestWindow.frame.setVisible(true);
			}
		});
		buttonPanel.add(blacksmithChoice);
		blacksmithChoice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				blackSmith blackSmithWindow = new blackSmith();
				blackSmithWindow.frame.setVisible(true);
			}
		});
		buttonPanel.add(inventoryChoice);
		topHUD.add(topHUDinfo);
		textFrame.add(importantMessages);
		
		frame = new JFrame("Village Gatherer Main Menu");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,1));
		con = frame.getContentPane();
		
		con.add(topHUD);
		con.add(textFrame);
		con.add(buttonPanel);
	
		
		frame.pack();
		frame.setVisible(false);
	}
	

	
}
