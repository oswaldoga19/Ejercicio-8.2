package Notas; // Indica que la clase pertenece al paquete "Notas"

/**
 * Esta clase define el punto de ingreso al programa de operaciones
 * sobre notas. Por lo tanto, cuenta con un método main de acceso al
 * programa.
 * @version 1.2/2020
 */
public class Principal { // Clase Principal

    /**
     * Método main que sirve de punto de entrada al programa
     */
    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal; // Define un objeto de tipo VentanaPrincipal
        miVentanaPrincipal = new VentanaPrincipal(); // Crea una instancia de VentanaPrincipal
        miVentanaPrincipal.setVisible(true); // Hace visible la ventana principal
    }
}