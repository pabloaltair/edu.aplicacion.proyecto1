package controladores;
import java.lang.ref.Cleaner;
import java.util.ArrayList;

import dto.AlumnoDto;
import servicios.*;
/**
 * Clase de acceso aplicacion
 * 23/09/2024
 * Ultima actualizacion: Intento creacion del array
 * @author prosdez
 */
public class Main {
	
	//ARRAYLIST DE ALUMNOS
	static ArrayList<AlumnoDto> listaAlumnos = new ArrayList<>();
	
	//COMIENZO CLASE METODO MAIN
	public static void main(String[] args) {
		
		//IMPLEMENTACION INTERFAZ
		MenuInterfaz mi = new MenuImplementacion();
		/**Crear boolean para abrir y cerrar menu */
		boolean esCerrado = false;
		
		/**Utilizamos byte ya que ocupa menos memoria que int, bite ocupa menos de 128 y 127 */
		/**Control reserva el maximo espacio para byte */
		
		byte control = 0;
		
		//CREAR Y ESTABLECER LA CONEXION
		ConexionBd conexionBd=new ConexionBd();
		conexionBd.EstablecerConexion();
		do {
			
			control = mi.MostrarMenuYOpcion();
			AlumnoInterfaz alumnoInterfaz= new AlumnoImplementacion();
			
			try {
				switch(control) {
				
					case 0:
						System.out.println("La aplicacion se cerrara");
						esCerrado = true;
						
						break;
					case 1:
						System.out.println("Se abrira el alta del nuevo alumno ");
						alumnoInterfaz.CrearAlumno();
						break;
					case 2:
						System.out.println("Se abrira la modificacion del alumno ");
						alumnoInterfaz.ModificarAlumno();
						break;
						
					case 3:
						System.out.println("Se abrira la eliminacion del alumno ");
						alumnoInterfaz.EliminarAlumno();
						break;
						
					default:
						
						System.out.println("ERROR: Seleccione una opción valida");
						break;
				
				}
			}
			catch(Exception e) {
			System.out.println("Ha habido un error en el sistema");	
			}
		
			
		}while(!esCerrado);
		
	}

}
