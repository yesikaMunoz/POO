package Ejecucion;
import FiguraGeometrica.*;

import java.util.Scanner;
public class Ejecucion  {
    public static void main(String[] args) {
        double base, altura, largo, ancho, radio;
        int respuesta=1, respuesta2;
        Scanner lectura=new Scanner(System.in);
            while (respuesta==1) {
            System.out.println("Elige de que figura quieres calcular el area");
            System.out.println("1.Triangulo");
            System.out.println("2.Rectangulo");
            System.out.println("3.Circulo");
            respuesta2=lectura.nextInt();
            switch (respuesta2) {
                case 1:
                System.out.println("Ingrese el valor de la base del triangulo");
                base=lectura.nextFloat();
                System.out.println("Ingrese el valor de la altura del triangulo");
                altura=lectura.nextFloat();
                Triangulo b1=new Triangulo(base, altura);
                b1.calcularArea();
                    break;
                case 2:
                System.out.println("Ingrese el valor del ancho del rectangulo");
                ancho=lectura.nextFloat();
                System.out.println("Ingrese el valor del largo del rectangulo");
                largo=lectura.nextFloat();
                Rectangulo r1=new Rectangulo(ancho, largo);
                r1.calcularArea();
                    break;
                case 3:
                System.out.println("Ingrese el valor del radio del circulo");
                radio=lectura.nextFloat();
                Circulo c1=new Circulo(radio, radio);
                c1.calcularArea();

                    break;
            }
        System.out.println("¿Desea seguir calculando el area a la figura que usted escoja?");
        respuesta=lectura.nextInt();
    }  
    System.out.println("Gracias por utilizar el programa");
    lectura.close();
    }
}