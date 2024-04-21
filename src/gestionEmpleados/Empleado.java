/*
Se pretende modelar un sistema de gestión de empleados de una PYME.
Se sabe que un empleado tiene, en un principio: nombre, apellido, edad y salario.
La empresa tiene, entre otros sistemas de aumento de sueldo, la incorporación de un plus mensual de $5000 dependiendo de si el 
empleado tiene 40 años o más.
Se te pide modelar la solución implementando las clases que sean necesarias así como también un programa cliente que permita 
crear dos empleados cuyos datos son los siguientes:
* Empleado 1: Fernando Ureña, 23 años, sueldo mensual de $45000
* Empleado 2: Adrián López, 50 años, sueldo mensual de $70000
*/
package gestionEmpleados;

public class Empleado {

    // ATRIBUTOS
    private String nombre; // variables encapsuladas
    private String apellido;
    private int edad;
    private double salario;

    // CONSTRUCTOR
    public Empleado(String nombre, String apellido, int edad, double salario) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.salario = salario;
    }

    public Empleado() {
	this.nombre = "";
	this.apellido = "";
	this.edad = 0;
	this.salario = 0.0;
    }

    // GETTERS
    public String getNombre() {
	return nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public int getEdad() {
	return edad;
    }

    public double getSalario() {
	return salario;
    }

    // SETTERS	
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    public void setSalario(double salario) {
	this.salario = salario;
    }
    
    // METODO PARA APLICAR EL AUMENTO DE SALARIO SI EL EMPLEADO TIENE MAS DE 40 AÑOS
    
    public boolean aplicarAumento (double aumento){
	boolean rta = false;
	
	if (this.edad >= 40) {
	    this.salario += aumento;
	    rta = true;
	}
	return rta;
    }

    @Override
    public String toString() {
	//return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario + '}';
	
	String mensaje = "Empleado: " + this.nombre + " " + this.apellido + " con " + this.edad + " años";
        
	return mensaje;
    } 
}