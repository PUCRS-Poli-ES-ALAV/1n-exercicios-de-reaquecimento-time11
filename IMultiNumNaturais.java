import java.util.Scanner;

public class IMultiNumNaturais{
/*
 * Multiplicação de dois números naturais, através de somas 
 * sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
 */

    public static int multiplicar(int a, int b){
        if(a == 0){
            return 0;
        }

        return b + multiplicar(a-1, b);
    }
    //a representa quantas vezes falta somar o b

    public static void ImprimirSoma(int a, int b){
        if(a == 1){
            System.out.println(b);
        }else{
            System.out.println(b + " + ");
            ImprimirSoma(a-1,b);
        }
    }


    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de a: ");
        int a = sc.nextInt();

        System.out.println("Informe o valor de b: ");
        int b = sc.nextInt();

        System.out.println(a + " * " + b + " = ");
        ImprimirSoma(a,b);
        int resultado = multiplicar(a, b);
        System.out.println("= "+ resultado);

    }

}