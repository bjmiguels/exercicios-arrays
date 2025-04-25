public class Exercicio04 {
    public static void main ( String [] args ){
        /*Faça um programa que encontre o
        segundo maior número em um array de inteiros.
         */

        int [] numbers = { 5, -11, 0, 8, -7, 6, 25, 2};

        int major = Integer.MIN_VALUE;
        int secondMajor = Integer.MIN_VALUE;

        for ( int i = 0; i < numbers.length; i++ ) {
            int actual = numbers [i];

            if ( actual > major ){
                secondMajor = major;
                major = actual;
            } else if ( actual > secondMajor && actual < major ){
                secondMajor = actual;
            }
            //System.out.println abaixo serve para ver como está funcionando o código,
            //caso queira verificar, só retirar as "//".

            //System.out.println("Número: " + actual + " | Maior: " + major + " | Segundo maior: " + secondMajor);
        }

        System.out.println("O segundo número maior é: " + major);


    }
}
