package day230318_project.domain;

import day230318_project.service.Status;

public class Programmer extends Employee{

    private int memberId;   //开发团队的id
    private Status status=Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getTeamBaseDetails(){
        return memberId+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
    }

    @Override
    public String toString(){
        return getDetails()+"\t程序员\t"+status+"\t\t\t"+equipment.getDescription();
    }

    // 2/6      任志强     22      6800.0      程序员
    public String getDetailsForTeam(){
        return getTeamBaseDetails()+"\t程序员";
    }
}
