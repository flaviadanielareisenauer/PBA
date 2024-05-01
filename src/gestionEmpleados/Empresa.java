package gestionEmpleados;

public class Empresa {
    
    // Insert code -> add property -> nombre, tipo, modificadores de acceso. Generate getter and setter. 

    private String nombre;
    private int anioFundacion;
    private Empleado[] listaEmpleados;
    private int maxEmpleados;
    private int cantActualEmpleados;

    public Empresa(String nombre, int anioFundacion, int maxEmpleados) {
	this.nombre = nombre;
	this.anioFundacion = anioFundacion;
	this.maxEmpleados = maxEmpleados;
	this.cantActualEmpleados = 0;
	this.listaEmpleados = new Empleado[this.maxEmpleados];
    }

    // Getters
    public String getNombre() {
	return nombre;
    }

    public int getAnioFundacion() {
	return anioFundacion;
    }

    public Empleado[] getListaEmpleados() {
	return listaEmpleados;
    }

    public int getMaxEmpleados() {
	return maxEmpleados;
    }

    public int getCantActualEmpleados() {
	return cantActualEmpleados;
    }

    // Setters
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setAnioFundacion(int anioFundacion) {
	this.anioFundacion = anioFundacion;
    }

    public void setListaEmpleados(Empleado[] listaEmpleados) {
	this.listaEmpleados = listaEmpleados;
    }

    public void setMaxEmpleados(int maxEmpleados) {
	this.maxEmpleados = maxEmpleados;
    }

    public void setCantActualEmpleados(int cantActualEmpleados) {
	this.cantActualEmpleados = cantActualEmpleados;
    }

    public void agregarEmpleadoALista(Empleado e) {
	if (this.cantActualEmpleados < this.maxEmpleados) {
	    this.listaEmpleados[this.cantActualEmpleados] = e;
	    this.cantActualEmpleados++;
	    System.out.println("Se agrego el empleado " + e.getApellido());
	} else {
	    System.out.println("No se agrego el empleado, ya esta el cupo completo");
	}
    }

    public void mostrarListadoEmpleados() {
	System.out.println("");
	System.out.println("LISTADO DE EMPLEADOS");
	System.out.println("====================");

	for (int i = 0; i < this.cantActualEmpleados; i++) {
	    System.out.println(this.listaEmpleados[i].toString());
	}
    }

    public void evaluarInformarAumentos(double aumento) {
	System.out.println("");
	System.out.println("LISTADO DE EMPLEADOS CON AUMENTO");
	System.out.println("================================");

	for (int i = 0; i < this.cantActualEmpleados; i++) {
	    if (this.listaEmpleados[i].aplicarAumento(aumento)) {
		System.out.println(this.listaEmpleados[i].toString());
	    }
	}
    }
}
