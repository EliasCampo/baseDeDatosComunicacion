/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection; // para conectarnos a la base de datos
import java.sql.DriverManager; // para controlar la conexion
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Elias Campo
 */
// creo la clase conexionBase para comunicarnos con la base de datos, antes hay que importar una libreria (Add JAR/Folder)


/*CREATE TABLE Facturas (
id INTEGER PRIMARY KEY AUTOINCREMENT,
cuit VARCHAR(30));


CREATE TABLE Factura_Detalle (
id INTEGER PRIMARY KEY AUTOINCREMENT,
idFactura INTEGER,
producto VARCHAR(30),
cantidad VARCHAR(30),
FOREIGN KEY(idFactura) REFERENCES Facturas (id)); */     //este codigo fue para crear la clave foranea en sqlite




public class ConexionBase {
    String strConexionBD="jdbc:sqlite:C:\\Users\\Elias Campo\\Documents\\NetBeansProjects\\baseDeDatosComunicacion\\bdd-comunicacion.s3db";
    Connection conn=null;

    public ConexionBase(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionBD); 
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            
            System.out.println("Error de conexion"+e);
        }
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){  // para hacer una insercion en la bdd
    
        try {
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);            
            pstm.execute();
            return 1;
            
        } catch (SQLException e) {  //si hubiere un error lo atrapa aca y lo muestra en pantalla
            System.out.println(e);
            return 0;
        }
    }
    
    
        public ResultSet consultarRegistros (String strSentenciaSQL) {
        try {
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    
    }
        

    public int buscarUltimoId(){
       int id = 0;
       try {
            ResultSet resultado=consultarRegistros("SELECT * FROM Factura "); 
           
            while (resultado.next()) {

                Object[] oUsuario={resultado.getInt("id"),
                                    resultado.getString("cuit") };
                id = Integer.parseInt(oUsuario[0].toString());
          
            }
            
            return id;
       }catch (Exception e){
         System.out.println(e);
         return 0;
       }    
    }
    
}


