
package logica;

public class Libro {
    //atributos
        int codigoISBN;
        String Titulo;
        String Autor;
        String Genero;
        int numPaginas;
        //metodos
        //contrcturores

    public Libro() {
    }

    public Libro(int codigoISBN, String Titulo, String Autor, String Genero, int numPaginas) {
        this.codigoISBN = this.codigoISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Genero = Genero;
        this.numPaginas = numPaginas;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigoISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Genero=" + Genero + ", numPaginas=" + numPaginas + '}';
    }

    
    
  
    
}