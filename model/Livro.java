package model;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private final boolean emprestado;

    public Livro(String titulo, String autor, String genero, int ano, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String livroInfo() {
        return String.format(
                "Livro: %s | Autor: %s | Gênero: %s | Ano de Publicação: %d | %s \n",
                getTitulo(),
                getAutor(),
                getGenero(),
                getAno(),
                emprestado ? "Emprestado" : "Disponível"
        );
    }

    public String listaCompleta() {
        return String.format(
                "Livro: %s | Autor: %s | Gênero: %s | Ano de Publicação: %d\n",
                getTitulo(),
                getAutor(),
                getGenero(),
                getAno()
        );
    }

    @Override
    public String toString() {
        return getTitulo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return titulo.equalsIgnoreCase(livro.titulo) && autor.equalsIgnoreCase(livro.autor);
    }

    @Override
    public int hashCode() {
        return (titulo.toLowerCase() +autor.toLowerCase()).hashCode();
    }
}