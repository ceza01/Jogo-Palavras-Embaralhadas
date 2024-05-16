public interface MecanicaDoJogo {

    void jogar();
    boolean jogoAcabou();
    boolean verificarAcerto(String palavra);
    String getPalavraEmbaralhada();
    void proximaPalavra();
    int getPontuacao();
    int getVidas();
}
