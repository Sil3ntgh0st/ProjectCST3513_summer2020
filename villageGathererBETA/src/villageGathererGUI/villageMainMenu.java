import javax.swing.*;

import villageGathererClasses.NPC;
import villageGathererClasses.Player;
import villageGathererClasses.T1Item;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class villageMainMenu {
	
	public static JFrame frame;
	public static Container con;
	public JPanel titleFrame, textFrame;
	public JPanel buttonPanel;
	public JPanel topHUD;
	public JButton inventoryChoice, blacksmithChoice, jobsChoice, LoadData;
	public JLabel importantMessages;
	public static JLabel topHUDinfo;
	public Font defaultFont = new Font("HERCULANUM", Font.PLAIN, 18);
	public static Color newOrange = new Color(255, 153, 51);
	public String location;
	public JButton startGame;
	public JTextField usernameInput;
	public static String format = "Username:  " + Player.getUserName() + " Energy: " + Player.getEnergyLevel();
	
	
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

		JButton LoadData = new JButton("Load");
		LoadData.setBackground(Color.black);
		LoadData.setForeground(newOrange);
		
		
		JFrame frame = new JFrame("Village Gatherer");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2,1));
		Container con = frame.getContentPane();
		
		buttonPanel.add(startGame);
		buttonPanel.add(LoadData);


		LoadData.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				villageload();
				frame.setVisible(false);
			}
		});
		
		startGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				UIManager.put("OptionPane.background", newOrange);
				UIManager.put("Panel.background", Color.black);
				frame.setVisible(false);
				new Player(usernameInput.getText());
				createVillageMainMenu();
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

		//System.out.println(new File(".").getAbsoluteFile()); //Find location of where villageMainMenu reads files from

		JFrame frame = new JFrame("Village Gatherer Main Menu");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,1));
		Container con = frame.getContentPane();
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 400, 200, 100);
		buttonPanel.setBackground(Color.black);
		
		JPanel textFrame = new JPanel();
		textFrame.setBackground(newOrange);

		JPanel vFrame = new JPanel();
		vFrame.setBackground(newOrange);
		
		JPanel topHUD = new JPanel();
		topHUD.setBackground(Color.black);
		
		JLabel villagerChat = new JLabel(NPC.Villager());
		JLabel importantMessages = new JLabel("\nWhat would you like to do today?");
		JLabel topHUDinfo = new JLabel("Username:  " + Player.getUserName() + " Energy: " + Player.getEnergyLevel());
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

		JButton saveChoice = new JButton("Save");
		saveChoice.setBackground(Color.black);
		saveChoice.setForeground(newOrange);

		
		
		buttonPanel.add(jobsChoice);
		jobsChoice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				forestRoom forestWindow = new forestRoom();
				forestWindow.frame.setVisible(true);
				frame.setVisible(false);
				topHUDinfo.setText("Username:  " + Player.getUserName() + " Energy: " + Player.getEnergyLevel());
			}
		});
		buttonPanel.add(blacksmithChoice);
		blacksmithChoice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				blackSmith blackSmithWindow = new blackSmith();
				blackSmithWindow.frame.setVisible(true);
				frame.setVisible(false);
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
		buttonPanel.add(saveChoice);
		saveChoice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				villageSave();
			}
		});
		
		topHUD.add(topHUDinfo);
		vFrame.add(villagerChat);
		textFrame.add(importantMessages);
		
		
		con.add(topHUD);
		con.add(vFrame);
		con.add(textFrame);
		con.add(buttonPanel);
	
		
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void villageSave(){

		try{
			BufferedWriter save = new BufferedWriter(new FileWriter("villageGathererBETA\\src\\villageGathererGUI\\Save\\Save.txt"));

			//If we need to add more variables, just add save.newLine(); and then save.write(""+intVar) or save.write(stringVar)
			save.write(Player.userName);
			save.newLine();
			save.write(""+Player.userEnergyLevel);
			save.newLine();
			save.write(""+T1Item.stickCount);
			save.newLine();
			save.write(""+T1Item.stoneCount);
			save.newLine();
			save.write(""+T1Item.axeCount);

			save.close();
		}
		catch(Exception ex){

		}
		//This is a little prompt to make sure save works.
		JFrame f = new JFrame();
				JLabel alert = new JLabel("<html>::Progress has been saved!::</html>");
				alert.setForeground(Color.black);
				JOptionPane.showMessageDialog(f, alert, "", JOptionPane.OK_CANCEL_OPTION);

	}
	public static void villageload(){
		try{
			BufferedReader load = new BufferedReader(new FileReader("villageGathererBETA\\src\\villageGathererGUI\\Save\\Save.txt"));
																	//Line 247| Line 224 might have to change depending on programmer.

			//Load is a lot easier, just add the variable you want to load and follow the idea below. 
			//ORDER HAS TO BE THE SAME AS villageSave()
			Player.userName = load.readLine();
			Player.userEnergyLevel = Integer.parseInt(load.readLine());
			T1Item.stickCount = Integer.parseInt(load.readLine());
			T1Item.stoneCount = Integer.parseInt(load.readLine());
			T1Item.axeCount = Integer.parseInt(load.readLine());
			load.close();
		}
		catch(Exception ex){

		}
		//frame.setVisible(false);
		//System.out.println(Player.userName); //Debug
		//System.out.println(Player.userEnergyLevel); //Debug
		createVillageMainMenu();
	}

	public static void main(String[] args) {
		
		setUIFont(new javax.swing.plaf.FontUIResource("HERCULANUM",Font.PLAIN,15));
		villageStart();
		
	}
	
	
}
