package day230220exer2;
/**
 * 
 *  @Description	Account,  Customers和Bank
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2023年2月20日下午9:28:19
 *
 */
public class BankTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		
		bank.addCustomer("Jane", "Smith");//添加客户
		
		bank.getCustomer(0).setAccount(new Account(2000));
		
		bank.getCustomer(0).getAccount().withdraw(1000);//取钱
		
		double balance=bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客户："+bank.getCustomer(0).getFirstName()+bank.getCustomer(0).getLastName()+
				"的账户余额为："+balance);
		
		System.out.println("************************");
		bank.addCustomer("小强", "张");
		bank.addCustomer("小明", "黄");
		System.out.println("银行客户的个数为："+bank.getNumOfCustomers());
		
	}
}
