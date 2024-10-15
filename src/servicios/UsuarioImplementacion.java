package servicios;
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
			System.out.println("MenuUsuario");
			System.out.println("¿Que desea realizar?");
			System.out.println("Registrar motos");
			System.out.println("Crear evento");
			System.out.println("Apuntarse evento");
			System.out.println("Ver Club");
			System.out.println("Registrarse en Club");
			
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
