public class Exercicio02 {
    public static void main (String [] args ){
        /*Utilizando a linguagem Java, faça um programa que
percorre um vetor de números inteiros já cadastrados no
sistema. O programa deverá apresentar ao usuário qual
o maior número e qual o menor número armazenados
no vetor.*/

        int [] numbers = { 5, -11, 0, 8, -7, 6, 25, 2};

        int major = numbers [0];
        int minor = numbers [0];

        for ( int number : numbers ) {
            if (number > major ){
                major = number;
            } if (number < minor ) {
                minor = number;

            }
        }

        System.out.println("O número maior é: " + major);
        System.out.println("O número menor é: " + minor);


    }
}
