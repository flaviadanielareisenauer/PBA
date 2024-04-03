package gestionContactos;

public class GestionContactos {

    public static void main(String[] args) {
	Contacto contacto1 = new Contacto ();
	contacto1.setApellido("Morales");
	contacto1.setNombre("Fabricio");
	
	Contacto contacto2 = new Contacto("Macarena", "Diaz", "23456123", "mdiaz@gmail.com", 30);	
	
	Contacto contacto3 = new Contacto("Pablo", "Gonzalez");
	
	System.out.println("Contacto 1: " + contacto1.getApellido() + ", " + contacto1.getNombre());
	System.out.println("Contacto 2: " + contacto2.getApellido() + ", " + contacto2.getNombre());
	System.out.println("Contacto 3: " + contacto3.getApellido() + ", " + contacto3.getNombre());
    }    
}