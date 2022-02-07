import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DetailsNotFound extends Exception{
    public DetailsNotFound(String s) {
        super(s);
    }
}

public class Tourist{
    String name;
    String state;
    List<String> famous_spots;

    Tourist(String state, String name, List<String> famous_spots)
    {
        this.state=state;
        this.name=name;
        this.famous_spots=famous_spots;
    }

    public static void main(String[] arg)
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        Tourist obj[]=new Tourist[5];

        ArrayList<String> s = new ArrayList<String>(Arrays.asList("Karnataka","Andhra Pradesh","Telangana","Tamil Nadu","Kerala"));
        for(int i=0;i<5;i++)
        {
            obj[i]=new Tourist(s.get(i),"xyz",new ArrayList<String>(Arrays.asList("a","b","c")));
            System.out.println("\nState: "+obj[i].state+
                    "\nName: "+obj[i].name+
                    "\nFamous Spots: "+obj[i].famous_spots);
        }

        String target =  "x";
        int flag=0;
        try {
            for(int i=0;i<5;i++)
            {
               for (String k:obj[i].famous_spots)
                   if(k.equals(target))
                   {
                       System.out.println("\nState: "+obj[i].state+
                               "\nName: "+obj[i].name);
                       flag=1;
                       break;
                   }
            }
            if(flag==0)
            throw new DetailsNotFound("error");
        }
        catch (DetailsNotFound e)
        {
            System.out.println(e);
        }

    }
}
