import java.util.ArrayList;
import java.util.Date;

class InsufficientLeaves extends Exception{
    public InsufficientLeaves(String s)
    {
        super(s);
    }
}

class NoLeaves extends Exception{
    public NoLeaves(String s)
    {
        super(s);
    }
}
public class LeaveRequest {


    static ArrayList<LeaveRequest> list = new ArrayList<>();

    String name;
    int age;
    Date doj;
    int leavebal;

    LeaveRequest(String name,int age,Date doj)
    {
        this.name=name;
        this.age=age;
        this.doj=doj;
        Date now = new Date(System.currentTimeMillis());
        if(now.getYear()-doj.getYear()>=10)
            this.leavebal=12;
        else
            this.leavebal=10;
    }

    public static void main(String arg[])
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        LeaveRequest obj[]=new LeaveRequest[5];

        obj[0]=new LeaveRequest("John",27,new Date());
        obj[1]=new LeaveRequest("Jane",37,new Date());
        obj[2]=new LeaveRequest("Jack",29,new Date());
        obj[3]=new LeaveRequest("Jim",45,new Date());
        obj[4]=new LeaveRequest("Joe",33,new Date());

        for (int i=0;i<5;i++)
            list.add(obj[i]);

        applyLeave(obj,"John",2);
        applyLeave(obj,"Mohit",4);

    }

    static void applyLeave(LeaveRequest obj[],String name,int days)
    {
        int flag=0,found=0;
        for (int i=0;i<5;i++)
        {
            if(obj[i].name.equals(name))
            {
                found++;
                try{
                    if(obj[i].leavebal==0)
                    {
                        flag++;
                        throw new NoLeaves("No Leaves Available");
                    }
                }
                catch (NoLeaves e)
                {
                    System.out.println(e);
                }

                try{
                    if(obj[i].leavebal<days)
                    {
                        flag++;
                        throw new InsufficientLeaves("No Leaves Available");
                    }
                }
                catch (InsufficientLeaves e)
                {
                    System.out.println(e);
                }
                if(flag==0 && days<4)
                {
                    obj[i].leavebal-=days;
                    System.out.println("Leave Approved");
                    list.set(i,obj[i]);
                }

                else if(days>3)
                    System.out.println("Maximum 3 Leaves allowed");
            }
        }
        if(found==0)
            System.out.println("Not Found");
    }
}
