package servicios;
import java.util.Scanner;

/**
 *Servicio que realiza la seleccion de las opciones del menu 
 *@author prosdez
 *19/09/2024
 */

public class MenuImplementacion implements MenuInterfaz{
	
	/**
	 * Menu visual que muestra las opciones
	 * @return
	 * @author prosdez
	 * 19/09/2024
	 */

	@Override
	public byte MostrarMenuYOpcion() {
		System.out.println("==========¿QUE DESEA REALIZAR?============");
		System.out.println("0. Cerrar Aplicacion");
		System.out.println("1. Iniciar Sesion");
		System.out.println("2. Registrarse");
		
		/**
		 * Escaner que recoge la opcion seleccionada por el usuario, y se le devuelve
		 * @return
		 * @author prosdez
		 * 19/09/2024
		 */
		Scanner scanner = new Scanner(System.in);
		byte control=scanner.nextByte();
		return control;
		
	}
	
}
