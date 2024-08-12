import java.io.*;
public class Prog24 
{
    public static void main (String args[])
    {
        int a,b,c;
        a=0;b=0;c=0;
        for(a=4;a<7;a++)
        {
        for(b=1;b<=10;b++)
        {
        c=a*b;
            System.out.println(" "+a+"*"+b+"="+c);
        }
        c=0;
        }
    }
}
