import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new FabricaMecanicaDoJogo();
        FabricaEmbaralhadores fabricaEmbaralhadores;

        System.out.println("-------JOGO DAS PALAVRAS EMBARALHADAS-------");
        System.out.println("Iniciar jogo?");
        String iniciarJogo = scanner.nextLine();

        if (iniciarJogo.toLowerCase().equals("sim") || iniciarJogo.toLowerCase().equals("s")){
           System.out.println("Deseja jogar o Modo Fácil ou Morte Súbita? " + "(Digite 1 para Modo Fácil, 2 para Morte " + "Súbita)");
           int opcao = scanner.nextInt();
           switch (opcao) {
               case 1:
                    modoFacil();
               case 2:
                    morteSubita();

           }
        } else {
            System.out.println("Encerrando o jogo...");
            System.out.println("Jogo encerrado!");
            System.exit(0);
        }
    }

    public static void modoFacil(){
        // TODO
    }

    public static void morteSubita(){
        // TODO
    }

}
