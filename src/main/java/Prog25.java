import java.io.*;
public class Prog25 
{
    public static void main (String args[])throws IOException
    {
        int n,r;
        n=0;r=0;
        String valor;
        BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));
        valor=Entrada.readLine();
        n=Integer.parseInt(valor);
        r=n%2;
        if(r==0)
            System.out.println("El numero es Par");
        else
            System.out.println("El numero es Impar");
    }
}    
