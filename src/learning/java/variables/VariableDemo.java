package learning.java.variables;

// 'package' keyword is always written in lower case
// package : list of related java files ==> always written in lower case
// class : 'class' keyword always written in lower case
// ClassName: always starts with UpperCase and follows CamelCasing
// public : access-specifier => decides access level for this class, always in lower case
public class VariableDemo {

// class contains 2 things => variables & methods
/*
 variables : 2 types ==> instance(class level) variable, local variable.
 variable name always starts with lower case and follows camelCasing.
 INSTANCE VARIABLE: variables defined inside class but outside method
 LOCAL VARIABLE : variables defined inside method of the class==> always needs to be initialized for use

 DECLARATION:
 (access-specifier) data_type variableName = value
 data types in Java : int(0), string(null), double(0.0), long(0L), char(null)=> unicode value of null, short0(), boolean(false) ,byte(0)
 int rollNumber = 10;

 */

    int employeeID = 100;   // instance variable ==> scope: within entire class ==> takes default value if not initialized
    long mobileNum;

    // access-specifier returnType methodName(parameter1, parameter2.....)
    public void printDetails(){
        String name = "Atul Mishra"; // local variable ==> scope: withing method only
        int salary = 100;
        System.out.println("Employee name is: " + name);
        System.out.println("Employee salary is: " + salary);
        System.out.println("Employee ID is: " + employeeID);
    }

    public static void main(String[] args) {  // void : it will not return anything
      // ClassName objectName = new ClassName();// syntax for object creation
           VariableDemo e1 = new VariableDemo(); // 'new' keyword creates a new object everytime ==> acts as remote control of a class
           e1.printDetails(); // java uses dot operator to access any method/variable. objectName.methodName
           System.out.println(e1.employeeID); // objectName.variableName
      // System.out.println(e1.salary); // wrong bcoz salary is local variable
           System.out.println(e1.mobileNum);
    }
}
