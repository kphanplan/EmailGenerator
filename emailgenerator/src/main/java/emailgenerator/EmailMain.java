package emailgenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EmailMain implements ActionListener {

	// ATTRIBUTES more descriptive
	JButton submit;
	JTextArea sample, results;
	JLabel title, l4, l5;
	JTextField t1, t2, t3;
	


	public EmailMain() {
		// Building the GUI
		JFrame f = new JFrame("KP Bored'n Chafed Bank");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		List<Jlabeler> inputfields = new ArrayList<Jlabeler>();
		
		Jlabeler firstName = new Jlabeler("First Name: ",  new int[] {40, 50, 100, 30});
		
		Jlabeler lastName = new Jlabeler("Last Name: ",  new int[] {40, 100, 100, 30});
		
		Jlabeler department = new Jlabeler("Department: ", new int[] {40, 150, 100, 30});
		
		title = new JLabel("GENERATE EMAIL & PASSWORD");
		title.setBounds(40, 20, 200, 30);

		t1 = new JTextField();
		t1.setBounds(40, 75, 200, 30);
		
		t2 = new JTextField();
		t2.setBounds(40, 125, 200, 30);
		
		t3 = new JTextField();
		t3.setBounds(40, 175, 200, 30);
		
		inputfields.add(firstName);
		inputfields.add(lastName);
		inputfields.add(department);

		l4 = new JLabel("Sample Departments:");
		l4.setBounds(40, 200, 200, 30);
		
		l5 = new JLabel("RESULTS:");
		l5.setBounds(40, 350, 200, 30);
		
		sample = new JTextArea("Development\r\nAccounting\r\nMarketting");
		sample.setEditable(false);
		sample.setBounds(40, 230, 300, 50);
		
		submit = new JButton("Submit");
		submit.setBounds(40, 300, 100, 30);
		submit.addActionListener(this);

		results = new JTextArea("Enter your credentials above");
		results.setEditable(false);
		results.setBounds(40, 375, 300, 150);

		f.add(title);

		for(Jlabeler holder : inputfields) {
			f.add(holder.getLabel());
		}
		
		f.add(l4);
		f.add(l5);
		f.add(sample);

		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(submit);
		f.add(results);

		f.setSize(400, 600);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new EmailMain();
	}

	public void actionPerformed(ActionEvent e) {

//		String s1 = t1.getText();
//		String s2 = t2.getText();
//		String s3 = t3.getText();
//		String email = employee.getFirstName().toLowerCase().trim() + "." + employee.getLastName().toLowerCase().trim() + "@" + getDepartment.toLowerCase().trim() + ".kpbank.com";
		
		Employee employee = new Employee(t1.getText(), t2.getText(), t3.getText(), "Hello"); 
		String password = Security.getRandomPassword();
		String email = employee.generateEmail();
		
		
		if (e.getSource() == submit) {
			results.setText("WELCOME TO KPBNCK\r\n" + "\r\nFirst Name:  " + employee.getFirstName() + "\r\nLast Name:  " + employee.getLastName()
					+ "\r\nDepartment:  " + employee.getDepartment() + "\r\n" + "\r\nCompany Email: \r\n" + email + "\r\nPassword:  " + password.toString());
		}
	}
}
