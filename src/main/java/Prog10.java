import java.io.*;
public class Prog10 
{
    public static void main(String args[])
    {
        int x,y;
        x=0;
        y=0;
        do
        {
            y=(x*x*x)+(x*x)-5;
            System.out.println(" "+x+" "+y);
            x=x+1;
        }while(x<=10);
    }
}
