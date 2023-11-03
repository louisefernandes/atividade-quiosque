import java.util.List;

public class Curso {
    private String nome;
    private float preco;
    private List<String> matriculados;

    public Curso(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public boolean adicionarAluno(String matriculaString){
        if (matriculados.size()<10) {
            this.matriculados.add(matriculaString);
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public List<String> getMatriculados() {
        return matriculados;
    }
}
