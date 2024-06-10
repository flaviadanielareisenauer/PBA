/*
Se pretende modelar un sistema de gestión de empleados de una PYME.
Se sabe que un empleado tiene, en un principio: nombre, apellido, edad y salario.

La empresa tiene, entre otros sistemas de aumento de sueldo, la incorporación de un plus mensual de $5000 dependiendo de si el
empleado tiene 40 años o más.
Se te pide modelar la solución implementando las clases que sean necesarias así como también un programa cliente que permita
crear dos empleados cuyos datos son los siguientes:

Empleado 1: Fernando Ureña, 23 años, sueldo mensual de $45000
Empleado 2: Adrián López, 50 años, sueldo mensual de $70000

Teniendo en cuenta el sistema de Gestión de Empleados que ya comenzaste a desarrollar, se pretende mejorarlo incluyendo el 
concepto de Empresa. Una empresa tiene un nombre, un año de fundación y una lista de cierta cantidad de empleados que no puede 
superar los 100.
Se te pide que modifiques el programa cliente agregando la Empresa con el nombre, año de fundación y cantidad máxima de 
empleados que vos indiques, y que agregues a Ureña, López y tres nuevos empleados más al listado de empleados de la empresa.

Luego evaluar si hay que aplicar aumento (que el usuario cargará por pantalla) a los empleados indicando, por pantalla también, 
apellido, nombre y edad de los empleados que recibieron aumento
*/

package gestionEmpleados;
import java.util.Scanner;

class GestionEmpleados {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	Empresa empresa1 = new Empresa("PBA S.A.", 2024, 100);
	
	for (int i = 0; i < 5; i++) {
	    Empleado e = cargarDatosEmpleado(entrada);
	    empresa1.agregarEmpleadoALista(e);
	}

	empresa1.mostrarListadoEmpleados();

	System.out.println("Ingrese aumento: ");
	empresa1.evaluarInformarAumentos(entrada.nextDouble());

    }
    
    private static Empleado cargarDatosEmpleado(Scanner entrada) {
        String apellido, nombre;
        int edad;
        double salario;

        System.out.println("Ingrese Apellido: ");
        apellido = entrada.nextLine();

        System.out.println("Ingrese Nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese Edad: ");
        edad = entrada.nextInt();
	
	entrada.nextLine();

        System.out.println("Ingrese Salario: ");
        salario = entrada.nextDouble();

        entrada.nextLine();

        Empleado e = new Empleado(apellido, nombre, edad, salario);
        
        return e;
    }    
}