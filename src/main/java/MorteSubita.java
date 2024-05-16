public class MorteSubita implements MecanicaDoJogo{
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private int vidas;
    private int pontuacao;
    private String palavraAtual;
    private boolean jogoAcabou;

    @Override
    public void jogar() {

    }

    @Override
    public boolean jogoAcabou() {
        return false;
    }

    @Override
    public boolean verificarAcerto(String palavra) {
        return false;
    }

    @Override
    public String getPalavraEmbaralhada() {
        return null;
    }

    @Override
    public void proximaPalavra() {

    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public int getVidas() {
        return vidas;
    }
}
