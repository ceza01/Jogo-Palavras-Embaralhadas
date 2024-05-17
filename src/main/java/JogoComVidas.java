import java.io.IOException;

public class JogoComVidas implements MecanicaDoJogo{
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private int vidas = 3;
    private int pontuacao;
    private String palavraAtual;
    private boolean jogoAcabou;

    @Override
    public void jogar() {
        try {
            bancoDePalavras = new BancoDePalavras();
            palavraAtual = bancoDePalavras.retornarPalavra();
            embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
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
            if (pontuacao >=20){
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

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public int getVidas() {
        return vidas;
    }
}

