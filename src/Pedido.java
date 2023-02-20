import java.util.ArrayList;

public class Pedido {
    private int numeroPedidos;
    private int idPedido;
    private String nombreCliente;
    private String direccionCliente;
    private ArrayList<Producto> itemsPedido;

    public Pedido(String nombreCliente, String direccionCliente) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void agregarProducto(Producto itemPedido) {
        itemsPedido.add(itemPedido);
    }

    private int getPrecioNetoPedido() {
        int Precio = 0;
        for (int i = 0; i < itemsPedido.size(); i++) {
            Precio = Precio + itemsPedido.get(i).getPrecio();
        }
        return Precio;
    }
    private int getPrecioIvaPedido() {
        int iva = Integer.parseInt(String.valueOf(getPrecioNetoPedido()*.19));
        return iva;
    }
    private int getPrecioTotalPedido() {
        int Total = getPrecioNetoPedido() + getPrecioIvaPedido();
        return Total;
    }
    private String GenerarTextoFactura(){
        return "El pedido de "+ nombreCliente + "a la dirección "+ direccionCliente+ " tuvo un valor de: "+ getPrecioTotalPedido()+ " el cual fue un valor de"+ getPrecioNetoPedido()+" sobre el pedido, y un valor de iva el cual fue:" + getPrecioIvaPedido();
    }
}
