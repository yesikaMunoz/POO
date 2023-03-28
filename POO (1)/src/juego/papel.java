package juego;

import java.util.Random;
import java.util.Scanner;

public class papel implements maquinita {
    private String jugador;
    private int eleccion;
    private int computadora;

    Scanner lectura=new Scanner(System.in);
    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        jugador=lectura.next();
    }
    public void jugar(){
        System.out.println(jugador+" Que opcion vas a escoger para jugar?");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Cual escoje?: ");
        eleccion=lectura.nextInt();
        Random aleatorio=new Random();
        computadora=aleatorio.nextInt(3)+1;
    }
    public void finalizar(){
        if (eleccion==1 && computadora==1) {
            System.out.println("empate, ambos sacaron piedra");
        }else if (eleccion==2 && computadora==2) {
            System.out.println("empate, ambos sacaron papel");
        }else if (eleccion==3 && computadora==3) {
            System.out.println("empate, ambos sacaron tijera");
        }else if (eleccion==1 && computadora==3) {
            System.out.println(jugador+" ganaste, sacaste (piedra), y la computadora (tijera)");
        }else if (eleccion==2 && computadora==1) {
            System.out.println(jugador+" ganaste, sacaste (papel), y la computadora (piedra)");
        }else if (eleccion==3 && computadora==2) {
            System.out.println(jugador+" ganaste, sacaste (tijera), y la computadora (papel)");
        }else if (computadora==1 && eleccion==3) {
            System.out.println("Lo siento "+jugador+" perdiste, sacaste (tijera), y la computadora (piedra)");
        }else if (computadora==2 && eleccion==1) {
            System.out.println("Lo siento "+jugador+" perdiste, sacaste (piedra), y la computadora (papel)");
        }else if (computadora==3 && eleccion==2) {
            System.out.println("Lo siento "+jugador+" perdiste, sacaste (papel), y la computadora (tijera)");
        }
        System.out.println("Gracias por jugar");
    }
}