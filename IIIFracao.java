import java.util.Scanner;

public class IIIFracao {
    /*
     * Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
     */

    public static double calcula(int n){
        if(n == 1){
            return 1.0;
        }

        return (1.0/n) + calcula(n - 1);
    }

    public static void ImprimirSoma(int n){
        if(n == 1){
            System.out.println(n);
        }else{
            ImprimirSoma(n-1);
            System.out.println("+ 1/"+ n);
       }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de n: ");
        int n = sc.nextInt();

        System.out.println("Soma: ");
        ImprimirSoma(n);
        
        System.out.println();

        double resultado = calcula(n);
        System.out.println("Soma até 1/"+ n + " = "+ resultado);
    }
}
