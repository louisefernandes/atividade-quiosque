public class Processando implements QuiosqueState {
    private Quiosque quiosque;
    private String minicursoSelecionado;

    public Processando(Quiosque quiosque, String minicurso) {
        this.quiosque = quiosque;
        this.minicursoSelecionado = minicurso;
    }

    public void identificarAluno(String matricula) {
        System.out.println("Você já está identificado como aluno.");
    }

    public void escolherMinicurso(String minicurso) {
        System.out.println("Você já escolheu o minicurso: " + minicursoSelecionado);
    }

    public void informarCartao(String cartao) {
        // Lógica para informar o cartão e obter autorização
        // Se for aprovado, avança para o estado Inscrito
        quiosque.setState(new Inscrito(quiosque, minicursoSelecionado));
        System.out.println("Cartão de crédito autorizado.");
    }

    public void finalizar() {
        // Ação não permitida no estado Processando
        System.out.println("Aguarde a autorização do cartão de crédito antes de finalizar.");
    }
}
