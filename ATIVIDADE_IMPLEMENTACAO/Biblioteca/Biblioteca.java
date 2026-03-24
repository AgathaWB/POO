import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nomeBiblioteca;
    private String endereco;
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome, String endereco, List<Livro> livros) {
        this.nomeBiblioteca = nome;
        this.endereco = endereco;
        this.livros = livros;
    }

    public Biblioteca() {

    }
    
    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    
    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }
    
    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }
}