public class Finalizado implements QuiosqueState {
    private Quiosque quiosque;

    public Finalizado(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    public String proximoState(){
        this.quiosque.setState(new EmEspera(quiosque));
        return "Finalizado.";
    }

    public String toString(){
        return "Estado Atual: FINALIZADO";
    }
}

