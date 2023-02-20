import java.util.ArrayList;

public class Combo implements Producto {
    private double descuento;
    private String nombre;

    private ArrayList<Producto> itemsCombo;

    public Combo(double descuento, String nombre) {
        this.descuento = descuento;
        this.nombre = nombre;
        this.itemsCombo= new ArrayList<Producto>();
    }
    public void agregarItemACombo(Producto itemCombo){
        itemsCombo.add(itemCombo);
    }
    public int getPrecio(){
        int precioTotal = 0;
        for (int i =0;i<itemsCombo.size();i++){
            precioTotal=precioTotal+itemsCombo.get(i).getPrecio();
        }
        return precioTotal;
    }
    public String generarTextoFactura(){
        return nombre+"    "+getPrecio();
    }
    public String getNombre(){
        return nombre;
    }
}
