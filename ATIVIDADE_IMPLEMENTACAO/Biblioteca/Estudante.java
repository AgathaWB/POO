public class Estudante {
    private Pessoa pessoa;
    private int numMatricula;
    private String curso;
    

    private int anoIngresso;
    
    public Estudante(Pessoa pessoa, int numMatricula, String curso, int anoIngresso) {
        this.pessoa = pessoa;
        this.numMatricula = numMatricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    public Estudante() {
        
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public int getNumMatricula() {
        return numMatricula;
    }
    
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getAnoIngresso() {
        return anoIngresso;
    }
    
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}