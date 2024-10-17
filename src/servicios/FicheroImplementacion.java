package servicios;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
	 * Implementacion de metodos que controlen ficheros en la aplicacion, escritura de fichero
	 * 
	 * @author prosdez
	 */
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void EscribirFichero(String mensaje, String fichero) {
		// TODO Auto-generated method stub
		try (PrintWriter p = new PrintWriter(new FileWriter(fichero, true))) {
			p.println(mensaje);
		} catch (IOException e) {
			System.out.println("No se ha podido escribir en el fichero" + e.getMessage());
		}
	}

		
}
