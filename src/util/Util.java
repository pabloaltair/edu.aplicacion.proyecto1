package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controladores.Main;
import dto.UsuarioDto;

/**
 * Clase Util con métodos útiles para la aplicación.
 * @author nrojlla 151024
 */
public class Util {
	
	/**
	 * 
	 * @param conexion
	 * @return
	 */
	public static long GenerarIdUsuario() {
		// Usar Long para permitir null
		long nuevoId;
		if (Main.listaUsuarios.size()==0) {
			nuevoId=1;
		}
		else {
			nuevoId=Main.listaUsuarios.get(Main.listaUsuarios.size()-1).getIdUsuario()+1;
		}
		return nuevoId;
		
	}
}