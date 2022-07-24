
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
        this.nombre = "";
        this.codigo = 0;
        this.precio = 0;
        this.presentacion = "";
        this.cantidad = 0;
        this.marca = "";
        this.tipo = "";
    }

    public Producto(String nombre, int codigo, int precio, String presentacion, int cantidad, String marca, String tipo) 
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.presentacion = presentacion;
        this.cantidad = cantidad;
        this.marca = marca;
        this.tipo = tipo;
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
    
    public String toString()
    {
        return "Prod: "+this.nombre+" "+this.marca + " - " + this.presentacion + "(" + this.tipo + ")";
    }
    
    public String toCSV()
    {
        return this.codigo+";"+this.nombre+";"+this.marca+";"+this.presentacion+";"+this.tipo+";"+this.precio+";"+this.cantidad;
    }

}