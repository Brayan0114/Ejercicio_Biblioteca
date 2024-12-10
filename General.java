package clasesBiblioteca;

public class General {
    private int codigo;
    private String nombre;


//constructor sin parametros
    public General(){

    }
//constructor con parametro
    public General(int cod, String nom){
        this.codigo = cod;
        this.nombre = nom;
    }

    public void setCodigo(int cod){
        this.codigo = cod;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public int getCodigo() {
        return codigo;
    }

    public String  getNombre() {
        return nombre;
    }

    public boolean validarDatos() {
        return true;
    }

    public String toString() {
        return "General {" + "codigo" + codigo + "Nombre" + 
        nombre +"}";
    }
}
