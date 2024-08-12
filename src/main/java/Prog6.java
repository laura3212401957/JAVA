import java.io.*;
public class Prog6 {
    public static void main(String args[])
    {
        int n,s;
        n=0;
        s=0;
        for(n=1,s=1;n<=1000;n++,s++)
        {
            s=n*n;
            System.out.println(" "+n+" "+s);
        }
    }
}