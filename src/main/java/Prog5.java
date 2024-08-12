import java.io.*;
public class Prog5 
{
    public static void main(String args[])
    {
        int n,s;
        n=0;
        s=0;
        do
        {
            n++;
            s=n*n;
            System.out.println(" "+n+" "+s);
        }while(n<1000);
    }
}
