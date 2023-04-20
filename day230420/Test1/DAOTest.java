package day230420.Test1;

import java.util.List;

/**
 * @description: 创建DAO类的对象，分别调用其save,get,update,list,delete方法来操作User对象，
 * 使用Junit单元测试类进行测试
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-20-22:12
 **/
public class DAOTest {

    public static void main(String[] args) {
        DAO<User> dao=new DAO<User>();
        dao.save("1001",new User(1001,34,"周柏豪"));
        dao.save("1002",new User(1002,23,"张杰"));
        dao.save("1003",new User(1003,46,"周杰伦"));

        //修改
        dao.update("1003",new User(1002,30,"薛之谦"));

        //删除
        dao.delete("1002");

        List<User> list=dao.list();
        //遍历
//        System.out.println(list);
        list.forEach(System.out::println);
    }
}
