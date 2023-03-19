package day230318_project.service;
/**
 * @description:    表示员工的状态
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @date:    2023/3/18 15:03
 **/
public class Status {

    private final String NAME;
    private Status(String name){
        this.NAME=name;
    }
    public static final Status FREE=new Status("FREE");
    public static final Status BUSY=new Status("BUSY");
    public static final Status VOCATION=new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString(){
        return NAME;
    }
}
