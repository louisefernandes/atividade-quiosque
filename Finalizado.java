public class Finalizado implements QuiosqueState {
    private Quiosque quiosque;

    public Finalizado(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    public void identificarAluno(String matricula) {
        System.out.println("A operação já foi finalizada.");
    }

    public void escolherMinicurso(String minicurso) {
        System.out.println("A operação já foi finalizada.");
    }

    public void informarCartao(String cartao) {
        System.out.println("A operação já foi finalizada.");
    }

    public void finalizar() {
        System.out.println("A operação já foi finalizada. Obrigado!");
    }
}

