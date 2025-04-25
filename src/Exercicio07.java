public class Exercicio07 {
    public static void main ( String [] args ){
        /*Calcule o produto (multiplicação)
        de todos os números positivos do array.
        */

        int multiply = 1;
        int [] numbers = { 5, -11, 0, 8, -7, 6, 25, 2};

        for ( int i = 0; i < numbers.length; i++){
            if ( numbers [i] > 0){
                multiply *= numbers[i];

            }

        }

        if ( multiply > 0 ){
            System.out.println("Média dos números da array ( sem negativos ) é: " + multiply);
        } else
            System.out.println("Array não possuí números positivos para fazer a média.");
    }
}
