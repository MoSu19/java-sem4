import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Rainfall {
    static Queue<Double> rain =new LinkedList<Double>();

    public static void main(String[] arg)
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        rain.add(10.2);
        rain.add(11.9);
        rain.add(8.0);
        rain.add(11.2);
        rain.add(10.8);
        rain.add(6.9);
        rain.add(8.2);
        rain.add(11.5);
        rain.add(10.4);
        rain.add(8.7);
        rain.add(7.8);
        rain.add(7.5);

        double x=0;
        int count=0;

        for(double i:rain)
            x+=i;
        x/=12;
        for (double i:rain)
            if (i>x)
                count++;
        System.out.println("\nAverage Rainfall: "+x+
                "\nNo of months with rainfall greater than avg: "+count);

    }
}
