public class Identificado implements QuiosqueState {
    private Quiosque quiosque;

    public Identificado(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    public void identificarAluno(String matricula) {
        System.out.println("Você já está identificado como aluno.");
    }

    public void escolherMinicurso(String minicurso) {
        // Lógica para escolher o minicurso
        // Avança para o estado Processando
        quiosque.setState(new Processando(quiosque, minicurso));
    }

    public void informarCartao(String cartao) {
        System.out.println("Por favor, escolha um minicurso antes de informar o cartão.");
    }

    public void finalizar() {
        System.out.println("Por favor, escolha um minicurso antes de finalizar a operação.");
    }
}

