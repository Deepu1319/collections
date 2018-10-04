public class Q5Employee implements Cloneable {
    private int id;
    private String name;
    private Double salary;
    private String designation;

    Q5Employee(int empId, String empName, Double empSalary, String empDesignation)
    {
        this.id = empId;
        this.name = empName;
        this.salary = empSalary;
        this.designation = empDesignation;
    }

    Q5Employee(Q5Employee emp)
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
        Q5Employee employeeOne = new Q5Employee(1, "Divya", 15000.5, "JVM");
        Q5Employee employeeTwo = new Q5Employee(employeeOne);
        System.out.println(employeeOne.id+" "+employeeOne.name + " "+" "+employeeOne.designation +" "+ employeeOne.designation);
        System.out.println("Data from copy constructor");
        System.out.println(employeeTwo.id+" "+employeeTwo.name + " "+" "+employeeTwo.designation +" "+ employeeTwo.designation);

        try
        {
            Q5Employee employeeThree = new Q5Employee(2, "Vaishnavi", 12000.56, "JVM");
            Q5Employee employeeFour = (Q5Employee)employeeThree.clone();
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
