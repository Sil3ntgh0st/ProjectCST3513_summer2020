import javax.swing.*;
import villageGathererClasses.Player;
import villageGathererClasses.T1Item;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class villageMainMenu {
	
	public JFrame frame;
	public Container con;
	public JPanel titleFrame, textFrame;
	public JPanel buttonPanel;
	public JPanel topHUD;
	public JButton inventoryChoice, blacksmithChoice, jobsChoice;
	public JLabel importantMessages, topHUDinfo;
	public Font defaultFont = new Font("HERCULANUM", Font.PLAIN, 18);
	public static Color newOrange = new Color(255, 153, 51);
	public String location;
	public JButton startGame;
	public JTextField usernameInput;
	
	
	public villageMainMenu() {
		
	}
	
	public static void setUIFont (javax.swing.plaf.FontUIResource f){
		Enumeration keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements()) {
	      Object key = keys.nextElement();
	      Object value = UIManager.get (key);
	      if (value instanceof javax.swing.plaf.FontUIResource)
	        UIManager.put (key, f);
	      }
	    }
	
	public static void villageStart() {

		boolean test;
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.black);
		
		JPanel titleFrame = new JPanel();
		titleFrame.setBackground(newOrange);
		titleFrame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.HORIZONTAL;

	
		JLabel importantMessages = new JLabel("<html>Welcome to your Village<br/><br/>" + "\n Enter your username" + "</html>");
		c.gridx=0;
		c.gridwidth = 2;
		c.gridy= 0;
		titleFrame.add(importantMessages, c);
		
		
		JTextField usernameInput = new JTextField();
		c.gridx=0;
		c.gridwidth = 2;
		c.gridy=1;
		usernameInput.setPreferredSize(null);
		titleFrame.add(usernameInput, c);
		
		JButton startGame = new JButton("START");
		startGame.setBackground(Color.black);
		startGame.setForeground(newOrange);
		
		
		JFrame frame = new JFrame("Village Gatherer");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2,1));
		Container con = frame.getContentPane();
		
		buttonPanel.add(startGame);
		
		startGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				UIManager.put("OptionPane.background", newOrange);
				UIManager.put("Panel.background", Color.black);
				Player.userName = usernameInput.getText();
				frame.setVisible(false);
				createVillageMainMenu();
				new Player(usernameInput.getText());
				System.out.println("successfully created->" + Player.userName);
				
				JFrame f = new JFrame();
				JLabel alert = new JLabel("<html>:::Your new character::: <br/>:::" + Player.userName + " was created::</html>");
				alert.setForeground(Color.white);
				JOptionPane.showMessageDialog(f, alert, "Congratulations", JOptionPane.OK_CANCEL_OPTION);
			}	
		});
		
		
		con.add(titleFrame);
		con.add(buttonPanel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	public static void createVillageMainMenu() {

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 400, 200, 100);
		buttonPanel.setBackground(Color.black);
		
		JPanel textFrame = new JPanel();
		textFrame.setBackground(newOrange);
		
		JPanel topHUD = new JPanel();
		topHUD.setBackground(Color.black);
		
		JLabel importantMessages = new JLabel("What would you like to do today?");
		JLabel topHUDinfo = new JLabel("Username:  " + Player.getUserName() + " Energy: " + Player.userEnergyLevel);
		topHUDinfo.setForeground(Color.white);
		
		JButton jobsChoice = new JButton("Jobs");
		jobsChoice.setBackground(Color.black);
		jobsChoice.setForeground(newOrange);
		
		
		JButton blacksmithChoice = new JButton("Blacksmith");
		blacksmithChoice.setBackground(Color.black);
		blacksmithChoice.setForeground(newOrange);
		
		JButton inventoryChoice = new JButton("Inventory");		
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
		inventoryChoice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inventory inventoryWindow = new inventory();
				inventoryWindow.frame.setVisible(true);
			}
		});
		topHUD.add(topHUDinfo);
		textFrame.add(importantMessages);
		
		JFrame frame = new JFrame("Village Gatherer Main Menu");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,1));
		Container con = frame.getContentPane();
		
		con.add(topHUD);
		con.add(textFrame);
		con.add(buttonPanel);
	
		
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		setUIFont(new javax.swing.plaf.FontUIResource("HERCULANUM",Font.PLAIN,15));
		villageStart();
		//createVillageMainMenu();
		
	}
	
	
}
