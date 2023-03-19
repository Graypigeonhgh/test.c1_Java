package day230318_project.service;

/**
 * @description:自定义异常类
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @version:
 * @date:2023年3月19日12:18:58
 **/
public class TeamException extends Exception{
    static final long serialVersionUID = -338751692229948L;

    public TeamException(){
        super();
    }

    public TeamException(String msg){
        super(msg);
    }
}
