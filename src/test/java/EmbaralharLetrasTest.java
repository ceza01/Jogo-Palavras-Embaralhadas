import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmbaralharLetrasTest {

    private final EmbaralharLetras embaralhador = new EmbaralharLetras();

    @Test
    void testComprimentoPalavraEmbaralhada() { //verifica se o comprimento da palavra embaralhada é igual ao da palavra normal
        String palavra = "teste";
        String resultado = embaralhador.embaralhar(palavra);
        Assertions.assertEquals(palavra.length(), resultado.length());
    }
}
