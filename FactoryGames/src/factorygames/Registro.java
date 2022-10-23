/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorygames;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Registro {
    
    public boolean agregar (Juego juego) {        
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();
            
            String query = "INSERT INTO juego(nombre_juego, plataforma_juego, precio_juego, estado_juego) VALUES (?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,juego.getNombre_juego());
            stmt.setString(2, juego.getPlataforma_juego());
            stmt.setInt(3, juego.getPrecio_juego());
            stmt.setBoolean(4, juego.isEstado_juego());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar libro" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar libro" + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(String nombre_juego) { 
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "DELETE FROM juego WHERE nombre_juego=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,nombre_juego);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar juego" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar juego" + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Juego juego) {
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "UPDATE juego set nombre_juego = ?, plataforma_juego = ?, precio_juego = ?, estado_juego = ? WHERE nombre_juego=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,juego.getNombre_juego());
            stmt.setString(2, juego.getPlataforma_juego());
            stmt.setInt(3, juego.getPrecio_juego());
            stmt.setBoolean(4, juego.isEstado_juego());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar juego" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al actualizar juego" + e.getMessage());
            return false;
        }
    }
    
      
    
    
    public Juego buscarPorNom(String nombre_juego) {
        Juego juego = new Juego();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT nombre_juego,plataforma_juego,precio_juego,estado_juego FROM juego WHERE nombre_juego=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, nombre_juego);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                juego.setNombre_juego(rs.getString("nombre_juego"));
                juego.setPlataforma_juego(rs.getString("plataforma_juego"));
                juego.setPrecio_juego(rs.getInt("precio_juego"));
                juego.setEstado_juego(rs.getBoolean("estado_juego"));
               
            }

            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar libro por id" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar libro por id" + e.getMessage());
        }
        return juego;
    }
    
    
    public List<Juego> buscarTodos() {
        List<Juego> lista = new ArrayList<Juego>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT nombre_juego,plataforma_juego,precio_juego,estado_juego FROM juego order by nombre_juego";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Juego juego = new Juego();
                juego.setNombre_juego(rs.getString("nombre_juego"));
                juego.setPlataforma_juego(rs.getString("plataforma_juego"));
                juego.setPrecio_juego(rs.getInt("precio_juego"));
                juego.setEstado_juego(rs.getBoolean("estado_juego"));

                lista.add(juego);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar juegos" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar juegois" + e.getMessage());
        }
        return lista;
    }
    
    
    
    
    
    

}