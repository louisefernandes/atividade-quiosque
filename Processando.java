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
        if (minicursoSelecionado != null) {
            quiosque.setState(new Inscrito(quiosque, minicursoSelecionado));
            System.out.println("Cartão de crédito autorizado.");
        } else {
            System.out.println("Por favor, escolha um minicurso antes de informar o cartão.");
        }
    }

    public void finalizar() {
        System.out.println("Aguarde a autorização do cartão de crédito antes de finalizar.");
    }

    public QuiosqueState getState() {
        return this;
    }
}
