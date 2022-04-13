package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int passwordLength = 10;
	private String dept;
	private int mailboxCapacity = 500;
	private String email;
	private String altEmail;
	private String companySuffix = "suhdudellc.com";
	
	// Constructor to receive first, last name
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created yay: " + this.firstName + " " + this.lastName + "\n");

		// Call a method asking for department
		this.dept = setDepartment();
		System.out.println("You chose department: " + this.dept);
		
		// Call a method that returns a random password
		this.password = setRandomPassword(passwordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept + companySuffix;	
		System.out.println("Your email is: " + email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("Enter the department:\n\n1 for SALES\n2 for DEVELOPMENT\n3 for ACCOUNTING\n0 for NONE\n");
		Scanner scan = new Scanner(System.in);
		int deptChoice = scan.nextInt();
		switch(deptChoice) {
		case 1:
			return "sales.";
		case 2:
			return "dev.";
		case 3:
			return "acct.";
		default:
			return "";
		}
	}
	
	// Generate a random password
	private String setRandomPassword(int length) {
		String passwordSet = "[ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%]";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	// Get mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		mailboxCapacity = capacity;
	}
	
	// Get alternate email
	public String getAltEmail() {
		return altEmail;
	}
	
	// Set the alternate email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	// Get password
	public String getPassword() {
		return password;
	}
	
	// Change the password
	public void updatePassword(String password) {
		this.password = password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY" + mailboxCapacity + "mb";
	}
	 
}
