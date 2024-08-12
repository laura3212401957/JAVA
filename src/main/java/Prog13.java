import java.io.*;
public class Prog13 
{
    public static void main(String args[])
    {
    int x,y,z;
    x=4;
    y=0;
    z=0;
    do
        {
            y=y+1;
            z=x*y;
            System.out.println(" "+x+" "+y+" "+z);
        }while(y<10);
    }
}
