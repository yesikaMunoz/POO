package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
// metodo constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
// creamos los geter y seter 
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}

