import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {


    public String retornarPalavra() throws IOException {

        BufferedReader leitor = new BufferedReader(new FileReader("src/main/resources/palavras.txt"));
        String lerLinhas = leitor.readLine();
        List<String> palavras = new ArrayList<>();
        while(lerLinhas != null){
            palavras.add(lerLinhas);
            lerLinhas = leitor.readLine();
        }
        leitor.close();

        Random rand = new Random();
        int randomIndex = rand.nextInt(palavras.size());
        String palavraAleatoria = palavras.get(randomIndex);
        return palavraAleatoria;
    }
}
