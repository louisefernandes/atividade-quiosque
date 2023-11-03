public class Identificado implements QuiosqueState {
    private Quiosque quiosque;

    public Identificado(Quiosque quiosque){
        this.quiosque = quiosque;
    }

    @Override
    public String proximoState() {
        if(this.quiosque.getCurso().adicionarAluno(this.quiosque.getAluno().getMatricula())){
            this.quiosque.setState(new Processando(quiosque));
            return "Processando...";
        }
        this.quiosque.setState(new EmEspera(quiosque));
        return "Curso Escolhido Esgotado";
    }

    public String toString(){
        return "Estado Atual: IDENTIFICADO";
    }

}

