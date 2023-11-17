import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int precio;
    private int id;
    Scanner leer = new Scanner(System.in);

    public Libro(String titulo, String autor, int precio, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.id = id;
    }
    public Libro(){
        this.titulo = " ";
        this.autor = " ";
        this.precio = 0;
        this.id = 0;
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

    public int getPrecio() {
        return precio;
    }

    public void setId(int id){ this.id = id;}

    public int getId(){ return id; }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void imprimirTipo(){
        System.out.println("General");
    }
    public void imprimirDatos(){
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Precio:"+getPrecio());
        System.out.println("ID:"+getId());
    }

}
