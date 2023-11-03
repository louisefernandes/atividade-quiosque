public class Identificado implements QuiosqueState {
    private Quiosque quiosque;

    public Identificado(Quiosque quiosque){
        this.quiosque = quiosque;
    }

    @Override
    public String proximoState() {
        this.quiosque.setState(new Processando(quiosque));
        return "Processando...";
    }

}

