import java.util.Scanner;

public class Exercicio08 {
    public static void main ( String [] args ){
        /*Pergunte ao usuário um número e
        verifique se ele está presente no array.
        */
        Scanner scanner = new Scanner(System.in);

        int [] numbers = { 5, -11, 0, 8, -7, 6, 25, 2, 5};
        int equalNumbers = 0;

        System.out.println("Digite o número que quer procurar na array: ");
        int userNumber = scanner.nextInt();

        for ( int number : numbers ) {
            if (number == userNumber) {
                equalNumbers++;
            }


        }

        if( equalNumbers > 1 ) {
            System.out.printf("A array possuí %d números %s.", equalNumbers, userNumber);
        }else if ( equalNumbers == 1 ){
            System.out.printf("A array possuí %d número %s.", equalNumbers, userNumber);
        }else
            System.out.println("Array não possuí nenhum número " + userNumber);
    }
}
