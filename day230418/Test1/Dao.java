package day230418.Test1;

import java.util.List;

/**
 * @description:    泛型方法的使用场景
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-18-21:55
 **/
public class Dao<T> {   //表的共性操作的Dao

    //添加一条记录
    public void add(T t){

    }
    //删除一条记录
    public boolean remove(int index){
        return false;
    }
    //修改一条记录
    public void update(int index,T t){

    }
    //查询一条记录
    public T getIndex(int index){   //记录的返回值类型不确定，用泛型表示
        return null;
    }
    //查询多条记录
    public List<T> getForList(int index){
        return null;
    }

    //泛型方法
    //举例：获取表中一共有多少条记录？获取最大的员工入职时间？
    public <E> E getValue(){    //E与T无关
        return null;
    }
}
