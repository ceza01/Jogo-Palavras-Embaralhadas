import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        InverterString inverterString = new InverterString();
        EmbaralharLetras embaralharLetras = new EmbaralharLetras();

        String palavra = bancoDePalavras.retornarPalavra();
        System.out.println(palavra);
        System.out.println(inverterString.embaralhar(palavra));

    }


}
