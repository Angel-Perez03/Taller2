import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Restaurante {
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<ProductoMenu> menuBase;
    private ArrayList<Pedido> pedidos;
    private Pedido pedidoEncurso;

    public Restaurante() {
        pedidos = new ArrayList<>();

    }

    public void iniciarPedido(String nombreCliente, String direccionCliente) {
        Scanner sc = new Scanner(System.in);
        Pedido p;
        System.out.println("Nombre de Cliente");
        String nC = sc.nextLine();
        System.out.println("Direccion de Cliente");
        String dC = sc.nextLine();
        p = new Pedido(nC,dC);
        pedidos.add(p);

    }
    public void cerrarYGuardarPedido(){
    pedidos.add(pedidoEncurso);

    }

    public Pedido getPedidoEncurso(){
        return pedidoEncurso;
    }

    public ArrayList<ProductoMenu> getMenuBase() {
        return menuBase;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    private void cargarIngredientes(){}

}

