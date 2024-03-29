package day230420.Test1;

import java.util.*;

/**
 * @description:    自定义泛型类DAO<T>
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-20-21:46
 **/
public class DAO<T> {
    private Map<String,T> map=new HashMap<String,T>();
    //保存T类型的对象到Map成员变量中
    public void save(String id,T entity){
        map.put(id,entity);
    }

    //从map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    }

    //替换map中的key为id的内容，改为entity对象
    public void update(String id,T entity){
        if(map.containsKey(id));{
            map.put(id,entity);
        }
    }

    //返回map中存放的所有T对象
    public List<T> list(){
        //错误的
//        Collection<T> values = map.values();
//        return (List<T>) values;
        //正确的
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for(T t:values){
            list.add(t);
        }
        return list;
    }

    //删除指定id对象
    public void delete(String id){
        map.remove(id);
    }
}
