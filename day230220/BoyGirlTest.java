package day230220;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy=new Boy("罗密欧",23);
		boy.shout();
		
		Girl girl=new Girl("朱丽叶",18);
		girl.marry(boy);
		
		Girl girl2=new Girl("祝英台",20);
		int compare=girl2.compare(girl);
		if(compare>0) {
			System.out.println(girl2.getName()+"大");
		}else if(compare<0){
			System.out.println(girl.getName()+"大");
		}else {
			System.out.println("一样大");
		}
	}
}
