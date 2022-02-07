import java.time.LocalTime;

class TimeException extends Exception
{
    public TimeException(String s)
    {
        super(s);
    }
}

public class ClockApp
{

    public static void main(String arg[])
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        String timeofDay;
        String s1="Morning, Have Fresh Vegetable Juice and then Sugar Tablet with mild walking";
        String s2="its Day Time, after lunch have tablet to avoid sleep";
        String s3="Hello, Good Evening have dinner";
        String s4="Night, Go for sleep";

        LocalTime now = LocalTime.now();
        LocalTime time5 = LocalTime.parse("05:00:00");
        LocalTime time12 = LocalTime.parse("12:00:00");
        LocalTime time17 = LocalTime.parse("17:00:00");
        LocalTime time18 = LocalTime.parse("18:30:00");

        int val5 = now.compareTo(time5);
        int val12 = now.compareTo(time12);
        int val17 = now.compareTo(time17);
        int val18 = now.compareTo(time18);

        if(val5>=0 && val12<0)
        {
            timeofDay=s1;
            System.exit(0);
        }
        try
        {
            if(val12>=0 && val17<0)
                throw new TimeException(s2);
        }
        catch (TimeException e)
        {
            System.out.println(e);
        }
        if(val17>=0 && val18<0)
            timeofDay=s3;
        else
            timeofDay=s4;

        System.out.print("\nTime: "+now+"\n"+timeofDay);

    }
}
