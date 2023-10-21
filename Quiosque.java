public class Quiosque {
    private QuiosqueState state;

    public Quiosque() {
        state = new EmEspera(this);
    }

    public void setState(QuiosqueState state) {
        this.state = state;
    }

    public void identificarAluno(String matricula) {
        state.identificarAluno(matricula);
    }

    public void escolherMinicurso(String minicurso) {
        state.escolherMinicurso(minicurso);
    }

    public void informarCartao(String cartao) {
        state.informarCartao(cartao);
    }

    public void finalizar() {
        state.finalizar();
    }
    
    
    public QuiosqueState getState() {
        return state;
    }
    
}

