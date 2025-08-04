import java.util.Scanner;

public class IVInverteString {
    /*
     * Inverter uma String  
     */

     public static String inverte(String inverte){
        if(inverte.isEmpty()){
            return " ";
        }

        return inverte.charAt(inverte.length() - 1 ) + inverte(inverte.substring(0, inverte.length() - 1));
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();

        String invertida = inverte(entrada);

        System.out.println("String invertida: " + invertida);
     }
}
