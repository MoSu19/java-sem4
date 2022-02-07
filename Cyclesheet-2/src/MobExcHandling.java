import java.util.NoSuchElementException;
import java.util.Scanner;

public class MobExcHandling {
    public static void main(String arg[])
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");
        String num,reg;
        Scanner s=new Scanner(System.in);
        num=s.nextLine();
        reg=s.nextLine();

        if(num.length()!=10 || reg.length()!=9)
            throw (new IllegalArgumentException("Invalid"));
        try {
            Integer.parseInt(num);
        }
        catch(NumberFormatException e)
        {
            System.out.print("Invalid");
            throw(e) ;
        }
        for(int i=0;i<9;i++)
        {
            if(!Character.isLetterOrDigit(reg.charAt(i)))
                throw(new NoSuchElementException("Invalid"));
        }
        System.out.print("Valid");
    }
}
