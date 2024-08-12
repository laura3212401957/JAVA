import java.io.*;
public class Prog223 
{
    public static void main (String args[])
    {
        int a,b,c;
        for(a=4;a<7;a++) 
        {
            b=0;
            c=0;
                do
                {
                    b++;
                    c=a*b;
                    System.out.println(" "+a+"*"+b+"="+c);
                }while(b<10);
        }
    }
}
