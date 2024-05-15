import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
    Random random = new Random();
    List<String> palavras = new ArrayList<>();

    public BancoDePalavras() throws IOException {
        lerPalavras();
    }

    public void lerPalavras() throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader("src/main/resources/palavras.txt"));
        String lerLinhas = leitor.readLine();
        while(lerLinhas != null){
            palavras.add(lerLinhas);
            lerLinhas = leitor.readLine();
        }
        leitor.close();
    }

    public String retornarPalavra() {
        int indiceAleatorio = random.nextInt(palavras.size());
        return palavras.get(indiceAleatorio);
    }
}
