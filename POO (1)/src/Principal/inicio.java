package Principal;

import salud.persona;

public class inicio {
    public static void main(String[] args) {
        //crear un objeto es la istacia de una clase 
        persona persona1=new persona();
        //invocamos el metodo
        persona1.pedirDatos();
        //persona.mostrarDatos();
        persona1.calcularImc();
        //mostrar la edad de la persona
       /*  persona1.mayerEdad(); */
    }
}
