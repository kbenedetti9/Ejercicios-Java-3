package proyectorectangulo;

/**
 *
 * @author Karen Benedetti M
 */
public class ProyectoRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese los cuatro puntos para formar el rectangulo");

        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(0, 2);
        Punto punto3 = new Punto(3, 2);
        Punto punto4 = new Punto(3, 0);

        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        float superficie = rectangulo.calcularSuperficie();
        System.out.println("Superficie del rectangulo es: " + superficie);

        Rectangulo rectangulo2 = new Rectangulo(5, 4);
        superficie = rectangulo2.calcularSuperficie();
        System.out.println("Superficie del rectangulo es: " + superficie);
    }

}
