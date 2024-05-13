import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        int n = gerador.nextInt(1000);
        Scanner adivinhador = new Scanner(System.in);
        String mensagem = """
                Bem vindo ao jogo de adivinhação!
                Acerte o número que estou pensando de 0 a 1000
                Dica: Utilize pesquisa binaria para acertar de forma mais rapida!
                """;
        var adivinha = 0;
        System.out.println(mensagem);

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