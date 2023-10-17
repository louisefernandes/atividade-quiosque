public class EmEspera implements QuiosqueState {
    private Quiosque quiosque;

    public EmEspera(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    public void identificarAluno(String matricula) {
        
        if (matriculaValida(matricula)) {
           
            quiosque.setState(new Identificado(quiosque));
        } else {
            System.out.println("Matrícula inválida. Por favor, insira uma matrícula válida.");
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
        // Verifica a validade da matrícula
        // Implemente sua lógica de validação aqui
        return true;
    }
}
