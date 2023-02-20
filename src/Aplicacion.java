public class Aplicacion {
    private Restaurante restaurante;

    public static void main(String[] args) {
        new Restaurante();
        mostrarMenu();

    }

    public static void mostrarMenu() {
        System.out.println("\nOpciones de la aplicación\n");
        System.out.println("1. Cargar ingredientes");
        System.out.println("2. Cargar menu");
        System.out.println("3. Cargar Combos");
        System.out.println("4. Iniciar un pedido");
        System.out.println("5. Guardar el pedido");
        System.out.println("6. obtener el pedido en curso");
        System.out.println("7. obtener el menu");
        System.out.println("8. obtener los ingredientes");
        System.out.println("9. Salir de la aplicación\n");
    }

    public void ejecutarOpcion(int opcionSeleccionada) {

        boolean continuar = true;
        while (continuar) {
            try {
                mostrarMenu();
                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
                if (opcion_seleccionada == 1) {
                    System.out.println("Saliendo de la aplicación ...");
                    continuar = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe seleccionar uno de los números de las opciones.");
            }
        }
    }

    private String input(String porFavorSeleccioneUnaOpción) {
        return null;
    }
}



