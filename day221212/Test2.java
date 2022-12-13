package day221212;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Mathod mathod=new Mathod();
		Information info=new Information();
		boolean flag=true;
		while(flag) {
			//注册
			mathod.register(info.student, info.userNum);
			info.userNum++;
		}
	}
}


class Mathod{
		public void register(Student[] student,int userNum) {
			Scanner scanner=new Scanner(System.in);
			Student stu=new Student();

			//如果数组已满，就扩展数组长度		
			if(userNum==student.length) {
				student=student[student.length-1].expand(student,userNum);
			}
			
			System.out.println("请输入用户名：");
			stu.userName=scanner.next();
			System.out.println("请输入密码：");
			stu.password=scanner.next();
			//将用户信息封装到一个对象中
			student[userNum]=new Student();
			//将信息存入对象数组中
			student[userNum].saveInfo(stu.userName, stu.password);
			//查看存入数组的信息
			for(int i=0;i<student.length;i++) {
				System.out.print("学生"+i+" 账号："+student[i].userName+"; 密码："+student[i].password+"\n");
			}
			
			System.out.println("\n已注册学生个数："+(userNum+1));
			
	}

}



class Student{
	String userName;
	String password;
	
	public void saveInfo(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}
	
	//用户扩容
	public Student[] expand(Student[] student,int userNum) {
		Student[] student1=new Student[userNum+1];
		//把student对象数组中的所有元素（所有对象地址）赋值给新扩容的对象数组student1
		for(int i=0;i<student1.length-1;i++) {
			student1[i]=student[i];
		}
		return student1;
	}
	
	
}

class Information{
	public static Student[] student=new Student[1];
	int userNum=0;

}









