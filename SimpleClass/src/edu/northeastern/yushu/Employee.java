package edu.northeastern.yushu;

public class Employee {
    private String name;
    private int employeeID;
    private String SSN;
    private int level;
    private Department dept;

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id){
        this.employeeID=id;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public Employee( Employee employee){
        Employee emp = new Employee();
        this.name = employee.name;
        this.employeeID = employee.employeeID;
        this.dept = new Department("Sample Dept", 1);
    }

    public Employee(String name, int employeeID, String SSN, int level){
        this.name = name;
        this.employeeID = employeeID;
        this.SSN = SSN;
        this.level = level;
    }
    public Employee(){
        this.name = "Default Name";
        this.employeeID = -1;
        this.SSN = "ABCD";
        this.level = 67;
        this.dept=null;
    }
    public void printEmployeeInfo(){
        System.out.println("************");
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.employeeID);
    }
}
