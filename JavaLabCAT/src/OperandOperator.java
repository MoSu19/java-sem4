import java.io.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class OperandOperator {
    public static void main(String[] args) throws IOException,ScriptException {

        int count1=0,count2=0;
        String expr=new String();

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        InputStream input = new FileInputStream("test.txt");
        DataInputStream inst = new DataInputStream(input);

        FileOutputStream file1 = new FileOutputStream("operand.txt");
        DataOutputStream data1 = new DataOutputStream(file1);
        FileOutputStream file2 = new FileOutputStream("operator.txt");
        DataOutputStream data2 = new DataOutputStream(file2);


        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            if(Character.isDigit(k))
            {
                expr=expr+k;
                count1++;
                data1.writeInt(k);
                data1.flush();
            }
            else if(k=='+'||k=='-'||k=='*'||k=='/')
            {
                expr=expr+k;
                count2++;
                data2.write(k);
                data2.flush();
            }


        }
        try{
        System.out.println(engine.eval(expr));}
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(count1);
        System.out.println(count2);
        data1.close();
        data2.close();
    }
}