import villageGathererClasses.Player;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class blackSmith extends villageMainMenu {
	
	public JFrame frame;
	public Container con;
	public JPanel buttonPanel, infoFrame,topHUD;
	public JButton goBack, Combine;
	public JLabel importantMessages, topHUDinfo, blackSmithChoices ;
	public JComboBox blackSmithItems;
	private Button btnCountUp;
	private Button btnCountDown;
	private Button btnReset;
	private JPanel quantityBar;
	public TextField tfCount;
	private String[] blackSmithItemOptions = {"Axe", "Hammer", "Fishing Rod"};
	private JPanel infoFrame2;
	
	
	public blackSmith() {
		
		frame = new JFrame("Welcome to the Blacksmith");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(5,1));
		con = frame.getContentPane();
		
		topHUD = new JPanel();
		topHUD.setBackground(Color.black);
		
		topHUDinfo = new JLabel("Username: "+Player.userName + " Energy: " + Player.getEnergyLevel());
		topHUDinfo.setForeground(Color.ORANGE);
		topHUD.add(topHUDinfo);
		
		infoFrame2 = new JPanel();
		infoFrame2.setBackground(Color.black);
		importantMessages = new JLabel("<html>Axe: Allows you to cut wood<br/> 30 sticks & 20 stones"
				   + " needed");
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
		frame.add(infoFrame2);
		frame.add(infoFrame);
		frame.add(quantityBar);
		frame.add(buttonPanel);
		

		
	    BtnListener listener = new BtnListener();
	    btnCountUp.addActionListener(listener);
	    btnCountDown.addActionListener(listener);
	    btnReset.addActionListener(listener);
		
		Combine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
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