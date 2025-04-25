public class Exercicio06 {
    public static void main ( String [] args ){
        /* Conte quantos números estão
        entre 10 e 50 em um array qualquer.
        */

        int counter = 0;
        int [] numbers = { 5, -11, 0, 8, -7, 6, 25, 2};

        for ( int i = 0; i < numbers.length; i++){
            if ( numbers [i] >= 10 && numbers [i] <= 50){
                counter++;
            }

        }
        if (counter > 1) {
            System.out.printf("A array possuí %d números entre 10 e 50.", counter);
            System.out.println();
        }else if (counter == 0) {
            System.out.println("A array não possuí nenhum número entre 10 e 50.");
        }else
            System.out.printf("A array possuí %d número entre 10 e 50.", counter);
            System.out.println();
    }
}
