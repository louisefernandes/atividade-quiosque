public class Processando implements QuiosqueState {
    private Quiosque quiosque;

    public Processando(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public String proximoState() {
        Aluno aluno = this.quiosque.getAluno();
        Curso curso = this.quiosque.getCurso();
        if (aluno.debitarCredito(curso.getPreco())) {
            this.quiosque.setState(new Inscrito(quiosque));
            return "Aluno Inscrito com Sucesso";
        }
        this.quiosque.setState(new EmEspera(quiosque));
        return "Cartão de Crédito Negado"; 
    }

}
