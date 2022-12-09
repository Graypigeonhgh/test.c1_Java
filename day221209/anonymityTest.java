package day221209;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年12月9日下午6:01:20
 *
 */
public class anonymityTest {
	public static void main(String[] args) {
		Phone p=new Phone();		//新建一个对象
		System.out.println(p);		//p=nall;
		//调用方法
		p.sendEmail();
		p.playGame();
		
		//匿名对象调用属性和方法
		new Phone().price=1999;		//用new Phone()来替代p
		new Phone().showPrice();//0.0
		
		PhoneMall mall=new PhoneMall();
		//匿名对象的使用（常用）
		//mall.show(p);
		mall.show(new Phone());
		
		
	}
}


class PhoneMall{
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;//价格
	public void sendEmail() {
		System.out.println("发送邮件");
	}
	public void playGame() {
		System.out.println("玩游戏");
	}
	public void showPrice() {
		System.out.println("随机价格为："+price);
	}
}














