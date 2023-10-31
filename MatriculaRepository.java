import java.util.HashSet;
import java.util.Set;

public class MatriculaRepository {
    private Set<String> matriculas;

    public MatriculaRepository() {
        matriculas = new HashSet<>();
    }

    public void adicionarMatricula(String matricula) {
        matriculas.add(matricula);
    }

    public boolean validarMatricula(String matricula) {
        return matriculas.contains(matricula);
    }

    public void removerMatricula(String matricula) {
        matriculas.remove(matricula);
    }
}

