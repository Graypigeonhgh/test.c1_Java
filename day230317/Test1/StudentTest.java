package day230317.Test1;

public class StudentTest {
    public static void main(String[] args) {
        try{
            Student s=new Student();
            s.regist(-1001);
            System.out.println(s);
        }catch(Exception e){        //Exception e=new Exception("您输入的数据非法");
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }

}

class Student{

    private int id;

    public void regist(int id) throws Exception {
        if(id>0){
            this.id=id;
        }else{
//            System.out.println("您输入的数据非法");
            //手动抛出异常
//            throw new RuntimeException("您输入的数据非法");
            //throw new Exception("您输入的数据非法");
            throw new MyException("不能输入负数");    //自定义异常类

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}