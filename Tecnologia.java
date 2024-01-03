import java.util.Scanner;

public class Tecnologia extends Producto {

    private String utilidad;
    private String tipo;

    public Tecnologia(String nombre, double precio, String codigo, int cantidad, String marca, String utilidad, String tipo) {
        super(nombre, precio, codigo, cantidad, marca);
        this.utilidad = utilidad;
        this.tipo = tipo;
    }

    public Tecnologia(String utilidad, String tipo) {
        this.utilidad = utilidad;
        this.tipo = tipo;
    }

    public Tecnologia() {
    }

    @Override
    public void ingresarProducto() {
        super.ingresarProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la utilidad que le va a dar a la tecnologia adquirida");
        this.utilidad = sc.next();
        System.out.println("Ingrese el tipo de la tecnologia");
        this.tipo = sc.next();
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Utilidad: " + utilidad + ", Tipo: " + tipo;
    }
}
