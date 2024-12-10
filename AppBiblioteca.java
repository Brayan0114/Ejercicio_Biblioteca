import java.util.Scanner;
import clasesBiblioteca.*;

public class AppBiblioteca{
    private Libro libro;
    public static void main(String [] args) throws Exception{
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargarLibro();
        appBiblioteca.imprimir();
    }

    public void cargarLibro(){
        Scanner sc = new Scanner(System.in);
        libro = new Libro();
        System.out.println("Digite el codigo del libro");
        libro.setCodigo(sc.nextInt());
        //sc.nextline();
        System.out.println("Digite el nombre del libro");
        libro.setNombre(sc.nextLine());
        //sc.useDelimiter("\n");
        System.out.println("Digite el año de publicacion del libro");
        libro.setAñoPublicacion(sc.nextInt());
        System.out.println("Digite la edicion del libro");
        libro.setEdicion(sc.nextInt());
        Autor autor = new Autor();
        System.out.println("Digite el codigo del autor del libro");
        autor.setCodigo(sc.nextInt());
        System.out.println("Digite el nombre del autor del libro");
        autor.setNombre(sc.next());
        sc.nextLine();
        libro.setAutor(autor);
    }

    public void imprimir(){
        System.out.println(libro);

    }
}
