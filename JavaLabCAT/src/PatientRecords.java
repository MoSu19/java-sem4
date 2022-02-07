//import java.util.Scanner;
import java.io.*;
import java.lang.Object;

public class PatientRecords implements Serializable
{
    String Name;
    int age;
    String Address;
    String Contactnumber;
    String bloodgroup;
    Boolean CovidTest;

    PatientRecords( String Name,int age,String Address,String Contactnumber,String
            bloodgroup,Boolean CovidTest)
    {
        this.Name=Name;
        this.age=age;
        this.Address=Address;
        this.Contactnumber=Contactnumber;
        this.bloodgroup=bloodgroup;
        this.CovidTest=CovidTest;
    }
    public static void main(String arg[])
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");
        //Scanner sc = new Scanner(System.in);

        int n=10;   //sample value
        PatientRecords[] obj = new PatientRecords[n];
        //test case
        obj[0]=new PatientRecords("Mohit",32,"Vellore","1234567890","A+ve",false);
        obj[1]=new PatientRecords("John",21,"Delhi","2220567890","B+ve",true);
        obj[2]=new PatientRecords("Jane",63,"Chennai","2140565120","O+ve",true);
        obj[3]=new PatientRecords("Sarah",45,"Kolkata","9190567890","B-ve",false);
        obj[4]=new PatientRecords("Jack",29,"Delhi","8880567890","A+ve",true);
        obj[5]=new PatientRecords("John",50,"Delhi","7770567890","O-ve",true);



        try
        {
            FileOutputStream out = new FileOutputStream("record.txt");
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
        System.out.println("List of Covid +ve Patients:");
        try
        {
            FileInputStream in = new FileInputStream("record.txt");
            ObjectInputStream objin = new ObjectInputStream(in);
            PatientRecords inp;
            Object ob;
            for(int i=0;i<n;i++)
            {
                ob = objin.readObject();
                inp=(PatientRecords) ob;

                if(inp.CovidTest)
                {
                    System.out.print("\nName:"+inp.Name+"\nAge:"+inp.age
                                    +"\nBlood Group:"+inp.bloodgroup+"\nAddress:"+inp.Address
                                    +"\nContact:"+inp.Contactnumber+"\nCovid:"+inp.CovidTest+"\n-------\n");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}