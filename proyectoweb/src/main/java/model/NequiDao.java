package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class NequiDao {

public class UsuarioDao {

     
/* Atributos para realizar operaciones sobre la BD */
Connection con; //objeto de conexión
PreparedStatement ps; //preparar sentencias
ResultSet rs; // almacenar consutas
String sql=null;
int r; //cantidad de filas que devuelve una sentencia
UsuarioVo nequVoi;
    


/*METODO PARA REGiSTRAR UN NUEVO USUARIO */
public int recargar(NequiVo neq) throws SQLException{
    sql="INSERT INTO nequi(recargaNe) values(?)";
    try {
        con=Conexion.conectar();//ABRIR CONEXION
        ps=con.prepareStatement(sql);//PREAPARAR SENTENCIA
            
        ps.setFloat(1,neq.getRecargaNequi());
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("Recargando exitosamente");
    }catch(Exception e){
        System.out.println("Error en el regisro "+e.getMessage().toString());
    }
    finally{
        con.close();//cerrando conexión
    }
    return r;
}

}

}