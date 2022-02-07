import java.util.Scanner;
import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Emp
{
    String id;
    String name;
    LocalDate dob;

    Emp(String a,String b,LocalDate c)
    {
        id=a;
        name=b;
        dob=c;
    }
}

class InvalidEmployeeCode extends Exception{
    public InvalidEmployeeCode(String s)
    {
        super(s);
    }
}

public class EmpExcHandling {

    public static void main(String args[]) {

        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        Scanner sc = new Scanner(System.in);

        String dob;
        String id;
        String name;
        String idformat = "^[1-9]{2}-[F|S]-[1-9]{3}";
        int flag=0;

        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.print("\nDoB: ");
        dob=sc.nextLine();
        System.out.print("\nID: ");
        id=sc.nextLine();

        LocalDate date = LocalDate.parse(dob);

        Pattern p = Pattern.compile(idformat);
        Matcher m = p.matcher(id);

        try
        {
            if(!m.find())
            {
                flag=1;
                throw new InvalidEmployeeCode("Invalid");
            }
        }
        catch (InvalidEmployeeCode e)
        {
            System.out.print(e.getMessage());
        }

        if(flag==0)
        {
            Emp obj = new Emp(id, name, date);
            System.out.print("\n-------\n\nName: " + obj.name);
            System.out.print("\nDoB: " + obj.dob);
            System.out.print("\nID: " + obj.id);
        }
    }
}
