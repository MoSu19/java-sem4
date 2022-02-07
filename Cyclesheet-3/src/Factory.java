import java.io.*;
import java.util.*;

public class Factory implements Serializable {
    String pid;
    int weight;
    int diameter;
    int length;

    Factory(String pid,int weight,int diameter,int length)
    {
        this.pid=pid;
        this.weight=weight;
        this.diameter=diameter;
        this.length=length;
    }

    static Set<String> pass = new HashSet<>();
    static Set<String> fail = new HashSet<>();

    public static void main(String[] args)
    {

        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        Factory obj[]=new Factory[20];

        for (int i=0;i<20;i++)
            obj[i]=new Factory("P00"+i,100+(i%2),3,10);
        try{
            FileOutputStream out = new FileOutputStream("qa.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            System.out.println("Sending data to QA Dept...");
            for (int i=0;i<20;i++)
                objout.writeObject(obj[i]);
            objout.close();
            out.close();
            System.out.println("Sent Successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try {
            FileInputStream in = new FileInputStream("qa.txt");
            ObjectInputStream objin = new ObjectInputStream(in);
            Object ob;
            Factory fp;
            for (int i=0;i<20;i++)
            {
                ob = objin.readObject();
                fp=(Factory) ob;
                if(fp.length==10 && fp.diameter==3 && fp.weight==100)
                    pass.add(fp.pid);
                else
                    fail.add(fp.pid);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Products passed QA: ");
        for(String i:pass)
            System.out.println(i);
        System.out.println("\nProducts failed QA: ");
        for(String i:fail)
            System.out.println(i);
    }
}
