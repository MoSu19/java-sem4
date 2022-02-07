import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.io.*;
import java.lang.Object;

public class Donor implements Serializable
{
    String Name;
    int age;
    String Address;
    long Contactnumber;
    String bloodgroup;
    LocalDate dol;

    Donor( String Name,int age,String Address,long Contactnumber,String bloodgroup,LocalDate dol)
    {
        this.Name=Name;
        this.age=age;
        this.Address=Address;
        this.Contactnumber=Contactnumber;
        this.bloodgroup=bloodgroup;
        this.dol=dol;
    }

    public static void main(String arg[])
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");
        Scanner sc = new Scanner(System.in);
        long monthsBetween;
        int n=1;
        Donor[] obj = new Donor[n];

        obj[0]=new Donor("Mohit",32,"Vellore",1234567890,"A+ve",LocalDate.parse("2020-06-11"));

        try
        {
            FileOutputStream out = new FileOutputStream("donor_list.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);

            for(int i=0;i<n;i++)
                objout.writeObject(obj[i]);
            objout.close();
            out.close();

            System.out.println("Objects were written successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }



        try
        {
            FileInputStream in = new FileInputStream("donor_list.txt");
            ObjectInputStream objin = new ObjectInputStream(in);

            Donor inp;
            Object ob;
            for(int i=0;i<n;i++)
            {
                ob = objin.readObject();
                inp=(Donor) ob;
                monthsBetween = ChronoUnit.MONTHS.between(
                        inp.dol.withDayOfMonth(1),
                        LocalDate.now().withDayOfMonth(1));
                if(monthsBetween>6 && inp.bloodgroup.equals("A+ve") && inp.Address.equals("Vellore"))
                {
                    System.out.print("\nName:"+inp.Name+"\nAge:"+inp.age
                            +"\nBlood Group:"+inp.bloodgroup+"\nAddress:"+inp.Address
                            +"\nContact:"+inp.Contactnumber+"\nDoL:"+inp.dol);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
