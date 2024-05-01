package G1Ejercicio3;

public class Recta {

    Punto p1, p2;

    public Recta(Punto p1, Punto p2) {
	this.p1 = p1;
	this.p2 = p2;
    }

    public Recta() {
	p1 = new Punto(1, 1);
	p2 = new Punto(2, 2);
    }

    public float pendiente() {
	return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public boolean paralelas(Recta otraRecta) {
	return pendiente() == otraRecta.pendiente();
    }
}