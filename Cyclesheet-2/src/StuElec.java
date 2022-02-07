import java.util.Random;

class elec extends Thread
{
    StuElec ob;

    elec(StuElec ob)
    {
        this.ob=ob;
    }

    public void run()
    {
        ob.counter();
    }
}


public class StuElec {
    int[] votes = new int[240];
    int[] count={0,0,0};
    static int n=0;

    void counter()
    {
        synchronized(this)
        {
            for(;n<240;n++)
                count[votes[n]-1]++;
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

        }
    }

    public static void main(String arg[])
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        StuElec obj = new StuElec();
        Random random = new Random();
        for(int i=0;i<240;i++)
            obj.votes[i]=random.nextInt(3)+1;

        elec t1 = new elec(obj);
        elec t2 = new elec(obj);
        elec t3 = new elec(obj);
        elec t4 = new elec(obj);

        t1.start();
        t2.start();
        t3.start();

        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        t4.start();
        System.out.print("\nVotes for A: "+t4.ob.count[0]+"\nVotes for B: "+t4.ob.count[1]
                +"\nVotes for C: "+t4.ob.count[2]);

        if(t4.ob.count[0]>t4.ob.count[1] && t4.ob.count[0]>t4.ob.count[2])
            System.out.println("\n\nPR is A");
        else if(t4.ob.count[1]>t4.ob.count[0] && t4.ob.count[1]>t4.ob.count[2])
            System.out.println("\n\nPR is B");
        else
            System.out.println("\n\nPR is C");
    }

}
