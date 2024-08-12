import java.io.*;
public class Prog11 
{
    public static void main(String args[])
    {
        int x,y;
        x=0;
        y=0;
            for(x=0;x<=10;x++)
        {
            y=(x*x*x)+(x*x)-5;
            System.out.println(" "+x+" "+y);
        }
    }
}