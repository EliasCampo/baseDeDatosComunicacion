/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.ConexionBase;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
/**
 *
 * @author Elias Campo
 */

public class Factura {
    int id, cantidad;
    String cuit, producto;
    
    
    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    
    
    public void botonAgregar (int opcion, String cuit, String producto, int cantidad, int id) {                                           
       ConexionBase objConexionBase= new ConexionBase();
       
       
       switch (opcion){
           case 1:
               
            String StrSentenciaInsert = String.format("INSERT INTO Factura (cuit) "
               + "VALUES ('%s')", cuit);
       
            objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);// ejecutar la instruccion de insercion
            break;
       
           case 2: 
               int ultimoId = objConexionBase.buscarUltimoId();
                StrSentenciaInsert = String.format("INSERT INTO FacturaDetalle (idFactura, producto, cantidad) "
                       + "VALUES ('%d','%s', '%d')" , ultimoId, producto, cantidad);
                

            objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);// ejecutar la instruccion de insercion
            break;
            
            case 3: 
              
                StrSentenciaInsert = String.format("INSERT INTO FacturaDetalle (idFactura, producto, cantidad)" 
                       + "VALUES ('%d','%s', '%d')" , id, producto, cantidad);
                

            objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);// ejecutar la instruccion de insercion
            break;
       
    }
       }   
          
    
    public void botonBorrar (int id, int opcion) {
                                           
        ConexionBase objConexionBase= new ConexionBase();
        
        switch (opcion){
            case 1:
                String StrSentenciaInsert = String.format("DELETE FROM Factura WHERE id='%d'", id);  
                objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);
                StrSentenciaInsert = String.format("DELETE FROM FacturaDetalle WHERE idFactura='%d'", id);  
                objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);
                
            case 2: 
                    StrSentenciaInsert = String.format("DELETE FROM FacturaDetalle WHERE idProducto='%d'", id);
                objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);

        }

    }
    
    public void Editar (int id, String cuit, int idProducto, String producto, int cantidad, int opcion){

        ConexionBase objConexionBase= new ConexionBase();
        
        switch (opcion){
            case 1:
                String StrSentenciaInsert = String.format("UPDATE Factura SET cuit='%s'"
               + "WHERE id= %d", cuit, id);
       
                objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);
                break;
       
            case 2: 
                 StrSentenciaInsert = String.format("UPDATE FacturaDetalle SET producto='%s', cantidad='%d'"
               + "WHERE idProducto = %d", producto, cantidad, idProducto );
       
                objConexionBase.ejecutarSentenciaSQL (StrSentenciaInsert);
                break;
        
        }
            

 
}
     
    public DefaultTableModel buscarTodos(int opcion, int idFactura){
        ConexionBase objConexionBase= new ConexionBase();
        DefaultTableModel modelo = null;
        
        
        switch (opcion) {
            case 1: 
                String[] titulos ={"id", "cuit"};
                modelo=new DefaultTableModel(null, titulos);

                while(modelo.getRowCount()>0){
                   modelo.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                }

                try {
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM Factura "); 

                    while (resultado.next()) {

                        Object[] oUsuario={resultado.getString("id"),
                                            resultado.getString("cuit") };
                        modelo.addRow(oUsuario);

                    }

                }catch (Exception e){
                    System.out.println(e);
                    return null;
               } 

                break;
            case 2: 
                
                String[]  titulos2 ={"idProducto", "idFactura", "producto", "cantidad"};
                modelo=new DefaultTableModel(null, titulos2);

                while(modelo.getRowCount()>0){
                    modelo.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                 }

                try {
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM FacturaDetalle WHERE idFactura="+idFactura); 

                     while (resultado.next()) {

                        Object[] oUsuario={resultado.getString("idProducto"),
                                           resultado.getString("idFactura"),
                                          resultado.getString("producto"),
                                          resultado.getString ("cantidad")};
                        modelo.addRow(oUsuario);

                  }

             }catch (Exception e){
                System.out.println(e);
                return null;
           } 
                break;
            case 3: 
                String[]  titulos3 ={"idProducto", "idFactura", "producto", "cantidad"};
                modelo=new DefaultTableModel(null, titulos3);
                while(modelo.getRowCount()>0){
                    modelo.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                 }

                try {
                   int ultimoIdDetalle =  objConexionBase.buscarUltimoId();
                   System.out.println(ultimoIdDetalle);
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM FacturaDetalle WHERE idFactura LIKE '%"+ultimoIdDetalle+"%'"); 

                     while (resultado.next()) {

                        Object[] oUsuario={resultado.getString("idProducto"),
                                           resultado.getString("idFactura"),
                                          resultado.getString("producto"),
                                          resultado.getString ("cantidad")};
                        modelo.addRow(oUsuario);

                  }

             }catch (Exception e){
               System.out.println(e);
               return null;
           } 
              break;

    
        }   
        return modelo;
    }
}
