package JavaPrograms;

public class SecondProgram {
    int managerId;
    String managerName;


    public void acceptData()
    {
        this.managerId = managerId;
        this.managerName = managerName;
        this.showData();
    }

    public void showData()
    {
        System.out.println("Manager is id : "+managerId);
        System.out.println("Manager is name : "+managerName);
    }
}
