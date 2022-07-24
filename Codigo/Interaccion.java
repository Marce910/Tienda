import javax.swing.JOptionPane;
import java.util.List;

public class Interaccion
{
    private Almacen a;
    
    public Interaccion()
    {
        a = new Almacen();
    }
    
    public void presentarMenuPrincipal()
    {
        int opcion = 0;
        do
        {
            String menu = "MENU PRINCIPAL \n" +
                          "1. Ingresar un producto \n" +
                          "2. Mostrar productos \n" +
                          "3. Buscar productos \n" +
                          "0. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Seleccione opción",JOptionPane.QUESTION_MESSAGE));
            switch(opcion)
            {
                case 1:
                    this.ingresarProducto();
                    break;
                case 2:
                    this.mostrarProductos();
                    break;
                case 3:
                    this.buscarProductos();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        while(opcion != 0);
    }
    
    public void ingresarProducto()
    {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE);
        int codigo = a.getSiguienteCodigo();
        String marca = JOptionPane.showInputDialog(null, "Ingrese marca de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE);
        String presentacion = JOptionPane.showInputDialog(null, "Ingrese presentacion de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE);
        String [] tipos = {"Aseo", "Alimentos"};
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione tipo de producto", "Nuevo producto",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
        int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese precio de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE));
        
        Producto p = new Producto(nombre, codigo, precio, presentacion, cantidad, marca, tipos[tipo]);
        a.agregarProducto(p);
        JOptionPane.showMessageDialog(null, "Se ha añadido el producto al almacén", "Producto creado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostrarProductos()
    {
        List<Producto> listaProductos = a.getListaProductos();
        String lista = "";
        for (Producto p: listaProductos)
        {
            lista = lista + p.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista, "Productos en el almacén", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void buscarProductos()
    {
       String criterio = JOptionPane.showInputDialog(null, "Ingrese dato de producto a buscar (nombre, marca, presentacion o tipo) ", "Buscar productos",JOptionPane.QUESTION_MESSAGE); 
       List<Producto> listaProductos =a.buscarProductos(criterio);
       String lista = "";
       for (Producto p: listaProductos)
        {
            lista = lista + p.toString() + "\n";
        }
       JOptionPane.showMessageDialog(null, lista, "Productos encontrados", JOptionPane.INFORMATION_MESSAGE);
    }
}
