import java.util.Scanner;

public class ExercicioDesafio {
    public static void main ( String [] args ){
        /*Crie um programa que:
    Peça ao usuário para digitar a quantidade de dias que ele quer analisar.
    Peça ao usuário para informar a temperatura registrada em cada um desses dias.
    Após coletar os dados, o programa deve exibir:
    - A temperatura mais alta.
    - A temperatura mais baixa.
    - A temperatura média.
    Quantos dias tiveram temperaturas acima da média. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos dias você deseja analisar: ");
        int quantityDays = scanner.nextInt();
        double media = 0;
        int daysAboveMedia = 0;

        double [] temperature = new double [ quantityDays ];

        double higherTempeture = Double.MIN_VALUE;
        double lowerTempeture = Double.MAX_VALUE;

        for ( int i = 0; i < quantityDays; i++ ){
            System.out.printf("Digite a temperatura do dia %d", i+1);
            System.out.println();
            temperature [i] = scanner.nextDouble();
        }
        for ( int i = 0; i <quantityDays; i++){
            media += temperature[i];
        }
        media = media / quantityDays;
        System.out.println("A média de temperatura é: " + media);

        for ( double day : temperature ) {
            if (day > higherTempeture) {
                higherTempeture = day;
            }
            if (day < lowerTempeture) {
                lowerTempeture = day;
            }

        }
        System.out.println("A maior temperatura é: " + higherTempeture);
        System.out.println("A menor temperatura é: " + lowerTempeture);

        for (double day : temperature ){
            if ( day > media ){
                daysAboveMedia++;
            }
        }
        System.out.printf("Durante a semana houve %d dias com temperatura acima da média.", daysAboveMedia);
        System.out.println();

    }
}
