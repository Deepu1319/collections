public class Employee1 implements Cloneable {
    private int id;
    private String name;
    private Double salary;
    private String designation;

    Employee1(int empId, String empName, Double empSalary, String empDesignation)
    {
        this.id = empId;
        this.name = empName;
        this.salary = empSalary;
        this.designation = empDesignation;
    }

    Employee1(Employee1 emp)
    {
        this.id = emp.id;
        this.name = emp.name;
        this.salary = emp.salary;
        this.designation = emp.designation;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        Employee1 employeeOne = new Employee1(1, "Divya", 15000.5, "JVM");
        Employee1 employeeTwo = new Employee1(employeeOne);
        System.out.println(employeeOne.id+" "+employeeOne.name + " "+" "+employeeOne.designation +" "+ employeeOne.designation);
        System.out.println("Data from copy constructor");
        System.out.println(employeeTwo.id+" "+employeeTwo.name + " "+" "+employeeTwo.designation +" "+ employeeTwo.designation);

        try
        {
            Employee1 employeeThree = new Employee1(2, "Vaishnavi", 12000.56, "JVM");
            Employee1 employeeFour = (Employee1) employeeThree.clone();
            System.out.println(employeeThree.id+" "+employeeThree.name + " "+" "+employeeThree.designation +" "+ employeeThree.designation);
            System.out.println("Data from clonable interface");
            System.out.println(employeeFour.id+" "+employeeFour.name + " "+" "+employeeFour.designation +" "+ employeeFour.designation);
        }

        catch(CloneNotSupportedException cns)
        {
            System.out.println("Exception caught" +cns);

        }

    }

}
