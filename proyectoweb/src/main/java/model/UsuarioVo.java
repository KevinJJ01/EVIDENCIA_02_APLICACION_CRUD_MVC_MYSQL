package model;

/*creacion de la clase vo del paquete model */
public class UsuarioVo{

/*Atributos de usuario */
private int idUsuario;
private String nombre;
private String tipoDocumento;
private int numDocumento;  
private int numCelular;
private String correo;
private String contrasena;
private boolean estado;

/*METODOS CONSTRUCTOR CON PARAMETROS*/
public UsuarioVo(int idUsuario, String nombre, String tipoDocumento, int numDocumento, int numCelular,
String correo, String contrasena, boolean estado) {
this.idUsuario = idUsuario;
this.nombre = nombre;
this.tipoDocumento = tipoDocumento;
this.numDocumento = numDocumento;
this.numCelular = numCelular;
this.correo = correo;
this.contrasena = contrasena;
this.estado = estado;
}

/*METODO CONSTRUCTOR SIN PARAMETROS */
public UsuarioVo() {
}

/*METODO ACCESORES */  
public int getIdUsuario() {
    return idUsuario;
}
public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getTipoDocumento() {
    return tipoDocumento;
}
public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
}
public int getNumDocumento() {
    return numDocumento;
}
public void setNumDocumento(int numDocumento) {
    this.numDocumento = numDocumento;
}
public int getNumCelular() {
    return numCelular;
}
public void setNumCelular(int numCelular) {
    this.numCelular = numCelular;
}
public String getCorreo() {
    return correo;
}
public void setCorreo(String correo) {
    this.correo = correo;
}
public String getContrasena() {
    return contrasena;
}
public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
}
public boolean isEstado() {
    return estado;
}
public void setEstado(boolean estado) {
    this.estado = estado;
}
} 

    