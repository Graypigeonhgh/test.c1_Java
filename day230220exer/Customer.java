package day230220exer;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f,String i) {
		this.firstName=f;
		this.lastName=i;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
