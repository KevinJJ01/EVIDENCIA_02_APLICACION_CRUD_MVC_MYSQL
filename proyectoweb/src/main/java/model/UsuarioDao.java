package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
     
/* Atributos para realizar operaciones sobre la BD */
Connection con; //objeto de conexión
PreparedStatement ps; //preparar sentencias
ResultSet rs; // almacenar consutas
String sql=null;
int r; //cantidad de filas que devuelve una sentencia
UsuarioVo usuarioVo;

/*METODO PARA REGiSTRAR UN NUEVO USUARIO */
public int registrarse(UsuarioVo usu) throws SQLException{
    sql="INSERT INTO usuario(nombre,tipoDocumento,numDocumento,numCelular,correo,contrasena,estado) values(?,?,?,?,?,?,?)";
    try {
        con=Conexion.conectar();//ABRIR CONEXION
        ps=con.prepareStatement(sql);//PREAPARAR SENTENCIA
            
        ps.setString(1,usu.getNombre());
        ps.setString(2,usu.getTipoDocumento());
        ps.setInt(3,usu.getNumDocumento()); 
        ps.setInt(4,usu.getNumCelular());  
        ps.setString(5,usu.getCorreo());  
        ps.setString(6,usu.getContrasena());
        ps.setBoolean(7,usu.isEstado());
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("COMPLETASTE EL");
    }catch(Exception e){
        System.out.println("Error en el regisro "+e.getMessage().toString());
    }
    finally{
        con.close();//cerrando conexión
    }
    return r;
}
   
public List<UsuarioVo> listar() throws SQLException{
    List<UsuarioVo> usuario=new ArrayList<>();
    sql="SELECT * from usuario";
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);

        while(rs.next()){
            UsuarioVo r=new UsuarioVo();
            //Escribir  en el setter cada valor encontrado
            r.setIdUsuario(rs.getInt("idUsuario"));
            r.setNombre(rs.getString("nombre"));
            r.setTipoDocumento(rs.getString("tipoDocumento"));
            r.setNumDocumento(rs.getInt("numDocumento"));
            r.setNumCelular(rs.getInt("numCelular"));
            r.setCorreo(rs.getString("correo"));
            r.setContrasena(rs.getString("contrasena"));
            r.setEstado(rs.getBoolean("estado"));
            usuario.add(r);
        }
        ps.close();
        System.out.println("consulta exitosa");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
    }
    finally{
        con.close();
    }
    return usuario;
}

public List<UsuarioVo> listarUsuario(int id) throws SQLException{
    List<UsuarioVo> usuario=new ArrayList<>();
    sql="SELECT * from usuario where idUsuario = ?";
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        rs=ps.executeQuery();

        while(rs.next()){
            UsuarioVo r=new UsuarioVo();
            //Escribir  en el setter cada valor encontrado
            r.setIdUsuario(rs.getInt("idUsuario"));
            r.setNombre(rs.getString("nombre"));
            r.setTipoDocumento(rs.getString("tipoDocumento"));
            r.setNumDocumento(rs.getInt("numDocumento"));
            r.setNumCelular(rs.getInt("numCelular"));
            r.setCorreo(rs.getString("correo"));
            r.setContrasena(rs.getString("contrasena"));
            r.setEstado(rs.getBoolean("estado"));
            usuario.add(r);
        }
        ps.close();
        System.out.println("consulta exitosa");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
    }
    finally{
        con.close();
    }
    return usuario;
}

public int editar(UsuarioVo usu) throws SQLException{
    sql="UPDATE usuario SET nombre=?, tipoDocumento=?, numDocumento=?, numCelular=?,  correo=?, contrasena=? WHERE idUsuario=?;";
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);  
        ps.setString(1,usu.getNombre());
        ps.setString(2,usu.getTipoDocumento());
        ps.setInt(3,usu.getNumDocumento()); 
        ps.setInt(4,usu.getNumCelular());  
        ps.setString(5,usu.getCorreo());  
        ps.setString(6,usu.getContrasena());  
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("EDITASTE CORRECTAMENTE");
    }catch(Exception e){
        System.out.println("Error en el regisro "+e.getMessage().toString());
    }
    finally{
        con.close();//cerrando conexión
    }
    return r;
}
//VALIDAR LOGIN
public int validar(UsuarioVo usu) throws SQLException{
    int r = 0;
    sql="select * from usuario where numCelular=? and contrasena=? ";
        try {
        con=Conexion.conectar();//ABRIR CONEXION
        ps=con.prepareStatement(sql);//PREAPARAR SENTENCIA
        ps.setInt(1,usu.getNumCelular());
        ps.setString(2,usu.getContrasena());
        System.out.println(ps);
        rs = ps.executeQuery();
        while(rs.next()) {
                r = r + 1;
                usu.setNumCelular(rs.getInt("numCelular"));
                usu.setContrasena(rs.getString("contrasena"));
            }
            if (r==1) {
                return 1;
            } else {
                return 0;
            }
    }catch(Exception e){
        System.out.println("Error en el consultar "+e.getMessage().toString());
    }
    finally{
        con.close();//cerrando conexión
    }
    return r;
    
}
}
