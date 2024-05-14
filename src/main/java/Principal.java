import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        try {
            System.out.println(bancoDePalavras.retornarPalavra());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
