public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNombre("Daniel");
        cliente.setEdad(20);
        cliente.setTelefono(123456);
        cliente.setCredito(1200000);
        System.out.println("-----CLIENTE-----");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        System.out.println("-----------------");
        System.out.println("\n");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Esteban");
        trabajador.setEdad(21);
        trabajador.setTelefono(111222);
        trabajador.setSalario(5800000);
        System.out.println("-----TRABAJADOR-----");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
        System.out.println("--------------------");
    }
}

class Persona {
    int edad, telefono;
    String nombre;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Cliente extends Persona { 
    double credito;

    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}