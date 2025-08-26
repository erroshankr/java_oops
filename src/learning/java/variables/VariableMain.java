package learning.java.variables;

// Object Hash
// Object Memory
public class VariableMain {

    public static void main(String[] args) {
        Employee e1 = new Employee(); // object creation + initialization
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

        Employee e2 = new Employee();
        e2.setName("Roshan");
        e2.setGrade("A");
        e2.setCompName("CTS");
        e2.setManager(false);
        e2.setSalary(1000);
        e2.setEmpID(1001);
        // new keyword creates a new memory location
        System.out.println(e2.getName());
        System.out.println(e1.getName());
        System.out.println(e1);
        System.out.println(e2); // package_name.class_name@ObjectHashId

        Employee e3 = e1;
        System.out.println(e3);
        System.out.println(e3.getName());

        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
    }
}
