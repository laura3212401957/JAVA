import java.io.*;
public class Prog7 {
    public static void main(String args[])
    {
        int n,s;
        n=0;
        s=1;
        while(n<10)
        {
            n++;
            s=s*n;
            System.out.println(" "+n+" "+s);
        }
    }
}