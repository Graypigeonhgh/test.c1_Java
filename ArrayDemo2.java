package com.atguigu.contact;

import java.util.Scanner;

/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月10日上午9:55:59
 *
 */
	/*
	 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。 成绩>=最高分-1日 等级为'A’成绩>=最高分-2日 等级为'B”成绩>=最高分-3日
	 * 等级为'C” 其余 等级为'D’ 提示:先读入学生人数，根据人数创建int数组，存放学生成绩。
	 */	

public class ArrayDemo2 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();//读取学生个数
		int[] scores=new int[number];//动态初始化
		System.out.println("请输入"+number+"个学生成绩");
		int maxScore=0;
		for(int i=0;i<scores.length;i++)
		{
			scores[i]=scanner.nextInt();//给数组中的元素赋值
			if(maxScore<scores[i])//获取最大值
			{
				maxScore=scores[i];
			}
		}
		
		char level;
		for(int i=0;i<scores.length;i++)//评级
		{
			if(maxScore-scores[i]<=10)
			{
				level='A';
			}
			else if(maxScore-scores[i]<=20)
			{
				level='B';
			}
			else if(maxScore-scores[i]<=30)
			{
				level='C';
			}
			else
			{
				level='D';
			}
			System.out.println("student"+(i+1)+" score is"+scores[i]+",grade is "+level);
		}
		
	}
}
