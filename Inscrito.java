import java.util.Random;

public class Inscrito implements QuiosqueState {
    private Quiosque quiosque;

    public Inscrito(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    public String proximoState(){
        this.quiosque.setState(new Finalizado(quiosque));
        Random random = new Random();
        String ticket = this.quiosque.getAluno().getMatricula() + random.nextInt(300);
        return "Seu ticket é : " + ticket;
    }
}
