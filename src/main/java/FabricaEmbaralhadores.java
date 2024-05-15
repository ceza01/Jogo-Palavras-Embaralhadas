import java.util.Random;

public class FabricaEmbaralhadores {

    public static final Random RANDOM = new Random();

    public static Embaralhador getEmbaralhadorAleatorio(){
        int escolha = RANDOM.nextInt(2);

        switch(escolha){
            case 0:
                return new InverterString();
            case 1:
                return new EmbaralharLetras();
            default:
                throw new IllegalStateException("Embaralhador não encontrado");
        }
    }
}
