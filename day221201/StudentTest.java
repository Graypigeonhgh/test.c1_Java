package day221201;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年12月1日下午7:25:44
 *  
 *4.对象数组题目:
定义类Student，包含三个属性:学号number(int)，年级grade(int)，成绩score(int)。
创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一:打印出3年级(state值为3)的学生信息。
问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示:
1)生成随机数:Math.random()，返回值类型double:
2)四舍五入取整:Math.round(double d)，返回值类型long。
5.声明一个日期类型MvDate:有属性:年vear.月month，日dav。创建2个日期对象，分别赋值为:
你的出生日期，你对象的出生日期，并显示信息。
 */
public class StudentTest {
	public static void main(String[] args) {
		//声明Student类型数组（对象数组：只是把String类改成自定义类）
		Student1[] stus=new Student1[20];
		
		for(int i=0;i<stus.length;i++) {
			//给数组元素赋值??????????????????????????????????????????????
			stus[i]=new Student1();
			//给Student对象的属性赋值
			stus[i].number=(i+1);
			//年级：[1,6]
			stus[i].grade=(int)(Math.random()*6+1);
			//成绩：[0,100]
			stus[i].score=(int)(Math.random()*101);
		}
		
		StudentTest test=new StudentTest();
		//遍历学生数组
		test.print(stus);
		System.out.println("***************************");
		
		//问题1：打印出3年级（grade=3）的学生信息
		test.serchgrade(stus,4);
		System.out.println("**************************");
		
		//问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
		test.sort(stus);
	
		//遍历学生数组
		test.print(stus);

	}
	
	
	/**
	 * 
	 * @Description	 遍历Student1[]的数组
	 * @author greypigeon
	 * @date 2022年12月1日下午9:00:02
	 * @param stus
	 */
	public void print(Student1[] stus) {		//数组传参
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].infor());
		}
		
	}
	
	
	/**
	 * 
	 * @Description  查找指定年级的学生信息
	 * @author greypigeon
	 * @date 2022年12月1日下午8:54:04
	 * @param stus   要查找的数组
	 * @param grade	 要查找的年级
	 */
	public void serchgrade(Student1[] stus,int grade) {
		for(int i=0;i<stus.length;i++) {
			if(stus[i].grade==3) {
				System.out.println(stus[i].infor());//若只写stus[i].infor(),则只会打印地址值
			}
		}
	}
	
	
	/**
	 * 
	 * @Description	 给Student1数组排序
	 * @author greypigeon
	 * @date 2022年12月1日下午8:58:46
	 * @param stus
	 */
	public void sort(Student1[] stus) {
		for(int i=0;i<stus.length-1;i++) {
			for(int j=0;j<stus.length-1-i;j++) {
				if(stus[j].score>stus[j+1].score) {
					//如果需要换序，交换的是数组的元素：Student对象，（不是stus[].score）
					Student1 temp=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=temp;
				}
			}
		}		
	}
	
}

class Student1{
	int number;//学号
	int grade;//年级
	int score;//成绩
	
	//显示学生信息的方法
	public String infor() {
		return "学号："+number+",年级"+grade+",成绩"+score;
	}
}



























