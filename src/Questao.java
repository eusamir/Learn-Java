public class Questao {

    private String enunciado;
    public String resposta;

    public Questao(String enunciado, String resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public void showEnunciado() {
        System.out.println(this.enunciado);
    }

}
