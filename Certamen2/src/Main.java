import java.util.ArrayList;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Libro> arrLibros = new ArrayList<Libro>();
        Biblioteca libros = new Biblioteca();

        libros.agregarLibro(arrLibros);
        libros.imprimirDatos(arrLibros);

        System.out.println("Ingrese la id de libro que desea buscar:");
        int code = sc.nextInt();
        Libro libroAencontrar = libros.encontrarLibro(arrLibros, code);
        if(libroAencontrar!=null){
            System.out.println("El libro encontrado es:");
            libroAencontrar.imprimirDatos();
        }
    }
}