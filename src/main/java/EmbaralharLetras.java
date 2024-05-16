import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralharLetras implements Embaralhador{
    @Override
    public String embaralhar(String palavra) {
        List<Character> letras = new ArrayList<>();
        for (char c : palavra.toCharArray()){
            letras.add(c);
        }
        Collections.shuffle(letras);

        StringBuilder palavraEmbaralhada = new StringBuilder();
        for (char c : letras) {
            palavraEmbaralhada.append(c);
        }

        return palavraEmbaralhada.toString();
    }
}
