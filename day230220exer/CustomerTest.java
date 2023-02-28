package day230220exer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer cust=new Customer("Jane","Smith");
		
		Account acct=new Account(1001,2000,0.0123);
		
		cust.setAccount(acct);	//使account与其customer对应
		
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(200);
		cust.getAccount().withdraw(300);
		
		System.out.println("Customer["+cust.getLastName()+"·"+cust.getFirstName()+
				"]\nhas a account: id is "+cust.getAccount().getId()+"\nannualInterstrate "
						+ "is "+cust.getAccount().getAnnualInterestRate()*100+"%\nbalance "
						+ "is "+ cust.getAccount().getBalance());
	}
}
