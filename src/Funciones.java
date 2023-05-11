public class Funciones {
    public static void main(String[] args) {

        //opcion 1: Función sin parámetros y sin tipo de retorno
        showmenu();

        //opcion 2: Función sin patrámetros con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        double price = getPrice();
        System.out.println("El precio: " + price);
        // Opcion 3 :
        // Función con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootCamp");
        // Opcion 4 :
        // Función con parametros y con tipo de retorno
        String nombre = "Angel";
        String apellido = "Andrade";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

    }

    static String obtenerSaludo(String name, String apellido) {
        return "Hola "+ name + " " + apellido;
    }

    private static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenos días " + name);
    }

    private static double getPrice() {
        return 100.99;
    }

    static void showmenu() {
       System.out.println("Bienvenidos al E-commerce de zapatillas:");
       System.out.println("1 - Ver zapatillas");
       System.out.println("2 - Comprar zapatillas");
       System.out.println("3 - Salir");
   }
   static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas: \n 1.- Ves zapatillas.";
   }
}
