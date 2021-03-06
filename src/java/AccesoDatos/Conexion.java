/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.*;

public class Conexion {

    protected Connection con;
    protected Statement stmt;
    private String serverName = "localhost";
    private String portNumber = "3306";
    private String databaseName = "biblioteca";
    private String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + databaseName;
    private String userName = "root";
    private String password = "Tbryan.96"; // Indica al controlador que debe utilizar un cursor de servidor, // lo que permite más de una instrucción activa // en una conexión. private final String selectMethod = "cursor";
    //private String selectMethod = "cursor";
    private String errString;
    // Constructor public Connect(){}

    public Conexion() {

    }

    private String getConnectionUrl() {
        return url;
    }

    public Connection Conectar() {
        con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(getConnectionUrl(), userName, password);
            stmt = con.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            errString = "Error Mientras se conectaba a la Base de Datos";
            System.err.println(errString);
            return null;
        }
        return con;
    }

    /* Mostrar las propiedades del controlador y los detalles de la base de datos */
    public void Desconectar() {
        try {
            stmt.close();
            con.close();
        } catch (SQLException e) {
            errString = "Error Mientras se Cerraba la Conexion a la Base de Datos";
        }
    }

    public Statement getStmt() {
        return this.stmt;
    }

    public static void main(String[] args) {
        Conexion objCon = new Conexion();
        objCon.Conectar();
           }
}
