public class IXCombinacoes {
    
    public static void combina(String prefixo, String str) {
        if (str.length() == 0) {
            System.out.println(prefixo);
        } else {
            for (int i = 0; i < str.length(); i++) {
                combina(prefixo + str.charAt(i), 
                        str.substring(0, i) + str.substring(i + 1));
            }
        }
    }


    public static String primeirasLetras(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append((char) ('A' + i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 3; 
        String entrada = primeirasLetras(n);
        System.out.println("Combinações de " + entrada + ":");
        combina("", entrada);
    }
}
