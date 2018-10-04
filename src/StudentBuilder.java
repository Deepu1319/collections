class Student {

    private Integer rollno;
    private String name;
    private String address;
    private String course;
    private String dept;
    private boolean isOptedForScholarship;

    public Student(Builder1 builder1) {
        rollno = builder1.getRollno();
        name = builder1.getName();
        address=builder1.getAddress();
        course = builder1.getCourse();
        dept = builder1.getDept();
        isOptedForScholarship = builder1.isOptedForScholarship();
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isOptedForScholarship() {
        return isOptedForScholarship;
    }

    public void setOptedForScholarship(boolean optedForScholarship) {
        isOptedForScholarship = optedForScholarship;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollno'" + rollno + '\'' +
                ", name=" + name +
                ", address=" + address +
                ", course=" + course +
                ", dept=" + dept +
                ", isOptedForScholarship=" + isOptedForScholarship +
                '}';
    }
}
class Builder1 {
    private Integer rollno;
    private String name;
    private String address;
    private String course;
    private String dept;
    private boolean isOptedForScholarship;

    public Builder1(Integer rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public Builder1 setRollno(Integer rollno) {
        this.rollno = rollno;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder1 setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }


    public Builder1 withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public Builder1 hasCourse(String course) {
        this.course = course;
        return this;
    }

    public String getDept() {
        return dept;
    }

    public Builder1 inDept(String dept) {
        this.dept = dept;
        return this;
    }

    public boolean isOptedForScholarship() {
        return isOptedForScholarship;
    }

    public Builder1 hasOptedForScholarship(boolean optedForScholarship) {
        isOptedForScholarship = optedForScholarship;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}

       public class StudentBuilder {
        public static void main(String[] args) {
            Student student=new Builder1(12,"Divya")
                    .withAddress("Noida")
                    .hasCourse("MCA")
                    .inDept("Computer Science")
                    .hasOptedForScholarship(true)
                    .build();
            System.out.println(student);

        }


       }


