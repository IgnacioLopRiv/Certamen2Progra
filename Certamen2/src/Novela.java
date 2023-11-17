public class Novela extends Libro{
    private String tipo;

    public Novela(String titulo, String autor, int precio, int id, String tipo) {
        super(titulo, autor, precio, id);
        this.tipo = tipo;
    }

    public Novela(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void imprimirTipo(){
        System.out.println("Tipo de libro: Novela");
    }
}
