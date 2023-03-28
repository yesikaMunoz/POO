package salud;
import java.util.Scanner;
public class persona {
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    
    // Constructor
    public persona(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    public persona() {
    }
    public void pedirdatos(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tipo de documento: ");
        tipoDoc = input.nextLine();
        System.out.print("Ingrese el número de documento: ");
        documento = input.next();
        input.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = input.nextLine();
        System.out.print("Ingrese el peso en kg: ");
        peso = input.nextDouble();
        System.out.print("Ingrese la estatura en m: ");
        estatura = input.nextDouble();
        System.out.print("Ingrese la edad: ");
        edad = input.nextInt();
        input.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el sexo: ");
        sexo = input.nextLine();
        input.close();
    }

    public void mostrarpersona(){
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    // Métodos getter
    public String getTipoDoc() {
        return tipoDoc;
    }
    
    public String getDocumento() {
        return documento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getEstatura() {
        return estatura;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    // Métodos setter
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // Métodos de la clase Persona
    public void pedirDatos() {
        // Aquí va la lógica para pedir los datos de la persona
    }
    
    public void mostrarPersona() {
        // Aquí va la lógica para mostrar los datos de la persona
    }
    
    public String calcularImc() {
        double pesoActual = peso / (estatura * estatura);
        if (pesoActual < 20) {
            return "PESOBAJO";
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    
    public boolean mayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}



