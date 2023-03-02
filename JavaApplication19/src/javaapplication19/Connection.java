/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

/**
 *
 * @author Dell
 */
public class Connection {
    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject ();

    public Connection(){
        Mongo mongo = new Mongo("localhost",27017);
        BaseDatos =mongo.getDB("crudMongo1");
        coleccion =BaseDatos.getCollection("Autos");
        System.out.println("Conexion exitosa");
        
    }
    
//    public Connection(){
//        try{
//            Mongo mongo = new Mongo("localhost",27017);
//            BaseDatos =mongo.getDB("Actividades502");
//            coleccion =BaseDatos.getCollection("Actividades502");
//            System.out.println("Conexion exitosa");
//        }catch(UnknownHostException ex){
//            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
//        }
//        
//    }
    
    public boolean insertar(String accion){
        document.put("accion",accion);
        coleccion.insert(document);
        return true;
    }
    public void Mostrar(){
        DBCursor cursor = coleccion.find();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean Actualizar(String accionVieja, String accionNueva){
        
        document.put("accion", accionVieja);
        BasicDBObject documentoNuevo = new BasicDBObject();
        documentoNuevo.put("accion", accionNueva);
        coleccion.findAndModify(document, documentoNuevo);
        return true;
    }
    
    public boolean Eliminar(String accion){
        document.put("accion", accion);
        coleccion.remove(document);
        return true;
    }
    
}
