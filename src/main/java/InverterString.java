public class InverterString implements Embaralhador{
    @Override
    public String embaralhar(String palavra) {

        //return new StringBuilder(palavra).reverse().toString(); maneira alternativa
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        return palavraInvertida;
    }
}
