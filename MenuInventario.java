import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuInventario {
    private List<Producto> productos;

    public MenuInventario() {
        this.productos = new ArrayList<>();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar Alimento");
            System.out.println("2. Ingresar Tecnología");
            System.out.println("3. Ingresar Electrodoméstico");
            System.out.println("4. Ver todos los productos ingresados");
            System.out.println("5. Salir");
            System.out.print("Ingrese su elección: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Alimento alimento = new Alimento();
                    alimento.ingresarProducto();
                    productos.add(alimento);
                    break;
                case 2:
                    Tecnologia tecnologia = new Tecnologia();
                    tecnologia.ingresarProducto();
                    productos.add(tecnologia);
                    break;
                case 3:
                    Electrodomestico electrodomestico = new Electrodomestico();
                    electrodomestico.ingresarProducto();
                    productos.add(electrodomestico);
                    break;
                case 4:
                    System.out.println("Productos ingresados:");
                    for (Producto producto : productos) {
                        System.out.println(producto.toString());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}