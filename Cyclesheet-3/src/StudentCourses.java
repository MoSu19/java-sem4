import java.util.*;

public class StudentCourses {

    static HashMap<String, ArrayList<String>> n= new HashMap<>();
    static HashMap<String,Integer> m = new HashMap<>();

    public static void main(String arg[])
    {
        System.out.print("\nMohit Suhasaria\t19BCE2167\n\n");

        Scanner sc = new Scanner(System.in);
        int c;
        String target;

        n.put("A", new ArrayList<String>(Arrays.asList("Python","Maths","C")));
        n.put("B", new ArrayList<String>(Arrays.asList("C","C++")));
        n.put("C", new ArrayList<String>(Arrays.asList("C++","Physics","Chemistry")));

        m.put("Python", 111);
        m.put("Maths", 222);
        m.put("C", 333);
        m.put("C++", 444);
        m.put("Physics", 555);
        m.put("Chemistry", 666);
        m.put("Digital Electronics", 777);


        while (true) {

            System.out.println("\nEnter 1.Display all 2.Remove 3.Show Faculty\n");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    for (Map.Entry<String, ArrayList<String>> e : n.entrySet()) {
                        String key = e.getKey();
                        List<String> values = e.getValue();
                        System.out.println(key+" = "+values);
                    }
                    System.out.println(m);
                    break;
                case 2:
                    sc.nextLine();
                    target = sc.nextLine();
                    n.remove(target);
                    break;
                case 3:
                    sc.nextLine();
                    target = sc.nextLine();
                    List<String> values = n.get(target);
                    for(String x:values)
                    {
                        System.out.println(x+" = "+m.get(x));
                    }
                default:
                    System.exit(-1);

            }
        }
    }

}
