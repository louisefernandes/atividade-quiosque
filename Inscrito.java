public class Inscrito implements QuiosqueState {
    private Quiosque quiosque;
    private String minicursoSelecionado;

    public Inscrito(Quiosque quiosque, String minicurso) {
        this.quiosque = quiosque;
        this.minicursoSelecionado = minicurso;
    }

    public void identificarAluno(String matricula) {
        System.out.println("Você já está inscrito no minicurso " + minicursoSelecionado);
    }

    public void escolherMinicurso(String minicurso) {
        System.out.println("Você já está inscrito no minicurso " + minicursoSelecionado);
    }

    public void informarCartao(String cartao) {
        System.out.println("Você já informou o cartão de crédito.");
    }

    public void finalizar() {
        System.out.println("Gerando ticket para o minicurso " + minicursoSelecionado);
        quiosque.setState(new Finalizado(quiosque));
    }

    public QuiosqueState getState() {
        
        return this;
    }
}
