/*
// EJERCICIO |
Se te pide el desarrollo de una aplicación de gestión de contactos de dispositivos virtuales. Por cada contacto se tendrá un nombre, 
un apellido, su DNI, email y edad. 
Primero se te pide que implementes un programa cliente que genere tres contactos y muestre sus apellidos y nombres por pantalla. 
*/

package gestionContactos;

public class Contacto {
    // caracteristicas / atributos
    private String nombre;  
    private String apellido;
    private String dni;
    private String email;
    private int edad;
        
    // responsabilidades / metodos
    // Constructores: siempre deben llamarse igual a la clase
    public Contacto (){
	this.nombre = "";
	this.apellido = "";
	this.dni = "";
	this.email = "";
	this.edad = 0;	
    }

    public Contacto(String nombre, String apellido) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = "";
	this.email = "";
	this.edad = 0;	
    }
    
    public Contacto(String nombre, String apellido, String dni, String email, int edad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.email = email;
	this.edad = edad;
    }  

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public String getDni() {
	return dni;
    }

    public void setDni(String dni) {
	this.dni = dni;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }     
}