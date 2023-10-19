public class Identificado implements QuiosqueState {
    private Quiosque quiosque;
    private String matricula;

    public Identificado(Quiosque quiosque, String matricula) {
        this.quiosque = quiosque;
        this.matricula = matricula;
    }

    public void identificarAluno(String matricula) {
        if (matriculaValida(matricula)) {
            this.matricula = matricula; 
            System.out.println("Você já está identificado como aluno.");
        } else {
            System.out.println("Matrícula inválida. A matrícula deve conter 3 dígitos numéricos.");
        }
    }

    public void escolherMinicurso(String minicurso) {
        if (matriculaValida(matricula)) {
            System.out.println("Minicurso " + minicurso + " escolhido.");
            quiosque.setState(new Processando(quiosque, minicurso));
        } else {
            System.out.println("Matrícula inválida. Não é possível escolher um minicurso.");
        }
    }

    public void informarCartao(String cartao) {
        System.out.println("Por favor, escolha um minicurso antes de informar o cartão.");
    }

    public void finalizar() {
        System.out.println("Por favor, escolha um minicurso antes de finalizar a operação.");
    }

    public QuiosqueState getState() {
        return this;
    }

    private boolean matriculaValida(String matricula) {
        if (matricula.length() == 3 && matricula.matches("\\d+")) {
            return true;
        }
        return false;
    }
}

