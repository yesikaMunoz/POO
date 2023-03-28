package FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double  radio;
    private double pi=3.14;
// metodo constructor 
    public Circulo(double radio ,double pi) {
        this.radio = radio;
        this.pi= pi;
    }
    // geter y seter
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    public double calcularArea() {
        return pi * radio * radio;
    }
}

