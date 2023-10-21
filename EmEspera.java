public class EmEspera implements QuiosqueState {
    private Quiosque quiosque;

    public EmEspera(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    public void identificarAluno(String matricula) {
        if (matriculaValida(matricula)) {
            quiosque.setState(new Identificado(quiosque, matricula));
            System.out.println("Aluno identificado com sucesso.");
        } else {
            System.out.println("Matrícula inválida. Por favor, insira uma matrícula válida com 3 dígitos.");
        }
    }

    public void escolherMinicurso(String minicurso) {
        System.out.println("Por favor, identifique-se primeiro.");
    }

    public void informarCartao(String cartao) {
        System.out.println("Por favor, identifique-se e escolha um minicurso antes de informar o cartão.");
    }

    public void finalizar() {
        System.out.println("Por favor, identifique-se e escolha um minicurso antes de finalizar a operação.");
    }

    private boolean matriculaValida(String matricula) {
        if (matricula.length() == 3 && matricula.matches("\\d+")) {
            return true;
        }
        return false;
    }

    public QuiosqueState getState() {
        
        return this;
    }
}

