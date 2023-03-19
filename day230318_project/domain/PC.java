package day230318_project.domain;

public class PC implements Equipment{

    private String model;   //  机器类型
    private String display; //显示器类型

    public PC(){
        super();
    }

    public PC(String model,String display){
        super();
        this.model=model;
        this.display=display;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model+"("+display+")";
    }
}
