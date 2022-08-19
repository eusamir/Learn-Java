import java.util.Scanner;

public class TestaVariaveis {
    public static void main(String[] args){
        System.out.println("========PROVA DO SAMIR========");
        Scanner s = new Scanner(System.in);
        String resposta;
        Boolean repondeu_correto = false;
        do {
            System.out.println("Devemos inicializar com letras maiúsculas as variáveis? (y) (n)");
            resposta = s.next();
            switch (resposta){
                case "y":
                    System.out.println("Negativo!");
                    break;
                case "n":
                    repondeu_correto = true;
                    System.out.println("Correto, as variáveis tem que inicializar com o nome minúsculo por questões de convenção da comunidade");
                    break;
                default:
                    System.out.println("Comando não reconhecido");
            }
        }while (!repondeu_correto);

        System.out.println("Você acabou a prova");
    }
}
