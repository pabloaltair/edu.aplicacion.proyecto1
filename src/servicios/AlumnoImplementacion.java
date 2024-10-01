package servicios;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

/**
 * Metodos del Alumno
 * @author prosdez
 * 25/09/2024
*/

public class AlumnoImplementacion implements AlumnoInterfaz {
	
	//CREAR SCANNER que utilizara el resto de metodos
	Scanner scanner=new Scanner(System.in);
	
	//CREACION DEL USUARIO INTRODUCIENDO PARAMETROS A AÑADIR EN EL MISMO
	public void CrearAlumno() {
		System.out.println("==========DAR ALTA A ALUMNO==========");
		System.out.println("Introduce los campos");
		
		System.out.println("Nombre");
		String nombreAlumno=scanner.nextLine();
		
		System.out.println("Apellidos");
		String apellidosAlumno=scanner.nextLine();

		System.out.println("DNI");
		String dniAlumno=scanner.next();

		System.out.println("Fecha de Nacimiento");
		String fechaNacimientoAlumno=scanner.next();

		System.out.println("Gmail");
		String gmailAlumno=scanner.next();

		System.out.println("Telefono");
		int telefonoAlumno=scanner.nextInt();
		
		
	}
	//MODIFICAR USUARIO INTRODUCIENDO DNI Y MODIFICAR DATOS EN EL MISMO
	@Override
	public void ModificarAlumno() {
		
		//MENU Elegir Opcion a Modificar
		try {
			System.out.println("==========¿QUE DESEA MODIFICAR?==========");
			System.out.println("1. Nombre ");
			System.out.println("2. Apellidos ");
			System.out.println("3. DNI ");
			System.out.println("4. Fecha de Nacimiento ");
			System.out.println("5. Gmail ");
			System.out.println("6. Telefono ");
			
			
			try {
				//CONTROLADOR de acciones de los menu(permite seleccionar las opciones del menu)
				byte control=scanner.nextByte();
				
				//MENU Parametro de Alumno a Cambiar
				switch(control) {
				
					case 1:
						
						System.out.println("Inserte nuevo nombre");
						
						break;
					case 2:
						
						System.out.println("Inserte nuevos Apellidos");
						
						break;
						
					case 3:
						
						System.out.println("Inserte nuevo DNI");
						
						break;
					
					case 4:
						
						System.out.println("Inserte nueva Fecha de Nacimiento");
						
						break;
					
					case 5:
						
						System.out.println("Inserte nuevo Gmail");
						
						break;
					
					case 6:
						
						System.out.println("Inserte nuevo telefono");
						
						break;
						
					default:
						
						System.out.println("ERROR: Seleccione una opción valida");
						break;
				}
				
			} catch (Exception e) {
			
			}
		}
		catch(Exception e) {
			
		}
	}

	@Override
	//ELIMINAR USUARIO PIDIENDO DNI
	public void EliminarAlumno() {
		System.out.println("=============ELIMINAR ALUMNO=============");
		System.out.println("\u001B[1;31m ¿Esta Seguro de eliminar Alumno?\u001B[0m");
		System.out.println("0. No, Volver al Menu Principal");
		System.out.println("1. Si, Eliminar Alumno ");
		try {
			//CONTROLADOR de acciones de los menu(permite seleccionar las opciones del menu)
			byte control=scanner.nextByte();
			
			switch(control) {
			case 0:
				System.out.println("Eliminando alumno");
				break;
			case 1:
				System.out.println("Volviendo al Menu Principal");
				break;
			}
			
		}catch (Exception e) {
			
		}
		
		
			
		
	}
}
