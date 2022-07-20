
public class Producto 
{
    private String nombre;
    private int codigo;
    private int precio;
    private String presentacion;
    private int cantidad;
    private String marca;
    private String tipo;
    
    public Producto() 
    {
        
    }

    public Producto(String nombre, int codigo, int precio, String presentacion, int cantidad, String marca, String tipo) 
    {
        // TODO implement here
    }

    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }

    public String getNombre() 
    {
        return this.nombre;
    }

    public int getCodigo() 
    {
        return this.codigo;
    }
    
    public int getPrecio() 
    {
        return this.precio;
    }

    public String getPresentacion() 
    {
        return this.presentacion;
    }
    
    public int getCantidad() 
    {
        return this.cantidad;
    }

    public String getMarca() 
    {
        return this.marca;
    }

    public String getTipo() 
    {
        return this.tipo;
    }

}