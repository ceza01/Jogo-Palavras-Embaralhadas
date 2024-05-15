import java.io.IOException;

public class JogoComVidas implements MecanicaDoJogo{
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private int vidas;
    private int pontuacao;
    private String palavraAtual;
    private boolean jogoAcabou;

    @Override
    public void jogar() {
        try {
            bancoDePalavras = new BancoDePalavras();
            embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
            vidas = 3;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean jogoAcabou() {
      return jogoAcabou;
    }

    @Override
    public boolean verificarAcerto(String palavra) {
        if (palavra.equals(palavraAtual)) {
            pontuacao++;
            if (pontuacao >=5){
                jogoAcabou = true;
            } else {
                proximaPalavra();
            }
            return true;
        } else {
            vidas--;
            if (vidas == 0) {
                jogoAcabou = true;
            }
            return false;
        }
    }

    public void proximaPalavra(){
        palavraAtual = bancoDePalavras.retornarPalavra();
    }

    @Override
    public String getPalavraEmbaralhada() {
        return embaralhador.embaralhar(palavraAtual);
    }
}
