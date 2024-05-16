import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------JOGO DAS PALAVRAS EMBARALHADAS-------");
        System.out.println("Iniciar jogo?");
        String iniciarJogo = scanner.nextLine();

        if (iniciarJogo.toLowerCase().equals("sim") || iniciarJogo.toLowerCase().equals("s")){
           System.out.println("Deseja jogar o Modo Com Vidas ou Morte Súbita? " + "(Digite 1 para Modo Fácil, 2 para Morte " + "Súbita)");
           int opcao = scanner.nextInt();
           switch (opcao) {
               case 1:
                    modoComVidas();
               case 2:
                    morteSubita();
           }
        } else {
            System.out.println("Encerrando o jogo...");
            System.out.println("Jogo encerrado!");
            System.exit(0);
        }
    }

    public static void modoComVidas(){
        Scanner scanner = new Scanner(System.in);
        MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo().getMecanicaDoJogo(1);
        while(!mecanicaDoJogo.jogoAcabou()) {
            mecanicaDoJogo.jogar();
            System.out.println("A palavra embaralhada é: " + mecanicaDoJogo.getPalavraEmbaralhada());
            System.out.println("Digite a sua tentativa: ");
            String palavra = scanner.nextLine();
            if (mecanicaDoJogo.verificarAcerto(palavra)) {
                System.out.println("Você acertou! Sua pontuação atual é: " + mecanicaDoJogo.getPontuacao());
            } else {
                System.out.println("Você errou! Tente novamente. Você ainda tem " + mecanicaDoJogo.getVidas() + " vidas.");
                if (mecanicaDoJogo.getVidas() == 0) {
                    System.out.println("Suas vidas acabaram. O jogo terminou. Sua pontuação final foi: " + mecanicaDoJogo.getPontuacao());
                    System.exit(1);
                }
            }
        }
        System.out.println("O jogo terminou. Sua pontuação final foi: " + mecanicaDoJogo.getPontuacao());
        scanner.close();
    }

    public static void morteSubita(){
        MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo().getMecanicaDoJogo(1);
    }

}
