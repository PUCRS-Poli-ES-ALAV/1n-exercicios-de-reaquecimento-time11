public class VIIVetor{

/*
 * A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos
do vetor.
 */

 public static int somaRecursao(int vetor[], int indice){
    if(indice == vetor.length){
        return 0;
    }

    return vetor[indice] + somaRecursao(vetor, indice + 1);
 }

 public static int produtoRecursao(int vetor[], int indice){
    if(indice == vetor.length){
        return 1;
    }

    return vetor[indice] * produtoRecursao(vetor, indice + 1);    
 }

 public static void main(String [] args){
    int vetor[] = {1,2,3};

    int resultSoma = somaRecursao(vetor, 0);
    int resultProduto = produtoRecursao(vetor, 0);
    System.out.println("Valor da soma: "+resultSoma);
    System.out.println("Valor do produto: "+resultProduto);

 }
}