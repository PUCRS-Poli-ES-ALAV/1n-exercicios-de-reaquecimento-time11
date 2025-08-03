import java.util.Scanner;

public class IISomaIncrementos {
    /*
     * Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
     */

    //utilizando o b de contador 
    public static int somar(int a, int b){
        if(b == 0){
            return a;
        }

        return somar(++a, --b);

    }

    public static void ImprimirSoma(int a, int b){
        if(b == 0){
            System.out.println(a);
        }else{
            System.out.println(a + " + ");
            ImprimirSoma(++a, --b);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de a: ");
        int a = sc.nextInt();

        System.out.println("Informe o valor de b: ");
        int b = sc.nextInt();

        System.out.println(a+ " + " + b + " = ");
        ImprimirSoma(a,b);

        int resultado = somar(a, b);
        System.out.println("="+resultado);
    }

}
