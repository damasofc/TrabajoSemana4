

package trabajosemana4;


public final class VideoGameItem extends BlockBusterItem {
    
    protected String nombreConsola;

    public VideoGameItem(String nombre, int codigo, int precioRenta, String nombreConsola) {
        super(nombre, codigo, precioRenta);
        this.nombreConsola = nombreConsola;
        this.precioRenta = 30;
    }
    
    @Override
    public String toString() {
        return super.toString() +"\nNombre de la consola : "+nombreConsola+" Game";
    }

    @Override
    double pagoRenta(int dias) {
        return 0;
    }
    
    
}
