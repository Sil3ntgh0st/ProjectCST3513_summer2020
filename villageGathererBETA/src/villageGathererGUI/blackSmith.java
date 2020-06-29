import villageGathererClasses.NPC;
import villageGathererClasses.Player;
import villageGathererClasses.T1Item; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class blackSmith extends villageMainMenu {
	
	public JFrame frame;
	public Container con;
	public JPanel buttonPanel, infoFrame,topHUD;
	public JButton goBack, Combine;
	public JLabel importantMessages, topHUDinfo, blackSmithChoices, BSchat;
	public JComboBox blackSmithItems;
	private Button btnCountUp;
	private Button btnCountDown;
	private Button btnReset;
	private JPanel quantityBar;
	public TextField tfCount;
	private String[] blackSmithItemOptions = {"Axe", "Hammer", "Fishing Rod"};
	private JPanel infoFrame2;
	private JPanel infoFrame3;
	
	
	public blackSmith() {
		
		frame = new JFrame("Welcome to the Blacksmith");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(6,1));
		con = frame.getContentPane();
		
		topHUD = new JPanel();
		topHUD.setBackground(Color.black);
		
		topHUDinfo = new JLabel("Username: "+Player.userName + " Energy: " + Player.getEnergyLevel());
		topHUDinfo.setForeground(Color.ORANGE);
		topHUD.add(topHUDinfo);

		infoFrame3 = new JPanel();
		infoFrame3.setBackground(Color.black);
		BSchat = new JLabel(NPC.Blacksmith()); // Dialog box now works. NPC Class finally sees the light!
		BSchat.setForeground(Color.white);
		infoFrame3.add(BSchat);
		
		infoFrame2 = new JPanel();
		infoFrame2.setBackground(Color.black);
		importantMessages = new JLabel("<html>Axe: Allows you to cut wood<br/> 30 sticks & 20 stones needed");
		importantMessages.setForeground(Color.white);
		infoFrame2.add(importantMessages);
		
		
		infoFrame = new JPanel();
		infoFrame.setBackground(Color.black);
		blackSmithChoices = new JLabel("Blacksmith items:");
		blackSmithItems = new JComboBox(blackSmithItemOptions);
		infoFrame.add(blackSmithChoices);
		infoFrame.add(blackSmithItems);
		
		
		quantityBar = new JPanel();
		quantityBar.setBackground(Color.gray);
		quantityBar.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		
        tfCount = new TextField("0", 2);
        tfCount.setEditable(false);
		c.gridx=1;
		c.gridwidth = 1;
		c.gridy= 0;
		quantityBar.add(tfCount, c);
		
		btnCountUp = new Button("+");
		c.gridx=2;
		c.gridwidth = 1;
		c.gridy= 0;
		quantityBar.add(btnCountUp, c);
		
        btnCountDown = new Button("-");
		c.gridx=4;
		c.gridwidth = 1;
		c.gridy= 0;
		quantityBar.add(btnCountDown, c);

        btnReset = new Button("Reset");
		c.gridx=6;
		c.gridwidth = 2;
		c.gridy= 0;
		quantityBar.add(btnReset, c);
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.black);
		
		Combine = new JButton("Combine");
		goBack = new JButton("Go Back");
		
		
		buttonPanel.add(Combine);
		buttonPanel.add(goBack);
		frame.add(topHUD);
		frame.add(infoFrame3);
		frame.add(infoFrame2);
		frame.add(infoFrame);
		frame.add(quantityBar);
		frame.add(buttonPanel);
		Combine.setEnabled(false);
		
		if(T1Item.getRequirements("Axe") == true){
			Combine.setEnabled(true);
		}
		
	    BtnListener listener = new BtnListener();
	    btnCountUp.addActionListener(listener);
	    btnCountDown.addActionListener(listener);
	    btnReset.addActionListener(listener);
		
		//Must figure out how to read which Option is selected from the comboBox
		//Currently 'Combine' button makes an Axe regardless of selection.
		Combine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

//				T1Item sticks = new T1Item(); //Adds a stick to the player
//				T1Item stones = new T1Item(); //Adds a stone to the player
				int sticks = T1Item.getStickCount();
				int stones = T1Item.getStoneCount();
				T1Item axe = new T1Item("Axe"); //Adds an Axe as per the T1Item constructor.

				T1Item.craft(sticks,stones,axe); //Supposed to take away 31 sticks and 21 stones (Due to the +1 from combine) and makes 0 Axe (Due to +1 from combine)
			}
		});
		
		goBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				createVillageMainMenu();
			}
		});
		
		frame.pack();
	}
	
	   private class BtnListener implements ActionListener {
		      private int count;

			@Override
		      public void actionPerformed(ActionEvent evt) {
		         // Need to determine which button has fired the event.
		         Button source = (Button)evt.getSource();
		               // Get a reference of the source that has fired the event.
		               // getSource() returns a java.lang.Object. Downcast back to Button.
		         if (source == btnCountUp) {
		            ++count;
		         } else if (source == btnCountDown) {
		            --count;
		         } else {
		            count = 0;
		         }
		         tfCount.setText(count + "");
		      }
		   }

}
