package learning.java.constructors;

// constructor : used to create & initialize object with default value
/*
constructor returns the object of the class
name of constructor must be exactly same as the name of class
 */
public class Employee {

    String name;
    int empID;
    double salary;
    boolean isManager;
    String grade;
    String compName;  //

   /* public Employee(){ // zero parameter/argument constructor
        name = "Atul";
        empID = 2000;
        salary = 2500;
        isManager = true;
        grade = "A";
        compName="CTS";
    }*/

  /*  public Employee(){

    }*/

    public Employee(String name, int empID){

    }

    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isManager() {
        return isManager;
    }

    public String getGrade() {
        return grade;
    }

    public String getCompName() {
        return compName;
    }
}
