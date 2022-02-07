import java.util.HashMap;
import java.util.Map;

public class Library {
    String name;
    String author;
    int no_of_copies;

    Library(String name,String author,int no_of_copies)
    {
        this.name=name;
        this.author=author;
        this.no_of_copies=no_of_copies;
    }

    static HashMap<Library,Integer> n = new HashMap();

    static int search(String name)
    {
        for(Map.Entry<Library,Integer> e:n.entrySet())
        {
            Library obj= e.getKey();
            int i=e.getValue();
            if(obj.name.equals(name))
            {
                return i;
            }
        }
        return 0;
    }

    static void sort(int rack)
    {
        for(Map.Entry<Library,Integer> e:n.entrySet())
        {
            Library obj= e.getKey();
            int i=e.getValue();
            if(i==rack)
                System.out.println(obj.name);
        }
    }

    public static void main(String[] args)
    {
        Library obj[]=new Library[12];
        for (int i=0;i<12;i++)
            obj[i]=new Library("xyz"+i,"abc"+i,i+1);
        for (int i=0;i<12;i++)
            n.put(obj[i],(i/5)+1);
        System.out.println("Rack no for xyz7: "+search("xyz7"));
        System.out.println("Books in rack 1: ");
        sort(1);
    }
}
