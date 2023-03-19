package day230318_project.service;

public class Data {
    public static final int EMPOYEE = 10; //员工数量
    public static final int PROGRAMMER = 11;//程序员
    public static final int DESIGNER=12;    //设计师
    public static final int ARCHITECT=13;   //架构师

    public static final int PC=21;
    public static final int NOTEBOOK=22;
    public static final int PRINTER=23;

    //Employee:10,id,name,age,salary
    //Frogammer:11,id,name,age,salary
    //Designer:12,id,name,age,salary,bonus
    //Architest:13,id,name,age,salary,bonus,stock;
    public static final String[][] EMPLOYEES={
            {"10","1","马云 ","22","3000"},
            {"13","2","马化腾","32","18000","15000","2000"},
            {"11","3","李彦宏","23","7800"},
            {"11","4","刘强东","24","7000"},
            {"12","5","雷军 ","28","10000","5000"},
            {"11","6","任志强","26","6800"},
            {"12","7","柳传志","26","10800","5200"},
            {"13","8","杨元庆","30","19800","15000","2500"},
            {"12","9","史玉柱","36","9800","5500"},
            {"11","10","丁磊 ","26","6800"},
            {"11","11","张朝阳","25","7100"},
            {"12","12","杨志远","40","9600","4800"},
    };

    //如下的EQUIPMENTS数组与上面的EMPLOYEES数组元素一一对应
    //pc      :21,model,display
    //NoteBook:22,model,price
    //Printer :23,name, type

    public static final String[][] EQUIPMENTS={
            {},
            {"22","联想T4","6000"},
            {"21","戴尔","NEC17寸"},
            {"21","戴尔","三星17寸"},
            {"23","佳能2900","激光"},
            {"21","华硕","三星17寸"},
            {"21","华硕","三星17寸"},
            {"23","爱普生20K","针式"},
            {"22","惠普m6","5800"},
            {"21","戴尔","NEC 17寸"},
            {"21","华硕","三星17寸"},
            {"22","惠普m6","5800"},

    };


}