package day230316.Test2;

public class ErrorTest {
    public static void main(String[] args) {

        //1.栈溢出：java.lang.StackOverflowError
        //main(args);

        //2.堆溢出：java.lang.OutOfMemoryError (OOM)
        Integer[] arr=new Integer[1024*1024*1024];
    }
}
