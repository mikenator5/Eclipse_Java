package findtreasure;

import javax.swing.*;

import findtreasure.FindTreasure;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class FindTreasure extends JFrame  {

	// <-------- Field Variables -------->
	int a = 5;
	int b = 5;
	
	JLabel[][] choiceLabel = new JLabel[a][b];
	JLabel counterDisp = new JLabel();
	
	ImageIcon chest = new ImageIcon("chest.jpeg");
	ImageIcon ship = new ImageIcon("ship.png");
	JButton newButton = new JButton();
	int chestLocation;
	int chestLocation2;
	
	int shipLocation;
	int shipLocation2;
	
	int counter;
	
	Random myRandom = new Random();
		
	public static void main(String args[])
	  {
	    // create frame
		new FindTreasure().setVisible(true);
	  }
	// <-------- Constructor -------->
	public FindTreasure() {
		
		//setSize(800, 600);
		setTitle("Find the Chest! - by Java Genius Mike D");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent evt) {
				
				exitForm(evt);
			}
		});
		
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints;
		
		// Required: Set a layout manager, or use null
		
		
		for (int row = 0; row < a; row++) {
			for (int col = 0; col < b; col++) {
				
				choiceLabel[row][col] = new JLabel();
				
			}
		}
		
		for (int x = 0; x < a; x++) {
			for (int i = 0; i < b; i++) {

				gridConstraints = new GridBagConstraints();
				choiceLabel[x][i].setPreferredSize(new Dimension(chest.getIconWidth(), chest.getIconHeight()));
				choiceLabel[x][i].setOpaque(true);
				choiceLabel[x][i].setBackground(Color.RED);
				gridConstraints.gridx = i;
				gridConstraints.gridy = x;
				gridConstraints.insets = new Insets(10, 10, 10, 10);
				getContentPane().add(choiceLabel[x][i], gridConstraints);
				choiceLabel[x][i].addMouseListener(new MouseAdapter() {
					
					public void mouseClicked(MouseEvent e) {
						
						labelMouseClicked(e);
						counter++;
						counterDisp.setText("Counter: " + counter);
						
					}
				});

			}
		}
		
		
		newButton.setText("Play Again");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 5;
		gridConstraints.insets = new Insets(10,10,10,10);
		getContentPane().add(newButton, gridConstraints);
		newButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				newButtonActionPerformed(e);
				counter = 0;
			}
		});
		
		counterDisp.setText("Counter: " + counter);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 5;
		gridConstraints.insets = new Insets(10,10,10,10);
		getContentPane().add(counterDisp, gridConstraints);
		
		getContentPane().setBackground(Color.YELLOW);
		pack();
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())), getWidth(), getHeight());
		newButton.doClick();
		
	} // End of Constructor
	
	
	
	// <-------- Methods -------->
	private void newButtonActionPerformed(ActionEvent e) {
		for (int x = 0; x < a; x++) {
			for (int i = 0; i < b; i++) {
				choiceLabel[x][i].setIcon(null);
				choiceLabel[x][i].setBackground(Color.RED);
			}
			
			setLocation();
			
			counter = 0;
			counterDisp.setText("Counter: " + counter);
			
			newButton.setEnabled(false);
		}
		
	}
	
	private void labelMouseClicked(MouseEvent e) {
		Component clickedComponent = e.getComponent();
		int choice = 0;
		int choice2 = 0;
		
		for (choice2 = 0; choice2 < a; choice2++) {
			for (choice = 0; choice < b; choice++) {
				if (clickedComponent == choiceLabel[choice2][choice]) {
					choiceLabel[choice2][choice].setBackground(Color.WHITE);
					if (choice == chestLocation && choice2 == chestLocation2) {
						choiceLabel[choice2][choice].setIcon(chest);
						newButton.setEnabled(true);
						
					} else if (choice == shipLocation && choice2 == shipLocation) {
						choiceLabel[choice2][choice].setIcon(ship);
						JOptionPane.showMessageDialog(null, "The Pirates Stole Your Treasure!");
						for (int x = 0; x < a; x++) {
							for (int i = 0; i < b; i++) {
								choiceLabel[x][i].setIcon(null);
								choiceLabel[x][i].setBackground(Color.RED);
								

							}
							setLocation();
							newButton.setEnabled(false);
						}
						
					}
				
				}
			}
		}
		
		
	}
	
	private void setLocation() {
		chestLocation = myRandom.nextInt(5);
		chestLocation2 = myRandom.nextInt(5);
		
		shipLocation = myRandom.nextInt(5);
		shipLocation = myRandom.nextInt(5);
		
		while (chestLocation == shipLocation && chestLocation2 == shipLocation2) {
			shipLocation = myRandom.nextInt(5);
			shipLocation = myRandom.nextInt(5);
		}
	}
	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}
} // End of class FindTreasure
