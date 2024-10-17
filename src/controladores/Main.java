package controladores;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import dto.UsuarioDto;
import servicios.*;
import java.io.File;
import java.time.LocalDate;
/**
 * Clase de acceso aplicacion
 * 23/09/2024
 * Ultima actualizacion: Intento creacion del array- Añadir ficheros log en programa
 * @author prosdez
 */
public class Main {
	
	//ARRAYLIST DE ALUMNOS
	public static ArrayList<UsuarioDto> listaUsuarios = new ArrayList<>();
	
	//COMIENZO CLASE METODO MAIN
	public static void main(String[] args) {
		
		//FICHERO LOG
		LocalDate fecha = LocalDate.now();
		String directorioFichero = "ficheros";
		String fichero = directorioFichero + File.separator + fecha + "-FicheroLog.txt";
		
		//IMPLEMENTACION INTERFAZ MENU
		MenuInterfaz mi = new MenuImplementacion();
		/**Crear boolean para abrir y cerrar menu */
		boolean esCerrado = false;
		
		//IMPLEMENTACION INTERFAZ LOG
		FicheroInterfaz fi = new FicheroImplementacion();
		String mensaje = "INICIO APLICACION";
		fi.EscribirFichero(mensaje, fichero);
		
		/**Utilizamos byte ya que ocupa menos memoria que int, bite ocupa menos de 128 y 127 */
		/**Control reserva el maximo espacio para byte */
		
		byte control = 0;
		
		//CREAR Y ESTABLECER LA CONEXION
		ConexionBdInterfaz conexionBd=new ConexionBdImplementacion();
		conexionBd.EstablecerConexion();
		do {
			//Escritura log
			mensaje = "Conexion Establecida con Exito";
			fi.EscribirFichero(mensaje, fichero);
			
			//Utilizar control de MenuImplementacion
			control = mi.MostrarMenuYOpcion();
			UsuarioInterfaz UsuarioInterfaz= new UsuarioImplementacion();
			
			//Menu con opciones a seleccionar
			try {
				switch(control) {
				
					case 0:
						System.out.println("La aplicacion se cerrara");
						mensaje = "La aplicacion se cerro";
						fi.EscribirFichero(mensaje, fichero);
						esCerrado = true;
						
						break;
					case 1:
						System.out.println("Se abrira el inicio de sesion ");
						mensaje = "Se abrio el inicio de sesion";
						fi.EscribirFichero(mensaje, fichero);
						UsuarioInterfaz.IniciarSesion();
						break;
					case 2:
						System.out.println("Se abrira el registro de usuario ");
						mensaje = "Se abrio el registro de usuario";
						fi.EscribirFichero(mensaje, fichero);
						UsuarioInterfaz.RegistrarUsuario();
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
