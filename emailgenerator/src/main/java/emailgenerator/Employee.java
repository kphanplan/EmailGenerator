package emailgenerator;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public String getPassword() {
		return password;
	}

	private String password;
	
	public Employee(String firstName, String lastName, String department, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.password = password;
	}
	
	public String generateEmail() {
		String email = this.firstName.toLowerCase().trim() + "." + this.lastName.toLowerCase().trim() + "@" + this.department.toLowerCase().trim() + ".kpbank.com";
		String em = email.replaceAll("\\s+","_");
		return em;

	}
}
