package villageWindow.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class villageGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnStartGameButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					villageGUI frame = new villageGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public villageGUI() {
		initComponents();
		creatEvents();
	}
	
	
	//////////////////////////////////////////////////////////
	////////This method contains all code for creating 
	////////and initializing components
	//////////////////////////////////////////////////////////

	private void initComponents() {

		setTitle("Village Gathering");
		setIconImage(Toolkit.getDefaultToolkit().getImage(villageGUI.class.getResource("/villageWindow/source/village_hut.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnStartGameButton = new JButton("Start Game");

		btnStartGameButton.setIcon(new ImageIcon(villageGUI.class.getResource("/villageWindow/source/village_hut.png")));
		btnStartGameButton.setFont(new Font("Luminari", Font.PLAIN, 13));
		btnStartGameButton.setBackground(Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("Village Gathering Game! ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Luminari", Font.PLAIN, 13));
		
		JLabel lblPressstartGame = new JLabel("Press \"Start Game\" to play.");
		lblPressstartGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblPressstartGame.setFont(new Font("Luminari", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
				.addComponent(btnStartGameButton, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
				.addComponent(lblPressstartGame, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(btnStartGameButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPressstartGame, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(138, Short.MAX_VALUE))))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	
	//////////////////////////////////////////////////////////
	////////This method contains all code for creating events
	//////////////////////////////////////////////////////////

	private void creatEvents() {
		
		btnStartGameButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				villageClientWindow window = new villageClientWindow();
				window.setVisible(true);
				
				
			}
		});
		
	}
}
