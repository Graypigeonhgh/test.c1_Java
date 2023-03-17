package day230317.Test1;

import java.io.FileNotFoundException;
import java.io.IOException;

//方法重写的规则之一:
//子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
public class OverrideTest {

    public static void main(String[] args) {
        OverrideTest test=new OverrideTest();
        test.display(new SubClass());   //多态：父类的引用指向子类的对象
    }

    public void display(SuperClass s){
        try{
            s.method();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class SuperClass{

    public void method() throws IOException {

    }
}

class SubClass extends SuperClass{
    @Override //重写方法:throws + 异常类型 可不写
    public void method() throws FileNotFoundException {

    }
}