import java.util.Scanner;

public class VGeraSeq {
    /*
     * Gerador da sequência dada por:
         * F(1) = 1
         * F(2) = 2
         * F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
     */
    public static int sequencia(int n){
        
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else{
            return 2 * sequencia(n - 1) + 3* sequencia(n - 2);
        }
    }

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor de n: ");
    int n = sc.nextInt();

    int resultado = sequencia(n);
    System.out.println("F(" + n + ") = " + resultado);
    }

}
