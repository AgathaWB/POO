public class Professor {
    private String departamento;
    private Pessoa pessoa;
    
    public Professor(String departamento, Pessoa pessoa) {
        this.departamento = departamento;
        this.pessoa = pessoa;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
