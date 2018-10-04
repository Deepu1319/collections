interface Accessable
{
    void access();
}

class Adminn
{
    private String name="Admin";

    public Adminn(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Record implements Accessable
{
    Adminn admin;

    public Record(Adminn admin) {
        this.admin = admin;
    }

    @Override
    public void access()
    {
        System.out.println("You are Admin, you can access the record.");
    }
}
class Proxy extends Record
{

    public Proxy(Adminn admin) {
        super(admin);
    }

    @Override
    public void access() {
        if(admin.getName().equals("Admin"))
        {
            System.out.println("Allowed");
            super.access();
        }
        else
        {
            System.out.println("Not allowed to access");
        }
    }
}
public class ProxyQ8
{
    public static void main(String[] args)
    {
        System.out.print("When we enter as Admin : ");
        Adminn abc=new Adminn("Admin");
        Record record=new Proxy(abc);
        record.access();

        System.out.println();
        System.out.print("When we enter as others : ");
        Adminn abc1=new Adminn("others");
        Record record1=new Proxy(abc1);
        record1.access();
    }
}
