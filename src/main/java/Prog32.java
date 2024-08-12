import java.io.*;
public class Prog32 {
    public static void main (String args[])throws IOException
    {
        int n,m;
        n=0; m=3;
        String valor;
        BufferedReader Entrada=(new BufferedReader(System.in));
        System.out.print("Digite un valor  ");
        valor=Entrada.readLine();
        n=Integer.parseInt(valor);
        if(n<=3)
        {
            while(m<=n)
            {
                System.out.println(m);
                m=m+3;    
            }
            else
            System.out.println("ERROR Valor Invalido");
        }
    }
}
                
