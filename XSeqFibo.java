public class XSeqFibo {
    /*
     *  Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência
      fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
         * fibg(f0, f1, 0) = f0
         * fibg(f0, f1, 1) = f1
         * fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1.
     */

    public static int fibg(int f0, int f1, int n) {
        if (n == 0) return f0;
        if (n == 1) return f1;
        return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
    }

    
    public static void imprimirSeq(int f0, int f1, int n, int atual) {
        if (atual >= n) return; 
        System.out.print(fibg(f0, f1, atual) + " ");
        imprimirSeq(f0, f1, n, atual + 1); 
    }

    public static void main(String[] args) {
        int f0 = 0;  
        int f1 = 1;  
        int termos = 10; 

        System.out.print("Sequência de Fibonacci generalizada: ");
        imprimirSeq(f0, f1, termos, 0);
        System.out.println();
    }
}
