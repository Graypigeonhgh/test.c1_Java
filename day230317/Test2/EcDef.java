package day230317.Test2;
/**
 * @description:    自定义异常类
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/17 20:57
 */

public class EcDef extends Exception{

    static final long serialVersionUID = -7034897145766939L;
    //创建构造器
    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}
