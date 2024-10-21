package servicios;
import java.net.URL;
import java.security.DrbgParameters.NextBytes;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;
import controladores.Main;
import servicios.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dto.UsuarioDto;
import controladores.Main;

/**
 * Metodos del Usuario
 * @author prosdez
 * 17/10/2024
*/

public class UsuarioImplementacion implements UsuarioInterfaz {
	
	//Crear implementaciones
	Main in= new Main();
	ConexionBdInterfaz ci = new ConexionBdImplementacion();
		
	//CREAR SCANNER que utilizara el resto de metodos
	Scanner scanner=new Scanner(System.in);
	
	//INICIO DE SESION USUARIO
	public void IniciarSesion() {
				
		try {
			
			System.out.println("==========INICIAR SESION==========");
			System.out.println("Introduce los campos");
			
			System.out.println("Nombre");
			String nombreUsuario=scanner.nextLine();

			System.out.println("Contraseña");
			String contrasenaUsuario=scanner.nextLine();
			
			//Comprobamos conexion
			ConexionBdInterfaz ci = new ConexionBdImplementacion();
			ci.EstablecerConexion();
			
			//Iniciamos menu dentro del usuario
			MenuUsuario();
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
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
			Connection conexion = ci.EstablecerConexion();
			
			System.out.println("==========REGISTRAR USUARIO==========");
			System.out.println("Introduce los campos");
			
			System.out.println("Nombre");
			String nombreUsuario=scanner.nextLine();
			
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
			
			
			
				// Generar un ID único
				long id_usuario = util.Util.GenerarIdUsuario();
				// Crear un objeto UsuarioDto y setear los datos
				UsuarioDto udDto = new UsuarioDto();
				udDto.setNombreUsuario(nombreUsuario);
				udDto.setContrasenaUsuario(contrasenaUsuario);
				udDto.setIdUsuario(0);
			
			
			
			// Consulta SQL para insertar el nuevo usuario
			String insertQuery = "INSERT INTO \"dlk_usuario\".usuario (id_usuario, nombre_usuario, contrasena) VALUES (?, ?, ?)";

			// Ejecutar la inserción a la base de datos
			try (PreparedStatement ps = conexion.prepareStatement(insertQuery)) {
				ps.setLong(1, id_usuario);
				ps.setString(2, nombreUsuario);
				ps.setString(3, contrasenaUsuario);


				// Ejecutar la inserción
				ps.executeUpdate();
				conexion.close();
				System.out.println("Usuario creado y guardado con éxito en la base de datos.");
				
			} catch (SQLException e) {
				System.out.println("Error al insertar usuario en la base de datos: " + e.getMessage());
			
		}

			
		}catch(Exception e) {
			System.out.println("Ha habido un error en el sistema");
		}
	}
}
