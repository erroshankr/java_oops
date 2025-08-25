package learning.java.variables;

public class VariableMain {

    public static void main(String[] args) {
        Employee e1 = new Employee();
      //  System.out.println(e1.name + " & " + e1.empID);
      //  System.out.println(e1.getName() + " & " + e1.getEmpID());
        e1.setName("Atul");
        e1.setName("Roshan");
        e1.setGrade("A");
        e1.setCompName("CTS");
        e1.setManager(false);
        e1.setSalary(1000);
        e1.setEmpID(1001);
        System.out.println(e1.getName() + " & " + e1.getEmpID() + " & " + e1.getGrade() + " & "
                             + e1.getSalary() + " & " + e1.isManager());
    }
}
