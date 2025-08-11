import java.util.Scanner;

public class VISeqAckerman {
    /*
    Gerador de Sequência de Ackerman:
         * A(m, n) = n + 1, se m = 0
         * A(m, n) = A(m − 1, 1), se m != 0 e n = 0
         * A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
    */

    public static int seqAckerman(int m, int n){
        if(m == 0){
            return n +1;
        }else if(m != 0 && n == 0){
            return seqAckerman(m - 1, 1);
        }else {
            return seqAckerman(m - 1, seqAckerman(m, n - 1));
        }
    }


    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de m: ");
        int m = scanner.nextInt();
        System.out.println("Informe o valor de n: ");
        int n = scanner.nextInt();

        int resultado = seqAckerman(m, n);
        System.out.println("Sequencia de Ackerman: "+resultado);
    }
}
