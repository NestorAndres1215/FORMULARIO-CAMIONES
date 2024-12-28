package cls_conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Cls_Conexion {
    // Cambiar la cadena de conexión para MySQL
    String strConexionDB = "jdbc:mysql://localhost:3306/BDCAMIONES?useSSL=false&serverTimezone=UTC";
    String usuario = "root"; // Reemplaza con tu usuario de MySQL
    String contraseña = "12345"; // Reemplaza con tu contraseña de MySQL
    Connection conn = null;

    public Connection Conexion() throws SQLException {
        try {
            // Cargar el controlador JDBC para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            conn = DriverManager.getConnection(strConexionDB, usuario, contraseña);
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexión fallida: " + e);
        }
        return conn;
    }

    public static void main(String[] args) throws SQLException {
        Cls_Conexion objC = new Cls_Conexion();
        if (objC.Conexion() != null) {
            System.out.println("Se conectó a BDCAMIONES");
        }
    }
}