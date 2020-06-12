package villageWindow.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VillageGUIStart {

	private JFrame frame;
	private JButton btnStartGameButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VillageGUIStart window = new VillageGUIStart();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VillageGUIStart() {
		initialize();
		createEvents();
	}

	//////////////////////////////////////////////////////////
	////////This method contains all code for creating 
	////////and initializing components
	//////////////////////////////////////////////////////////
	
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Village Gathering Game! ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Luminari", Font.PLAIN, 13));
		
		btnStartGameButton = new JButton("Start Game");
		btnStartGameButton.setIcon(new ImageIcon(VillageGUIStart.class.getResource("/villageWindow/source/village_hut.png")));
		btnStartGameButton.setFont(new Font("Luminari", Font.PLAIN, 13));
		btnStartGameButton.setBackground(Color.BLACK);
		
		JLabel lblPressstartGame = new JLabel("Press \"Start Game\" to play.");
		lblPressstartGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblPressstartGame.setFont(new Font("Luminari", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(btnStartGameButton, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPressstartGame, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGap(2)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addComponent(btnStartGameButton, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblPressstartGame, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	
	
	
	//////////////////////////////////////////////////////////
	////////This method contains all code for creating events
	//////////////////////////////////////////////////////////

	private void createEvents() {
		
		btnStartGameButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				villageGUIhome window = new villageGUIhome();
				frame.dispose();
				window.setVisible(true);
			}
		});
	  }
	
		
	}
