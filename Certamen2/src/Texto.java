public class Texto extends Libro{
    private String escuela;

    public Texto(String titulo, String autor, int precio, int id, String escuela) {
        super(titulo, autor, precio, id);
        this.escuela = escuela;
    }

    public Texto(String escuela) {
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    /*public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Escuela:"+ getEscuela());
    }
    public void imprimirTipo(){
        System.out.println("Tipo de libro: Texto PUCV");
    }*/
}
