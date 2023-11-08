import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 80;
        Scanner adivinhador = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de adivinhação!");
        System.out.println("Acerte o número que estou pensando de 0 a 100");
        var adivinha = 0;

        while (adivinha != n){
            adivinha = adivinhador.nextInt();
            if (adivinha > n){
                System.out.println("Muito alto!");
            } else if (adivinha < n) {
                System.out.println("Muito baixo");
            } else {
                System.out.println("Você acertou!");
            }
        }
    }
}