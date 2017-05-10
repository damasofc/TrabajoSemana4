

package trabajosemana4;

import java.util.Calendar;


public abstract class BlockBusterItem {
    protected String nombre;
    protected int codigo;
    protected int precioRenta;
    protected Calendar fecha = Calendar.getInstance();

    public BlockBusterItem(String nombre, int codigo, int precioRenta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioRenta = precioRenta;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\nCodigo: "+codigo+"\nPrecio de Renta: "+precioRenta +"\nFecha de Renta: "+fecha;
    }
    
    abstract double pagoRenta(int dias);
}
