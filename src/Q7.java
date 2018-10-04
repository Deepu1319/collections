import java.util.ArrayList;
import java.util.List;

interface Directory {
    void getDirectoryDetails();
}

class ITDeptEmp implements Directory {
    private String Name;
    private int EmpId;
    private String designation;

    public ITDeptEmp(String name, int empId, String designation) {
        Name = name;
        EmpId = empId;
        this.designation = designation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public void getDirectoryDetails() {
        System.out.println("IT Emp{" +
                "name='" + Name + '\'' +
                ", Designation='" + designation + '\'' + ", EmpID='" + EmpId + '\'' +
                '}');
    }
}

class MarketingDeptEmp implements Directory {
    private String Name;
    private int EmpId;
    private String designation;
    public MarketingDeptEmp(String name, int empId, String designation) {
        Name = name;
        EmpId = empId;
        this.designation = designation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public void getDirectoryDetails() {
        System.out.println("Marketing Emp{" +
                "name='" + Name + '\'' +
                ", Designation='" + designation + '\'' + ", EmpID='" + EmpId + '\'' +
                '}');
    }
}


class ITDeptDirectory implements Directory {
    List<Directory> itdeptDirectory = new ArrayList<>();

    @Override
    public void getDirectoryDetails() {
        System.out.println("IT dept directory");
        itdeptDirectory.forEach(e -> e.getDirectoryDetails());
    }
}

class MarketingDeptDirectory implements Directory {
    List<Directory> marketingdeptDirectory = new ArrayList<>();

    @Override
    public void getDirectoryDetails() {
        System.out.println("Marketing dept directory");
        marketingdeptDirectory.forEach(e -> e.getDirectoryDetails());
    }
}

class CompanyDirectory implements Directory {
    List<Directory> companydirectory = new ArrayList<>();

    @Override
    public void getDirectoryDetails() {
        System.out.println("Company directory");
        companydirectory.forEach(e -> e.getDirectoryDetails());
    }
}

public class Q7 {
    public static void main(String[] args) {
        ITDeptEmp ITemp1 = new ITDeptEmp("Divya", 101, "Java Developer");
        ITDeptEmp ITemp2 = new ITDeptEmp("Richa", 102, "Web Developer");
        ITDeptEmp ITemp3 = new ITDeptEmp("Shekhar", 103, "Python Developer");

        ITDeptDirectory itDeptDirectory = new ITDeptDirectory();
        itDeptDirectory.itdeptDirectory.add(ITemp1);
        itDeptDirectory.itdeptDirectory.add(ITemp2);
        itDeptDirectory.itdeptDirectory.add(ITemp3);

        MarketingDeptEmp MarketingEmp1 = new MarketingDeptEmp("Anurag", 2001, "Digital Marketing");
        MarketingDeptEmp MarketingEmp2 = new MarketingDeptEmp("Chetan", 2002, "Sales");
        MarketingDeptEmp MarketingEmp3 = new MarketingDeptEmp("Vaibhav", 2003, "Business Analyst");

        MarketingDeptDirectory marketingDeptDirectory = new MarketingDeptDirectory();
        marketingDeptDirectory.marketingdeptDirectory.add(MarketingEmp1);
        marketingDeptDirectory.marketingdeptDirectory.add(MarketingEmp2);
        marketingDeptDirectory.marketingdeptDirectory.add(MarketingEmp3);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companydirectory.add(itDeptDirectory);
        companyDirectory.companydirectory.add(marketingDeptDirectory);
        companyDirectory.getDirectoryDetails();
        itDeptDirectory.getDirectoryDetails();
        marketingDeptDirectory.getDirectoryDetails();
    }

}
