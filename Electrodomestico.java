import java.util.Scanner;

public class Electrodomestico extends Producto {
    private int vidaUtilanios;
    private String sitioFabricacion;
    private double voltiosAlimentacion;
    private String garantia;

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad, String marca, int vidaUtilanios, String sitioFabricacion, double voltiosAlimentacion, String garantia) {

        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilanios = vidaUtilanios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltiosAlimentacion = voltiosAlimentacion;
        this.garantia = garantia;
    }

    public Electrodomestico() {
    }

    public double intervaloMantenimiento() {
        return vidaUtilanios / 5.0;
    }

    @Override
    public void ingresarProducto() {
        super.ingresarProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la vida util del electrodomestico");
        this.vidaUtilanios = sc.nextInt();
        System.out.println("Ingrese el sitio de fabricacion del electrodomestico");
        this.sitioFabricacion = sc.next();
        System.out.println("Ingrese los voltios del electrodomestico");
        this.voltiosAlimentacion = sc.nextDouble();
        System.out.println("Ingrese la garantia del electrodomestico");
        this.garantia = sc.next();
    }

    @Override
    public String toString() {
        return super.toString() + ", Vida Útil: " + vidaUtilanios + ", Sitio de Fabricación: " + sitioFabricacion
                + ", Voltios de Alimentación: " + voltiosAlimentacion + ", Garantía: " + garantia;
    }
}