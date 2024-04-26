package gestionEmpleados;

import java.util.Scanner;

class GestionEmpleados {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	Empresa empresa1 = new Empresa("PBA S.A.", 2024, 100);

	/*
        Empleado empleado1 = new Empleado("Ureña", "Fernando", 23, 45000);
        Empleado empleado2 = new Empleado("Lopez", "Adrian", 50, 70000);

        empresa1.agregarEmpleadoALista(empleado1);
        empresa1.agregarEmpleadoALista(empleado2);
	 */
	for (int i = 0; i < 5; i++) {
	    Empleado e = cargarDatosEmpleado(entrada);
	    empresa1.agregarEmpleadoALista(e);
	}

	empresa1.mostrarListadoEmpleados();

	System.out.println("Ingrese aumento: ");
	empresa1.evaluarInformarAumentos(entrada.nextDouble());

	/*
        System.out.println(" Informacion del empleado 1:  " + empleado1.toString());
        System.out.println(" Informacion del empleado 2:  " + empleado2.toString());
        System.out.println("");
        
        empleado1.aplicarAumento(5000);
        empleado2.aplicarAumento(5000);

        System.out.println(" Informacion del empleado 1:  " + empleado1.toString());
        System.out.println(" Informacion del empleado 2:  " + empleado2.toString());
        System.out.println("");
	 */
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

        System.out.println("Ingrese Salario: ");
        salario = entrada.nextDouble();

        entrada.nextLine();

        Empleado e = new Empleado(apellido, nombre, edad, salario);
        
        return e;
    }    
}