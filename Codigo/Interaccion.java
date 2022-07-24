import javax.swing.JOptionPane;

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
                          "0. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Seleccione opción",JOptionPane.QUESTION_MESSAGE));
            switch(opcion)
            {
                case 1:
                    this.ingresarProducto();
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
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese codigo de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE));
        String marca = JOptionPane.showInputDialog(null, "Ingrese marca de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE);
        String presentacion = JOptionPane.showInputDialog(null, "Ingrese presentacion de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE);
        String tipo = JOptionPane.showInputDialog(null, "Ingrese tipo de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE);
        int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese precio de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de producto", "Nuevo producto",JOptionPane.QUESTION_MESSAGE));
        
        Producto p = new Producto(nombre, codigo, precio, presentacion, cantidad, marca, tipo);
        a.agregarProducto(p);
        JOptionPane.showMessageDialog(null, "Se ha añadido el producto al almacén", "Producto creado", JOptionPane.INFORMATION_MESSAGE);
    }
}
