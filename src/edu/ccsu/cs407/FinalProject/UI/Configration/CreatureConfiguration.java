package edu.ccsu.cs407.FinalProject.UI.Configration;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import edu.ccsu.cs407.FinalProject.CreatureParts.AverageClaws;
import edu.ccsu.cs407.FinalProject.CreatureParts.Brain;
import edu.ccsu.cs407.FinalProject.CreatureParts.Claws;
import edu.ccsu.cs407.FinalProject.CreatureParts.CrazedBrain;
import edu.ccsu.cs407.FinalProject.CreatureParts.DullTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.FastLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.GiantHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.Head;
import edu.ccsu.cs407.FinalProject.CreatureParts.Jaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeJaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.LargeTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Legs;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.MediumTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalBrain;
import edu.ccsu.cs407.FinalProject.CreatureParts.NormalJaw;
import edu.ccsu.cs407.FinalProject.CreatureParts.SharpClaws;
import edu.ccsu.cs407.FinalProject.CreatureParts.SharpTeeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.SlowLegs;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallHead;
import edu.ccsu.cs407.FinalProject.CreatureParts.SmallTorso;
import edu.ccsu.cs407.FinalProject.CreatureParts.Teeth;
import edu.ccsu.cs407.FinalProject.CreatureParts.Torso;
import edu.ccsu.cs407.FinalProject.CreatureParts.WeakClaws;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;
import edu.ccsu.cs407.FinalProject.Creatures.CreatureBuilder;
import edu.ccsu.cs407.FinalProject.FightStrategies.FightStrategy;
import edu.ccsu.cs407.FinalProject.FightStrategies.Fights;
import edu.ccsu.cs407.FinalProject.FightStrategies.RunAway;
import edu.ccsu.cs407.FinalProject.FileOperations.FileOperator;
import edu.ccsu.cs407.FinalProject.FileOperations.XMLCreatureReader;

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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		
		//Creature Name Label
		JLabel lblCreatureName = new JLabel("Creature Name: ");
		lblCreatureName.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblCreatureName = new GridBagConstraints();
		gbc_lblCreatureName.anchor = GridBagConstraints.EAST;
		gbc_lblCreatureName.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreatureName.gridx = 0;
		gbc_lblCreatureName.gridy = 1;
		frame.getContentPane().add(lblCreatureName, gbc_lblCreatureName);
		
		//Creature Name Text Field
		tbCreatureName = new JTextField();
		GridBagConstraints gbc_tbCreatureName = new GridBagConstraints();
		gbc_tbCreatureName.insets = new Insets(0, 0, 5, 0);
		gbc_tbCreatureName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tbCreatureName.gridx = 1;
		gbc_tbCreatureName.gridy = 1;
		frame.getContentPane().add(tbCreatureName, gbc_tbCreatureName);
		tbCreatureName.setColumns(10);
		
		//Creature Fighting Strategy
		JLabel lblNewLabel_2 = new JLabel("Fight Strategy: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		final JComboBox<FightStrategy> cbFightStrategy = new JComboBox<FightStrategy>();
		cbFightStrategy.addItem(new Fights());
		cbFightStrategy.addItem(new RunAway());
		
		GridBagConstraints gbc_cbFightStrategy = new GridBagConstraints();
		gbc_cbFightStrategy.insets = new Insets(0, 0, 5, 0);
		gbc_cbFightStrategy.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbFightStrategy.gridx = 1;
		gbc_cbFightStrategy.gridy = 3;
		frame.getContentPane().add(cbFightStrategy, gbc_cbFightStrategy);
		
		//Creature Torso
		JLabel lblTorso = new JLabel("Torso: ");
		GridBagConstraints gbc_lblTorso = new GridBagConstraints();
		gbc_lblTorso.anchor = GridBagConstraints.EAST;
		gbc_lblTorso.insets = new Insets(0, 0, 5, 5);
		gbc_lblTorso.gridx = 0;
		gbc_lblTorso.gridy = 4;
		frame.getContentPane().add(lblTorso, gbc_lblTorso);
		
		final JComboBox<Torso> cbTorso = new JComboBox<Torso>();
		cbTorso.addItem(new SmallTorso());
		cbTorso.addItem(new MediumTorso());
		cbTorso.addItem(new LargeTorso());
		GridBagConstraints gbc_cbTorso = new GridBagConstraints();
		gbc_cbTorso.insets = new Insets(0, 0, 5, 0);
		gbc_cbTorso.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbTorso.gridx = 1;
		gbc_cbTorso.gridy = 4;
		frame.getContentPane().add(cbTorso, gbc_cbTorso);
		
		//Creature Legs
		JLabel lblArms = new JLabel("Legs: ");
		GridBagConstraints gbc_lblArms = new GridBagConstraints();
		gbc_lblArms.anchor = GridBagConstraints.EAST;
		gbc_lblArms.insets = new Insets(0, 0, 5, 5);
		gbc_lblArms.gridx = 0;
		gbc_lblArms.gridy = 5;
		frame.getContentPane().add(lblArms, gbc_lblArms);
		
		final JComboBox<Legs> cbLegs = new JComboBox<Legs>();
		cbLegs.addItem(new FastLegs());
		cbLegs.addItem(new SlowLegs());
		GridBagConstraints gbc_cbLegs = new GridBagConstraints();
		gbc_cbLegs.insets = new Insets(0, 0, 5, 0);
		gbc_cbLegs.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbLegs.gridx = 1;
		gbc_cbLegs.gridy = 5;
		frame.getContentPane().add(cbLegs, gbc_cbLegs);
		
		//Creature Head
		JLabel lblHead = new JLabel("Head: ");
		GridBagConstraints gbc_lblHead = new GridBagConstraints();
		gbc_lblHead.anchor = GridBagConstraints.EAST;
		gbc_lblHead.insets = new Insets(0, 0, 5, 5);
		gbc_lblHead.gridx = 0;
		gbc_lblHead.gridy = 6;
		frame.getContentPane().add(lblHead, gbc_lblHead);
		
		final JComboBox<Head> cbHead = new JComboBox<Head>();
		cbHead.addItem(new GiantHead());
		cbHead.addItem(new LargeHead());
		cbHead.addItem(new MediumHead());
		cbHead.addItem(new SmallHead());
		GridBagConstraints gbc_cbHead = new GridBagConstraints();
		gbc_cbHead.insets = new Insets(0, 0, 5, 0);
		gbc_cbHead.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbHead.gridx = 1;
		gbc_cbHead.gridy = 6;
		frame.getContentPane().add(cbHead, gbc_cbHead);
		
		//Creature Brain
		JLabel lblBrain = new JLabel("Brain: ");
		GridBagConstraints gbc_lblBrain = new GridBagConstraints();
		gbc_lblBrain.anchor = GridBagConstraints.EAST;
		gbc_lblBrain.insets = new Insets(0, 0, 5, 5);
		gbc_lblBrain.gridx = 0;
		gbc_lblBrain.gridy = 7;
		frame.getContentPane().add(lblBrain, gbc_lblBrain);
		
		final JComboBox<Brain> cbBrain = new JComboBox<Brain>();
		cbBrain.addItem(new NormalBrain());
		cbBrain.addItem(new CrazedBrain());
		GridBagConstraints gbc_cbBrain = new GridBagConstraints();
		gbc_cbBrain.insets = new Insets(0, 0, 5, 0);
		gbc_cbBrain.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBrain.gridx = 1;
		gbc_cbBrain.gridy = 7;
		frame.getContentPane().add(cbBrain, gbc_cbBrain);
		
		
		//Creature Jaw
		JLabel lblJaw = new JLabel("Jaw: ");
		lblJaw.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblJaw = new GridBagConstraints();
		gbc_lblJaw.anchor = GridBagConstraints.EAST;
		gbc_lblJaw.insets = new Insets(0, 0, 5, 5);
		gbc_lblJaw.gridx = 0;
		gbc_lblJaw.gridy = 8;
		frame.getContentPane().add(lblJaw, gbc_lblJaw);
		
		final JComboBox<Jaw> cbJaw = new JComboBox<Jaw>();
		cbJaw.addItem(new NormalJaw());
		cbJaw.addItem(new LargeJaw());
		GridBagConstraints gbc_cbJaw = new GridBagConstraints();
		gbc_cbJaw.insets = new Insets(0, 0, 5, 0);
		gbc_cbJaw.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbJaw.gridx = 1;
		gbc_cbJaw.gridy = 8;
		frame.getContentPane().add(cbJaw, gbc_cbJaw);
		
		//Creature Teeth
		JLabel lblTeeth = new JLabel("Teeth:");
		GridBagConstraints gbc_lblTeeth = new GridBagConstraints();
		gbc_lblTeeth.anchor = GridBagConstraints.EAST;
		gbc_lblTeeth.insets = new Insets(0, 0, 5, 5);
		gbc_lblTeeth.gridx = 0;
		gbc_lblTeeth.gridy = 9;
		frame.getContentPane().add(lblTeeth, gbc_lblTeeth);
		
		final JComboBox<Teeth> cbTeeth = new JComboBox<Teeth>();
		cbTeeth.addItem(new SharpTeeth());
		cbTeeth.addItem(new DullTeeth());
		GridBagConstraints gbc_cbTeeth = new GridBagConstraints();
		gbc_cbTeeth.insets = new Insets(0, 0, 5, 0);
		gbc_cbTeeth.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbTeeth.gridx = 1;
		gbc_cbTeeth.gridy = 9;
		frame.getContentPane().add(cbTeeth, gbc_cbTeeth);
		
		//Creature Claws
		JLabel lblClaws = new JLabel("Claws: ");
		GridBagConstraints gbc_lblClaws = new GridBagConstraints();
		gbc_lblClaws.anchor = GridBagConstraints.EAST;
		gbc_lblClaws.insets = new Insets(0, 0, 5, 5);
		gbc_lblClaws.gridx = 0;
		gbc_lblClaws.gridy = 10;
		frame.getContentPane().add(lblClaws, gbc_lblClaws);
		
		final JComboBox<Claws> cbClaws = new JComboBox<Claws>();
		cbClaws.addItem(new AverageClaws());
		cbClaws.addItem(new SharpClaws());
		cbClaws.addItem(new WeakClaws());
		GridBagConstraints gbc_cbClaws = new GridBagConstraints();
		gbc_cbClaws.insets = new Insets(0, 0, 5, 0);
		gbc_cbClaws.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbClaws.gridx = 1;
		gbc_cbClaws.gridy = 10;
		frame.getContentPane().add(cbClaws, gbc_cbClaws);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO: Search xml file for exsiting creature with same name
				if (!tbCreatureName.getText().isEmpty()){
					
				}
				
				
				Brain brain = (Brain)cbBrain.getSelectedItem();
				Jaw jaw = (Jaw)cbJaw.getSelectedItem();
				Claws claw = (Claws)cbClaws.getSelectedItem();
				Head head = (Head)cbHead.getSelectedItem();
				Torso torso = (Torso)cbTorso.getSelectedItem();
				Legs legs = (Legs)cbLegs.getSelectedItem();
				FightStrategy fight = (FightStrategy)cbFightStrategy.getSelectedItem();
				String name = tbCreatureName.getText();
				Teeth teeth = (Teeth)cbTeeth.getSelectedItem();
				
				CreatureBuilder builder = new CreatureBuilder();
				builder.setBrain(brain);
				builder.setClaws(claw);
				builder.setFightStrategy(fight);
				builder.setHead(head);
				builder.setJaw(jaw);
				builder.setName(name);
				builder.setLegs(legs);
				builder.setTeeth(teeth);
				builder.setTorso(torso);
				Creature creature = builder.buildCreature();

				XMLCreatureReader xmlReader = new XMLCreatureReader();
				//TODO: Finish implementation of XML writer and reader
				try {
					xmlReader.WriteToFile(creature);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.gridx = 1;
		gbc_btnCreate.gridy = 13;
		frame.getContentPane().add(btnCreate, gbc_btnCreate);
		
	
	}

}
