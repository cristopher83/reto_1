
import java.util.Scanner;


public class main
{
    public static void main (String []args){
        int no1,no2,res=0;
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Captura operacion: ");
        nombre = sc.nextLine();

        if (nombre.equals("SUMA") | nombre.equals("RESTA") | nombre.equals("DIVISION") | nombre.equals("MULTIPLICACION"))
        {
            System.out.println("Operando 1: ");
            no1 = sc.nextInt();
            System.out.println("Operando 2: ");
            no2 = sc.nextInt();

            if (nombre.equals("SUMA"))
            {
                res=no1+no2;
            }
            if (nombre.equals("RESTA"))
            {
                res=no1-no2;
            }
            if (nombre.equals("MULTIPLICACION"))
            {
                res=no1*no2;
            }
            if (nombre.equals("DIVISION"))
            {
                res=no1/no2;
            }
            System.out.println(res);
        }
    }
}
