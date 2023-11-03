public class EmEspera implements QuiosqueState {
    private Quiosque quiosque;

    public EmEspera(Quiosque quiosque) {
        this.quiosque = quiosque;
    }
    
    @Override
    public String proximoState(){
        this.quiosque.setState(new Identificado(quiosque));
        return "Aluno Identificado.";
    }
}

