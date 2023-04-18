package day230418.Test1;

import org.junit.Test;

import java.util.List;

/**
 * @description:
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-18-22:07
 **/
public class DaoTest {

    @Test
    public void test1(){
        CustomerDao dao1=new CustomerDao();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);

        StudentDao dao2=new StudentDao();
        Student student = dao2.getIndex(1);
    }
}
