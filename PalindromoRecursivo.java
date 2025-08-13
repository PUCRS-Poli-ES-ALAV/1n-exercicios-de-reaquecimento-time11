public class PalindromoRecursivo {

    public static boolean ehPalindromo(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();

        // Caso base
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }


        return ehPalindromo(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String palavra = "arara";
        System.out.println(palavra + " é palíndromo? " + ehPalindromo(palavra));

        palavra = "banana";
        System.out.println(palavra + " é palíndromo? " + ehPalindromo(palavra));
    }
}
