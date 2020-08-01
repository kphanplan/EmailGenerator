package emailgenerator;

public class Security {
	
	@SuppressWarnings("unused")
	private String password;
	
	private static String randomPassword() {
		int length = 12;
		// creates the set of characters it can pick from
		String passwordSet 
		= "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789!@#$%";
		
		// collect characters into array
		char[] password = new char[length];
		// loop thru length amount of times and generate random number from set
		// remember, math.random generates a decimal < 1
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public static String getRandomPassword () {
		return randomPassword();
	}
}
