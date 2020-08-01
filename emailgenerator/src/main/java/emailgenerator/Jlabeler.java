package emailgenerator;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jlabeler {
	
	private JLabel label; 
	private JTextField textfield; 
	private int[] dimensions;
	
	
	public JLabel getLabel() {
		return label;
	}

	public JTextField getTextfield() {
		return textfield;
	}

	public int[] getDimensions() {
		return dimensions;
	}

	
	public Jlabeler(String label, int[] dimensions) {
		this.label = new JLabel(label); 
		this.label.setBounds(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);
		
	}
}
