import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public Biblioteca(){
        this.libros=null;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public void agregarLibro(ArrayList<Libro> arrLibros){
        Académico libroAcad = new Académico("Calculo","Pedro Pascal", 20990, 1234, 2001);
        Novela novela = new Novela("La Iliada", "Fernando", 15990, 2222, "historica");
        Texto texto = new Texto("Vocabulario", "Maria", 10990, 1111, "Derecho");

        arrLibros.add(libroAcad);
        arrLibros.add(novela);
        arrLibros.add(texto);
    }
    public void imprimirDatos(ArrayList <Libro> arrLibros){
        for(Libro libro : arrLibros){
            System.out.println("Titulo: "+libro.getTitulo());
            System.out.println("Autor: "+libro.getAutor());
            System.out.println("Precio:"+libro.getPrecio());
            System.out.println("ID:"+libro.getId());
            libro.imprimirTipo();
            System.out.println();

        }

    }

    public Libro encontrarLibro(ArrayList<Libro> listLibros, int code){
        for(Libro lib : listLibros){
            if(lib.getId() == code){
                return lib;
            }

        }
        return null;
    }
}
