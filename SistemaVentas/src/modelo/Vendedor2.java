
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
/**
 *
 * @author milag
 */
public class Vendedor2 {
    PreparedStatement ps;
    ResultSet rs;
    
   
    Conexion con= new Conexion();
    Connection acceder;
    
    public Vendedor Validacion(String dni,String user){
         Vendedor v=new Vendedor();
        String sql="select * from vendedor where Dni=? and User=?";
       try{
           acceder=con.Conectar();
           //le pasamos por parametro la query
           ps=acceder.prepareStatement(sql);
           ps.setString(1, dni);
           ps.setString(2,user);
           //ejecutamos
           rs=ps.executeQuery();
           while(rs.next()){
               
           }
       } catch(Exception e){
           
       }
        return v;
    }
   
    
    
    
    
}
