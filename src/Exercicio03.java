import java.util.Scanner;

public class Exercicio03 {
    public static void main ( String [] args){
        /*Utilizando a linguagem Java, faça um programa que
percorre um vetor de palavras (Strings) já cadastradas no
sistema. O programa deverá receber um nome digitado
pelo usuário e identificar se esse nome está ou não
presente no vetor.*/

        Scanner scanner = new Scanner(System.in);

        //Não está no exercício, só implementei uma forma do usuário colocar quantos
        //nomes quer na lista, e de digitar cada um deles antes de procurar por um nome em específico.
        System.out.println("Digite quandos nomes você quer na lista: ");
        int listQuantities = scanner.nextInt();
        scanner.nextLine();
        int i;

        String [] names = new String [listQuantities];

        for (i = 0; i < names.length; i++){
            System.out.printf("Digite o %dº nome que você quer na lista: ", i + 1 );
            names[i] = scanner.nextLine();
        }

        int quantity = 0;

        System.out.println( "Escreva o nome que quer procurar na lista: ");
        String nameSearching = scanner.nextLine().trim();

        //Compara o nome digitado pelo usuário com os nomes que estão na Array.
        for ( String name : names ){

            //Mostra o processo do programa de comparar o nome digitado
            // pelo usuário por cada nome que está na Array.
            System.out.println("Comparando: " + name + " com " + nameSearching);
            if (name.equalsIgnoreCase(nameSearching.trim())){
                quantity++; //Acrescenta a quantidade de nomes no final de cada loop.
            }
        }

        if ( quantity > 0 ){
            System.out.printf("A lista possuí esse nome %d vezes.", quantity);
            System.out.println();
        }else {
            System.out.println("A lista não possuí este nome nenhuma vez.");
            }

        scanner.close();

    }
}
