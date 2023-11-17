import java.util.Date;

public class Académico extends Libro {
    private int fechaPublicacion;

    public Académico(String titulo, String autor, int precio, int id, int fechaPublicacion) {
        super(titulo, autor, precio, id);
        this.fechaPublicacion = fechaPublicacion;
    }

    public Académico() {
        super();
        this.fechaPublicacion = 0;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }


    public void imprimirTipo(){
        System.out.println("Tipo de libro: Academico");
    }

}