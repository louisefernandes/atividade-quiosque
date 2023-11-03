public class Aluno {
    private String nome;
    private String matricula;
    private float credito;

    public Aluno(String nome, String matricula, float credito){
        this.nome = nome;
        this.matricula = matricula;
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public boolean debitarCredito(float preco){
        if(preco > this.credito){
            return false;
        }
        this.credito = this.credito - preco;
        return true;
    }

}
