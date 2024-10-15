package servicios;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Metodos del Usuario
 * @author prosdez
 * 15/10/2024
*/

public class UsuarioImplementacion implements UsuarioInterfaz {
	
	//CREAR SCANNER que utilizara el resto de metodos
	Scanner scanner=new Scanner(System.in);
	
	//INICIO DE SESION USUARIO
	public void IniciarSesion() {
		System.out.println("==========INICIAR SESION==========");
		System.out.println("Introduce los campos");
		
		System.out.println("Nombre");
		String nombreUsuario=scanner.nextLine();
		
		System.out.println("Correo");
		String emailUsuario=scanner.nextLine();
		
		System.out.println("Contraseña");
		String contrasenaUsuario=scanner.nextLine();
		
		//Iniciamos menu dentro del usuario
		MenuUsuario();
		
	}
	//MENU USUARIO YA INICIADO
		public void MenuUsuario() {
			System.out.println("==========MENU USUARIO==========");
			System.out.println("0. Cerrar Menu");
			System.out.println("1. ¿Que desea realizar?");
			System.out.println("2. Registrar motos");
			System.out.println("3. Crear evento");
			System.out.println("4. Apuntarse evento");
			System.out.println("5. Ver Club");
			System.out.println("6. Registrarse en Club");
			
			//Obtenemos control
			boolean esCerrado=false;
			do {
				byte control=scanner.nextByte();
				
				try {
					switch(control) {
					
						case 0:
							System.out.println("Accediendo a registro de motos ");
							esCerrado = true;
							
							break;
						case 1:
							System.out.println("Accediendo a creacion de eventos ");
							
							break;
						case 2:
							System.out.println("Accediendo a registro en un evento ");
							
							break;
							
						case 3:
							System.out.println("Accediendo al club ");
							
							break;
						case 4:
							System.out.println("Accediendo al registro en un club ");
							
							break;
													
						default:
							
							System.out.println("ERROR: Seleccione una opción valida");
							break;
						}
					
					}catch(Exception e) {
						System.out.println("Ha habido un error en el sistema");	
					}
				}while (!esCerrado);
		}
			
			
		
		
	//REGISTRO DE USUARIO
	@Override
	public void RegistrarUsuario() {
		
		//MENU Elegir Opcion a Modificar
		try {
			System.out.println("==========REGISTRAR USUARIO==========");
			System.out.println("Introduce los campos");
			
			System.out.println("Nombre");
			String nombreUsuario=scanner.nextLine();
			
			System.out.println("Correo");
			String emailUsuario=scanner.nextLine();
			
			System.out.println("Contraseña");
			String contrasenaUsuario=scanner.nextLine();
			
			System.out.println("Repite la Contraseña");
			String contrasenarepetidaUsuario=scanner.nextLine();
			
			//Bucle confirmar contraseña
			while (!contrasenaUsuario.equals(contrasenarepetidaUsuario) ) {
				System.out.println("La contraseña no coincide, introduzca de nuevo la contraseña");
				
				System.out.println("Contraseña");
				contrasenaUsuario=scanner.nextLine();
				System.out.println("Repite la Contraseña");
				contrasenarepetidaUsuario=scanner.nextLine();
				}
			
		}
		catch(Exception e) {
			
		}
	}
}
