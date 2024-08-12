import java.io.*;
public class Prog8 {
    public static void main(String args[])
    {
        int n,s;
        n=0;
        s=1;
        do
        {
            n++;
            s=s*n;
            System.out.println(" "+n+" "+s);
        }while(n<10);
    }
}
