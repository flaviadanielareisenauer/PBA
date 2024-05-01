/*
Se desea modelar ecuaciones lineales de una variable independiente (recta). Una recta se define por dos puntos. Cada punto es
un par de la forma (x, y) donde dichos valores del par son del tipo primitivo float. Se le solicita que defina la clase Punto y 
la clase Recta.

=====================================
Clase Punto:
Constructor
Punto (float x, float y) 
Crear una instancia de un punto con las coordenadas argumentos

Metodos:
getX(): float
Retornar el valor de abcisa. 

getY(): float
Retornar el valor de ordenada.

setX(float nuevoValor) : void
Establece un nuevo valor de ordenada.

setY(float nuevoValor) : void
Establece un nuevo valor de ordenada.

=====================================
Clase Recta:
Constructores
Recta (Punto p1, Punto p2)
Crea una instancia de Recta con los puntos argumentos.

Recta()
Crea una instancia de la recta identidad (y(x) = x).


Metodos:
pendiente(}: float
Retorna la pendiente de la recta.

paralelas (Recta otraRecta): boolean.
Recta true en caso que la recta argumento sea paralela a la recta receptora del mensaje, false caso contrario.

=====================================
Defina la clase UsaRecta para realizar una aplicacion de consola. El metodo main debera tener la siguiente secuencia 
de instrucciones:
* Crear el punto P1 (1,1)
* Crear el punto P2 (2,2)
* Crear la recta R1  con los puntos P1 y P2.
* Mostrar por pantalla la pendiente de la recta R!.
* Crear el punto P3 (3,3)
* Crear la recta R2 con los puntos P2 y P3.
*/

package G1Ejercicio3;

/**
 *
 * @author Flavia
 */
public class UsaRecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
    }
    
}
