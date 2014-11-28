package edu.ccsu.cs407.FinalProject.UI.Configration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

import edu.ccsu.cs407.FinalProject.CreatureParts.FastLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.GiantHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.SlowLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;
import edu.ccsu.cs407.FinalProject.EatingStrategies.Carnivore;
import edu.ccsu.cs407.FinalProject.EatingStrategies.EatingStrategy;
import edu.ccsu.cs407.FinalProject.EatingStrategies.Herbivore;
import edu.ccsu.cs407.FinalProject.EatingStrategies.Omnivore;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;
import edu.ccsu.cs407.FinalProject.FightStrategies.Fights;
import edu.ccsu.cs407.FinalProject.FightStrategies.RunAway;
import edu.ccsu.cs407.FinalProject.FileOperations.FileOperator;
import edu.ccsu.cs407.FinalProject.FileOperations.XMLCreatureReader;
import edu.ccsu.cs407.FinalProject.MovementStrategies.Fly;
import edu.ccsu.cs407.FinalProject.MovementStrategies.MovementStrategy;
import edu.ccsu.cs407.FinalProject.MovementStrategies.Walk;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreatureConfiguration {

	private JFrame frame;
	private JTextField tbCreatureName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatureConfiguration window = new CreatureConfiguration();
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
	public CreatureConfiguration() {
		initialize();
	}
	private void createComboboxItems(){
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 602, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewGame = new JMenuItem("New Creature");
		mnFile.add(mntmNewGame);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCreatureName = new JLabel("Creature Name: ");
		lblCreatureName.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblCreatureName = new GridBagConstraints();
		gbc_lblCreatureName.anchor = GridBagConstraints.EAST;
		gbc_lblCreatureName.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreatureName.gridx = 0;
		gbc_lblCreatureName.gridy = 1;
		frame.getContentPane().add(lblCreatureName, gbc_lblCreatureName);
		
		tbCreatureName = new JTextField();
		GridBagConstraints gbc_tbCreatureName = new GridBagConstraints();
		gbc_tbCreatureName.insets = new Insets(0, 0, 5, 0);
		gbc_tbCreatureName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tbCreatureName.gridx = 1;
		gbc_tbCreatureName.gridy = 1;
		frame.getContentPane().add(tbCreatureName, gbc_tbCreatureName);
		tbCreatureName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Eating Strategy: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox<EatingStrategy> cbEatingStrategy = new JComboBox<EatingStrategy>();
		cbEatingStrategy.addItem(new Herbivore());
		cbEatingStrategy.addItem(new Carnivore());
		cbEatingStrategy.addItem(new Omnivore());
		
		GridBagConstraints gbc_cbEatingStrategy = new GridBagConstraints();
		gbc_cbEatingStrategy.insets = new Insets(0, 0, 5, 0);
		gbc_cbEatingStrategy.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbEatingStrategy.gridx = 1;
		gbc_cbEatingStrategy.gridy = 2;
		frame.getContentPane().add(cbEatingStrategy, gbc_cbEatingStrategy);
		
		JLabel lblNewLabel_1 = new JLabel("Movement Strategy: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JComboBox<MovementStrategy> cbMovementStrategy = new JComboBox<MovementStrategy>();
		cbMovementStrategy.addItem(new Walk());
		cbMovementStrategy.addItem(new Fly());
		GridBagConstraints gbc_cbMovementStrategy = new GridBagConstraints();
		gbc_cbMovementStrategy.insets = new Insets(0, 0, 5, 0);
		gbc_cbMovementStrategy.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbMovementStrategy.gridx = 1;
		gbc_cbMovementStrategy.gridy = 3;
		frame.getContentPane().add(cbMovementStrategy, gbc_cbMovementStrategy);
		
		JLabel lblNewLabel_2 = new JLabel("Fight Strategy: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JComboBox<FightStrategy> cbFightStrategy = new JComboBox<FightStrategy>();
		cbFightStrategy.addItem(new Fights());
		cbFightStrategy.addItem(new RunAway());
		
		GridBagConstraints gbc_cbFightStrategy = new GridBagConstraints();
		gbc_cbFightStrategy.insets = new Insets(0, 0, 5, 0);
		gbc_cbFightStrategy.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbFightStrategy.gridx = 1;
		gbc_cbFightStrategy.gridy = 4;
		frame.getContentPane().add(cbFightStrategy, gbc_cbFightStrategy);
		
		JLabel lblTorso = new JLabel("Torso: ");
		GridBagConstraints gbc_lblTorso = new GridBagConstraints();
		gbc_lblTorso.anchor = GridBagConstraints.EAST;
		gbc_lblTorso.insets = new Insets(0, 0, 5, 5);
		gbc_lblTorso.gridx = 0;
		gbc_lblTorso.gridy = 5;
		frame.getContentPane().add(lblTorso, gbc_lblTorso);
		
		JComboBox<Torso> cbTorso = new JComboBox<Torso>();
		cbTorso.addItem(new SmallTorso());
		cbTorso.addItem(new MediumTorso());
		cbTorso.addItem(new LargeTorso());
		GridBagConstraints gbc_cbTorso = new GridBagConstraints();
		gbc_cbTorso.insets = new Insets(0, 0, 5, 0);
		gbc_cbTorso.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbTorso.gridx = 1;
		gbc_cbTorso.gridy = 5;
		frame.getContentPane().add(cbTorso, gbc_cbTorso);
		
		JLabel lblArms = new JLabel("Legs: ");
		GridBagConstraints gbc_lblArms = new GridBagConstraints();
		gbc_lblArms.anchor = GridBagConstraints.EAST;
		gbc_lblArms.insets = new Insets(0, 0, 5, 5);
		gbc_lblArms.gridx = 0;
		gbc_lblArms.gridy = 6;
		frame.getContentPane().add(lblArms, gbc_lblArms);
		
		JComboBox<Legs> cbLegs = new JComboBox<Legs>();
		cbLegs.addItem(new FastLegs());
		cbLegs.addItem(new SlowLegs());
		GridBagConstraints gbc_cbLegs = new GridBagConstraints();
		gbc_cbLegs.insets = new Insets(0, 0, 5, 0);
		gbc_cbLegs.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbLegs.gridx = 1;
		gbc_cbLegs.gridy = 6;
		frame.getContentPane().add(cbLegs, gbc_cbLegs);
		
		JLabel lblHead = new JLabel("Head: ");
		GridBagConstraints gbc_lblHead = new GridBagConstraints();
		gbc_lblHead.anchor = GridBagConstraints.EAST;
		gbc_lblHead.insets = new Insets(0, 0, 5, 5);
		gbc_lblHead.gridx = 0;
		gbc_lblHead.gridy = 7;
		frame.getContentPane().add(lblHead, gbc_lblHead);
		
		JComboBox<Head> cbHead = new JComboBox<Head>();
		cbHead.addItem(new GiantHead());
		cbHead.addItem(new LargeHead());
		cbHead.addItem(new MediumHead());
		cbHead.addItem(new SmallHead());
		GridBagConstraints gbc_cbHead = new GridBagConstraints();
		gbc_cbHead.insets = new Insets(0, 0, 5, 0);
		gbc_cbHead.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbHead.gridx = 1;
		gbc_cbHead.gridy = 7;
		frame.getContentPane().add(cbHead, gbc_cbHead);
		
		JLabel lblJaw = new JLabel("Jaw: ");
		lblJaw.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblJaw = new GridBagConstraints();
		gbc_lblJaw.anchor = GridBagConstraints.EAST;
		gbc_lblJaw.insets = new Insets(0, 0, 5, 5);
		gbc_lblJaw.gridx = 0;
		gbc_lblJaw.gridy = 8;
		frame.getContentPane().add(lblJaw, gbc_lblJaw);
		
		JCheckBox chckbxLargeJaw = new JCheckBox("Large Jaw?");
		GridBagConstraints gbc_chckbxLargeJaw = new GridBagConstraints();
		gbc_chckbxLargeJaw.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxLargeJaw.anchor = GridBagConstraints.WEST;
		gbc_chckbxLargeJaw.gridx = 1;
		gbc_chckbxLargeJaw.gridy = 8;
		frame.getContentPane().add(chckbxLargeJaw, gbc_chckbxLargeJaw);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO: Search xml file for exsiting creature with same name
				if (!tbCreatureName.getText().isEmpty()){
					
				}
				
				
				
				
				
				FileOperator xmlReader = new XMLCreatureReader();
				//TODO: Finish implementation of XML writer and reader
				
				frame.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.gridx = 1;
		gbc_btnCreate.gridy = 11;
		frame.getContentPane().add(btnCreate, gbc_btnCreate);
		
	
	}

}
