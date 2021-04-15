package proyectorectangulo;

/**
 *
 * @author Karen Benedetti M
 */
public class Rectangulo {

    private Punto p1, p2, p3, p4;

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Rectangulo(float base, float altura) {
        this.p1 = new Punto(0, 0);
        this.p2 = new Punto(p1.getX(), p1.getY() + altura);
        this.p3 = new Punto(p2.getX() + base, p2.getY());
        this.p4 = new Punto(p3.getX(), p3.getY() - altura);
    }

    public float calcularSuperficie() {
        float base = p4.getX() - p1.getX();
        float altura = p2.getY() - p1.getY();

        return base * altura;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP3() {
        return p3;
    }

    public void setP3(Punto p3) {
        this.p3 = p3;
    }

    public Punto getP4() {
        return p4;
    }

    public void setP4(Punto p4) {
        this.p4 = p4;
    }

}
