package learning.java.variables;

public class Employee {

    String name; // ==> initially it was null, setter changed its value to "Atul"
    int empID;
    double salary;
    boolean isManager;
    String grade;
    String compName;  // compName: CTS, grade : CTS-A

    //setter : write operation (data required while writing)
    public void setName(String x){
        name = x;
    }

    //getter : read operation (data required while fetching)
    public String getName(){
        return name;
    }

    public void setEmpID(int y){
        empID = y;
    }

    public int getEmpID(){
        return empID;
    }

    public void setSalary(double z){
        salary = z;
    }

    public double getSalary(){
        return salary;
    }

    public void setManager(boolean b){
        isManager = b;
    }

    public boolean isManager(){
        return isManager;
    }

    public void setGrade(String c){
        grade = c;
    }

    public String getGrade(){
        return compName + "-" +grade;
    }

    public void setCompName(String name){
        compName = name;
    }
}
