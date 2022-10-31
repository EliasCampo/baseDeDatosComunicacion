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
    String varLocalCuit, varLocalProducto, varLocalNombre, varLocalApellido;
    static DefaultTableModel varLocalTabDetalle;

    public Factura() {
    }

    public Factura(int id, int opcion){
        this.setearParametros(id, opcion);
        this.setearParametrosDetalle(id, opcion);
    }
    
    
    
    
    public String getVarLocalCuit() {
        return varLocalCuit;
    }

    public void setVarLocalCuit(String varLocalCuit) {
        this.varLocalCuit = varLocalCuit;
    }

    public String getVarLocalProducto() {
        return varLocalProducto;
    }

    public void setVarLocalProducto(String varLocalProducto) {
        this.varLocalProducto = varLocalProducto;
    }

    public String getVarLocalNombre() {
        return varLocalNombre;
    }

    public void setVarLocalNombre(String varLocalNombre) {
        this.varLocalNombre = varLocalNombre;
    }

    public String getVarLocalApellido() {
        return varLocalApellido;
    }

    public void setVarLocalApellido(String varLocalApellido) {
        this.varLocalApellido = varLocalApellido;
    }

    
    public String getNombre() {
        return varLocalNombre;
    }

    public void setNombre(String nombre) {
        this.varLocalNombre = nombre;
    }

    public String getApellido() {
        return varLocalApellido;
    }

    public void setApellido(String apellido) {
        this.varLocalApellido = apellido;
    }
    
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
        return varLocalProducto;
    }

    public void setProducto(String producto) {
        this.varLocalProducto = producto;
    }

    public String getCuit() {
        return varLocalCuit;
    }

    public void setCuit(String cuit) {
        this.varLocalCuit = cuit;
    }
    
    
    
    public void setearParametros(int Id, int opcion){  
        ConexionBase objConexionBase= new ConexionBase();
        String[] titulos ={"id", "cuit", "nombre", "apellido"};
        DefaultTableModel modelo2 = new DefaultTableModel(null, titulos);

        
        switch(opcion){
            case 2:
                while(modelo2.getRowCount()>0){
                   modelo2.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                }
                    
                try {
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM FacturaDetalle WHERE id LIKE '%"+Id+"%'"); 

                    while (resultado.next()) {

                        Object[] oUsuario={ resultado.getString("id"),
                                            resultado.getString("cuit"),
                                            resultado.getString("nombre"),
                                            resultado.getString("apellido")};
                                           
                        modelo2.addRow(oUsuario);
                        
                        this.setCuit(oUsuario[1].toString());
                        this.setVarLocalNombre(oUsuario[2].toString());
                        this.setVarLocalApellido(oUsuario[3].toString());

                    }
                    
                }catch (Exception e){
                    System.out.println(e);
                    
               }
                break;
                case 3:
                    
                while(modelo2.getRowCount()>0){
                   modelo2.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                }
                    
                try {
                    int UltimoIdFactura =  objConexionBase.buscarUltimoId();
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM FacturaDetalle WHERE id LIKE '%"+UltimoIdFactura+"%'"); 
                     

                    while (resultado.next()) {

                        Object[] oUsuario={ resultado.getString("id"),
                                            resultado.getString("cuit"),
                                            resultado.getString("nombre"),
                                            resultado.getString("apellido")};
                                           
                        modelo2.addRow(oUsuario);
                        
                        this.setCuit(oUsuario[1].toString());
                        this.setVarLocalNombre(oUsuario[2].toString());
                        this.setVarLocalApellido(oUsuario[3].toString());

                    }
                    
                }catch (Exception e){
                    System.out.println(e);
                    
               }
                break;
        }
                
       }
    
    
    
    public void setearParametrosDetalle(int Id, int opcion){  
        ConexionBase objConexionBase= new ConexionBase();
        

        
        switch(opcion){
            
            case 2:
                String[] titulos ={"idProducto", "idFactura", "producto", "cantidad"};
                DefaultTableModel modelo2 = new DefaultTableModel(null, titulos);
                while(modelo2.getRowCount()>0){
                   modelo2.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                }
                    
                try {
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM FacturaDetalle WHERE idFactura LIKE '%"+Id+"%'"); 

                    while (resultado.next()) {

                        Object[] oUsuario={ resultado.getString("idProducto"),
                                            resultado.getString("idFactura"),
                                            resultado.getString("producto"),
                                            resultado.getString("cantidad")};
                                           
                        modelo2.addRow(oUsuario);
                        
                        setCuit(oUsuario[1].toString());
                        setVarLocalNombre(oUsuario[2].toString());
                        setVarLocalApellido(oUsuario[3].toString());

                    }
                    
                }catch (Exception e){
                    System.out.println(e);
                    
               }
                break;
                case 3:
                    String[] titulos2 ={"idProducto", "idFactura", "producto", "cantidad"};
                    DefaultTableModel modelo3 = new DefaultTableModel(null, titulos2);
                while(modelo3.getRowCount()>0){
                   modelo3.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                }
                    
                try {
                    int UltimoIdFactura =  objConexionBase.buscarUltimoId();
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM FacturaDetalle WHERE idFactura LIKE '%"+UltimoIdFactura+"%'"); 
                     

                    while (resultado.next()) {

                        Object[] oUsuario={ resultado.getString("idProducto"),
                                            resultado.getString("idFactura"),
                                            resultado.getString("producto"),
                                            resultado.getString("cantidad")};
                                           
                        modelo3.addRow(oUsuario);
                        
                        setCuit(oUsuario[1].toString());
                        setVarLocalNombre(oUsuario[2].toString());
                        setVarLocalApellido(oUsuario[3].toString());

                    }
                    
                }catch (Exception e){
                    System.out.println(e);
                    
               }
                break;
        }
                
       }
    
    
    
    
    
    
    
    
    
    public void botonAgregar (int opcion, String cuit, String producto, int cantidad, int id, String nombre, String apellido) {                                           
       ConexionBase objConexionBase= new ConexionBase();
       
       
       switch (opcion){
           case 1:
               
            String StrSentenciaInsert = String.format("INSERT INTO Factura (cuit, nombre, apellido) "
               + "VALUES ('%s', '%s', '%s')", cuit, nombre, apellido);
       
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
    
    public void Editar (int id, String cuit, String nombre, String apellido, int idProducto, String producto, int cantidad, int opcion){

        ConexionBase objConexionBase= new ConexionBase();
        
        switch (opcion){
            case 1:
                String StrSentenciaInsert = String.format("UPDATE Factura SET cuit='%s', nombre='%s', apellido='%s'"
               + "WHERE id= %d", cuit, nombre, apellido, id);
       
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
                String[] titulos ={"id", "cuit", "nombre", "apellido"};
                modelo=new DefaultTableModel(null, titulos);

                while(modelo.getRowCount()>0){
                   modelo.removeRow(0); // ej cunado borre un dato no se dupliquen las celdas (limpiar o borrar las filas en la interfaz)
                }

                try {
                    ResultSet resultado= objConexionBase.consultarRegistros("SELECT * FROM Factura "); 

                    while (resultado.next()) {

                        Object[] oUsuario={ resultado.getString("id"),
                                            resultado.getString("cuit"),
                                            resultado.getString("nombre"),
                                            resultado.getString("apellido")};
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
