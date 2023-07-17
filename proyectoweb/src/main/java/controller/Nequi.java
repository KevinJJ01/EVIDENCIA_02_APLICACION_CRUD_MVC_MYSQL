package controller;

/* importaciones para los servlet */
import java.io.IOException;
import javax.servlet.ServletException;
/*Estas importaciones son para utilizar las clases base proporcionadas por la API de Servlets de Java */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import model.NequiDao;
import model.NequiVo;

public class Nequi extends HttpServlet {

/* crean instancias de las clases UsuarioDao y UsuarioVo */
    
NequiDao nd= new NequiDao();
NequiVo nv= new NequiVo();



@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Entro Al Doget");
    String accion=req.getParameter("accion");/* Se obtiene el valor del parámetro "accion" de la solicitud */
    
    /* Se utiliza un switch para realizar
         diferentes acciones según el valor de la variable accion. */
        switch (accion) {

            case "abrirForm":
            abrirRecar(req,resp);
            break;

            default:
            System.out.println("NO Encontro La Variable");
                break;
            }          
    }
      

        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ENTRO AL DOPOST");
        String a=req.getParameter("accion");


        /* Se utiliza un switch para realizar 
         acciones según el valor de la variable a */
        switch (a) {
            

        } 
    }


private void abrirRecar(HttpServletRequest req, HttpServletResponse resp){

    /* try para capturar posibles excepciones/  /atch por si pasa aguna exepcion se bloquea*/
    try{
        req.getRequestDispatcher("views/registrar.jsp").forward(req, resp);/* carga y muestra la página "registrar.jsp */
        System.out.println("El Formulario de recargar Ha Sido Abierto");
    }catch(Exception e){
        System.out.println("El formulario de recargar NO ha sido abierto"+e.getMessage().toString());
    }
    }


}
