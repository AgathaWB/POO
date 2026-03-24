import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private int edicao;
    private String ano;
    private String editora;
    private List<String> autores = new ArrayList<>();
    private String qtdAcervo;

    public Livro(int edicao, String titulo, String editora, String qtdAcervo, String ano, List<String> autores) {
        this.edicao = edicao;
        this.titulo = titulo;
        this.editora = editora;
        this.qtdAcervo = qtdAcervo;
        this.ano = ano;
        this.autores = autores;
    }

    public Livro() {

    }  
    
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    } 

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }


    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 

    public String getQtdAcervo() {
        return qtdAcervo;
    }
    public void setQtdAcervo(String qtdAcervo) {
        this.qtdAcervo = qtdAcervo;
    }
}
