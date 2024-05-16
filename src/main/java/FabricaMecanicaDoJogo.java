import java.util.Random;

public class FabricaMecanicaDoJogo {

    public MecanicaDoJogo getMecanicaDoJogo(int escolha) {

        switch (escolha) {
            case 1:
                return new JogoComVidas();
            case 2:
                return new MorteSubita();
            default:
                throw new IllegalStateException("Embaralhador não encontrado");
        }
    }
}
