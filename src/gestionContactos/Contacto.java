/*
Se te pide el desarrollo de una aplicación de gestión de contactos de dispositivos virtuales. Por cada contacto se tendrá un nombre, 
un apellido, su DNI, email y edad. 
Primero se te pide que implementes un programa cliente que genere tres contactos y muestre sus apellidos y nombres por pantalla. 
A continuación, dejamos también el segundo enunciado cuya solución quedó planteada, para hacer la puesta en común al comienzo de la clase que
viene: 
Se pretende modelar un sistema de gestión de empleados de una PYME. 
Se sabe que un empleado tiene, en un principio: nombre, apellido, edad y salario. 
La empresa tiene, entre otros sistemas de aumento de sueldo, la incorporación de un plus mensual de $5000 dependiendo de si el empleado 
tiene 40 años o más. 
Se te pide modelar la solución implementando las clases que sean necesarias, así como también un programa cliente que permita crear dos 
empleados cuyos datos son los siguientes: 

Empleado 1: Fernando Ureña, 23 años, sueldo mensual de $45000 
Empleado 2: Adrián López, 50 años, sueldo mensual de $70000 
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
