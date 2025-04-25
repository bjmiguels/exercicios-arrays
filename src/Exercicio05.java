public class Exercicio05 {
    public static void main ( String [] args ){
        /*Calcule a média dos números de um array,
        ignorando os valores negativos.
         */
        int sum = 0;
        int counter = 0;
        int [] numbers = { 5, -11, 0, 8, -7, 6, 25, 2};

        for ( int i = 0; i < numbers.length; i++){
            if ( numbers [i] >= 0){
                sum += numbers[i];
                counter++;

            }

        }

        if ( counter > 0 ){
            float media = (float) sum / counter;
            System.out.println("Média dos números da array ( sem negativos ) é: " + media);
        } else
            System.out.println("Array não possuí números positivos para fazer a média.");
    }
}
