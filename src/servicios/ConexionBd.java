package servicios;

import java.security.PublicKey;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBd {

    public void EstablecerConexion() {

        String url = "jdbc:postgresql://localhost:5432/dbd_routesrides";

        String usuario = "postgres";

        String contraseña = "Contraseña1!";

     
        try {

            // Cargar el controlador de la base de datos (opcional desde JDBC 4.0)

            Class.forName("org.postgresql.Driver");


            // Obtener la conexión usando DriverManager

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);


            if (conexion != null) {

                System.out.println("Conexión establecida con éxito.");

                conexion.close();

            }

        } catch (SQLException | ClassNotFoundException e) {

            e.printStackTrace();

        }

    }

}