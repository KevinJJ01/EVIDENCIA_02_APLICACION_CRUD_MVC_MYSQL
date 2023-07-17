package model;
/*Clase Conexion del paquete modelo*/

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

/*CREAR LOS ATRIBUTOS Y DECLARARLE LOS VALORES */

private static final String bd="jdbc:mysql://localhost:3306/bolsilloweb";/*url user pasword */
private static final String usuario="root";
private static final String password="";
private static Connection con;

/*Crear El Metodo De Conexion */

public static Connection conectar() {

    /*try sirve para que ejecute y si no funciona mostrara la exepcion */
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(bd,usuario,password);/*url user pasword */
        System.out.println("Conexion Exitosa");/*sysout con traera un ejecutable  */
    } catch (Exception e) {
        System.out.println("Error De Conexion A la Base De Datos"+e.getMessage().toString());  
    }
    return con;

}









    
    
}
