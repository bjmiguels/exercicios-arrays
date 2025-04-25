
public class Exercicio01 {
    public static void main(String[] args) {
        /*Utilizando a linguagem Java, faça um programa que
percorre um vetor de números inteiros já
cadastrados no sistema e verifica quantos números
são positivos, quantos números são negativos e
quantos números são nulos. Após varrer o vetor,
essas contagens devem ser apresentadas para o
usuário.*/

        int [] numbers = { 5, -11, 0, 8, -7, 6, 25, 2, 0, 0, -8, -7, 6, 10};

        int positives = 0;
        int negatives = 0;
        int nulls = 0;

        for ( int number : numbers ) {
            if (number > 0 ){
                positives++;
            } else if (number < 0 ) {
                negatives++;
            } else {
                nulls++;
            }
        }
        if (positives > 1 ) {
            System.out.printf("A array possuí %d números positivos. ", positives);
        } else System.out.printf("A array possuí %d número positivo. ", positives);
        System.out.println();

        if (negatives > 1 ) {
            System.out.printf("A array possuí %d números negativos. ", negatives);
        } else System.out.printf("A array possuí %d número negativo. ", negatives);
        System.out.println();

        if (nulls > 1 ) {
            System.out.printf("A array possuí %d números nulos. ", nulls);
        } else System.out.printf("A array possuí %d número nulo. ", nulls);

    }
}