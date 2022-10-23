/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiondb;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Cristian
 */
public class ConexionDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/juegos", "root", "");
            System.out.println("conexion exitosa");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
