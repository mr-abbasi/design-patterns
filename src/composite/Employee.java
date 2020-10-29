package composite;

import java.util.*;

/**
 * @author Mohammad.Abbasi
 * @created 29/10/2020
 */
abstract class Employee {
    protected int id;
    protected String name;
    protected String position;

    public Employee(){}

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    abstract void showDetails();
}

class Developer extends Employee {

    public Developer() {
    }

    public Developer(int id, String name, String position) {
        super(id,name,position);
    }

    @Override
    public void showDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class Manager extends Employee{

    private List<Employee> employees = new ArrayList<>();

    public Manager() {}

    public Manager(int id, String name, String position) {
        super(id,name,position);
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public void removeEmployee(Employee emp){
        employees.remove(emp);
    }

    public Employee getEmployee(int index){
       return employees.get(index);
    }

    @Override
    public void showDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String employeesString = "";
        for (Employee emp:employees){
            employeesString+=emp.toString();
            employeesString+="\n";
        }

        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +"\n"+
                "employees=\n" +
                   employeesString +
                '}';
    }
}
