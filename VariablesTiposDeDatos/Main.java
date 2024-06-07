public class Main {

    public static void main(String[] args) {

        Producto productoUno = new Producto();
        productoUno.nombre = "Computadora Acer";
        productoUno.precio = 230.56;
        productoUno.categoria = CategoriaEnum.ELECTRONICA;

        System.out.println("Nombre: " +
            productoUno.nombre +
            "Precio: " + productoUno.precio);


    }

}
