package day230317.Test1;

//如何自定义异常类?
//1.继承于现有的异常结构: RuntimeException 、Exception
//2.提供全局常量: serialVersionUID
public class MyException extends RuntimeException{

    static final long serialVersionUID=-7034897193246939L;

    public MyException(){

    }

    public MyException(String msg){
        super(msg);
    }
}
