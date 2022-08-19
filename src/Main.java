public class Main {
    public static void main(String[] args) {
        Questao q1 = new Questao("Devemos inicializar com letras maiúsculas as variáveis? (y) (n)", "y");
        Questao q2 = new Questao("Podemos inicializar as variáveis com números? (y) (n)", "y");
        q1.showEnunciado();
        q2.showEnunciado();

        GerenciadorQuestoes g = new GerenciadorQuestoes();
        g.perguntarQuestaoAteAcertar(q1);
    }
}
