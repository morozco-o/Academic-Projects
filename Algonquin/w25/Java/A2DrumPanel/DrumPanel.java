import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is the main panel/container object for the application GUI
 * widgets. This is a java Swing application.
 * 
 * @author Rodrigo Orozco
 * @version 1
 * @see DrumTest
 * @see DrumPanel
 * @see FlammableDrum
 * @see ToxicDrum
 * @see Drum
 * @since 17
 */
public class DrumPanel extends JPanel {

	/**
	 * Serves as a label to the prompt of numberToCreate
	 */
	private JLabel drumPrompt;
	/**
	 * Input field to enter number of drums to create
	 */
	private JTextField numberToCreate;
	/**
	 * Radio button to choose type flammable drum
	 */
	private JRadioButton flammableDrumType;
	/**
	 * Radio button to choose type toxic drum
	 */
	private JRadioButton toxicDrumType;
	/**
	 * Button to start the creation of drums
	 */
	private JButton createDrums;
	/**
	 * Button to start running tests of drums
	 */
	private JButton runTests;
	/**
	 * Text area where all outputed data will go
	 */
	private JTextArea testResults;
	/**
	 * Label for text area responding to user behavuor
	 */
	private JLabel statusField;

	/** List of drums creates. */
	List<Drum> listOfDrums = new ArrayList<Drum>();

	/** Serial version required. */
	private static final long serialVersionUID = 1L;

	/**
	 * Create and populate the main drum panel with appropriate GUI widgets.
	 */
	public DrumPanel() {
		initGUI();
	}

	/**
	 * Create and populate the panel with appropriate GUI components.
	 */
	private void initGUI() {
		setToolTipText(
				"When finished with the application click the 'X' on the top bar, right side to close the application");
		setLayout(new FlowLayout());

		JPanel p = new JPanel();

		p.add(createDrumTypePanel());
		p.add(createDrumNumberPanel());
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(p);

		box.add(createButtonPanel());

		add(box, TOP_ALIGNMENT);
		add(createResultsPanel(), CENTER_ALIGNMENT);
		statusField = new JLabel("Status field for errors etc.");
		add(statusField, BOTTOM_ALIGNMENT);
	}

	/**
	 * Creates a panel to hold other GUI elements
	 * 
	 * @return trp
	 */
	private JPanel createResultsPanel() {
		JPanel trp = new JPanel();
		testResults = new JTextArea(25, 50);
		testResults.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Results"),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		testResults.setBorder(BorderFactory.createRaisedBevelBorder());
		JScrollPane sp = new JScrollPane(testResults);
		trp.add(sp);
		return trp;
	}

	/**
	 * Create the drum number panel.
	 * 
	 * @return numberPanel
	 */
	private JPanel createDrumNumberPanel() {
		drumPrompt = new JLabel("Number of drums to create ");
		drumPrompt.setToolTipText("The number of drums to create");
		numberToCreate = new JTextField(10);
		numberToCreate.setToolTipText("Enter the number of drums to create");

		JPanel numberPanel = new JPanel();
		numberPanel.setLayout(new BoxLayout(numberPanel, BoxLayout.X_AXIS));
		numberPanel.add(drumPrompt);
		numberPanel.add(numberToCreate);
		numberPanel.setBorder(BorderFactory.createRaisedBevelBorder());

		return numberPanel;
	}

	/**
	 * Create the drum button panel.
	 * 
	 * @return The panel object containing the buttons.
	 */
	private JPanel createButtonPanel() {
		createDrums = new JButton("Create Drums");
		createDrums.setToolTipText("Click me to create the specified number and type of drums to create");
		createDrums.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				// Pulls numerical value for number of drums to create
				double createMax = Double.parseDouble(numberToCreate.getText());

				for (double counter = 0; counter < createMax; counter++) {

					// Get type of drums to create
					if (flammableDrumType.isSelected()) {
						// if creating display first notification
						if (counter == 0) {
							testResults.append("Creating [" + (int) createMax + "] FlammableDrums \n");
						}
						// creates all the drums and appends to array list
						// assuming basic values as described in expected output
						FlammableDrum drumFName = new FlammableDrum(36, 24, "Flammable Materials", 48);
						listOfDrums.add(drumFName);
					} else if (toxicDrumType.isSelected()) {
						if (counter == 0) {
							testResults.append("Creating [" + (int) createMax + "] ToxicDrums \n");
						}
						ToxicDrum drumTName = new ToxicDrum(36, 24, "Radioactive Isotopes", "CLASS_IA");
						listOfDrums.add(drumTName);
					} else {
						statusField.setText("NO Drum type has been selected");
					}
					testResults.append("\n");
				}
			}

		});

		runTests = new JButton("Run Tests");
		runTests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				// output toString for appropriate drum types
				if (flammableDrumType.isSelected()) {
					for (int counter = 0; counter < listOfDrums.size(); counter++) {
						if (listOfDrums.get(counter) instanceof FlammableDrum) {
							statusField.setText("Testing Drum Value Display");
							testResults.append("[" + counter + "]: domain.FlammableDrum::\n");
							testResults.append(listOfDrums.get(counter).toString());
							testResults.append("\n");
						}
					}
				} else if (toxicDrumType.isSelected()) {
					for (int counter = 0; counter < listOfDrums.size(); counter++) {
						if (listOfDrums.get(counter) instanceof ToxicDrum) {
							statusField.setText("Testing Drum Value Display");
							testResults.append("[" + counter + "]: domain.ToxicDrum::\n");
							testResults.append(listOfDrums.get(counter).toString());
							testResults.append("\n");
						}
					}
				}
			}
		});

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

		buttonPanel.add(createDrums);
		buttonPanel.add(runTests);

		buttonPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Action"),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		buttonPanel.setBorder(BorderFactory.createRaisedBevelBorder());

		return buttonPanel;
	}

	/**
	 * Create the drum creation panel.
	 * 
	 * @return
	 */
	private JPanel createDrumTypePanel() {
		flammableDrumType = new JRadioButton("Flammable Drum");
		toxicDrumType = new JRadioButton("Toxic Drum");
		ButtonGroup group = new ButtonGroup();
		group.add(toxicDrumType);
		group.add(flammableDrumType);
		JPanel typePanel = new JPanel();
		typePanel.setLayout(new BoxLayout(typePanel, BoxLayout.Y_AXIS));
		typePanel.add(flammableDrumType);
		typePanel.add(toxicDrumType);
		typePanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Types of Drums"),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		typePanel.setBorder(BorderFactory.createRaisedBevelBorder());

		return typePanel;
	}

}
