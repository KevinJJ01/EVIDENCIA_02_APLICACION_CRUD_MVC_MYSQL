package model;


/*creacion de la clase vo del paquete model */
public class NequiVo {
    

/*Atributos de usuario */
private int idBolsillo;
private float saldoNequi;
private float retiroNequi;
private float recargaNequi;
private String usuarioNequi;
private int contrasenaNequi;


/*METODOS CONSTRUCTOR SIN PARAMETROS*/
public NequiVo(){

}
/*METODOS CONSTRUCTOR CON PARAMETROS*/

public NequiVo(int idBolsillo, float saldoNequi, float retiroNequi, float recargaNequi, String usuarioNequi,
        int contrasenaNequi) {
    this.idBolsillo = idBolsillo;
    this.saldoNequi = saldoNequi;
    this.retiroNequi = retiroNequi;
    this.recargaNequi = recargaNequi;
    this.usuarioNequi = usuarioNequi;
    this.contrasenaNequi = contrasenaNequi;
}

public int getIdBolsillo() {
    return idBolsillo;
}

public void setIdBolsillo(int idBolsillo) {
    this.idBolsillo = idBolsillo;
}

public float getSaldoNequi() {
    return saldoNequi;
}

public void setSaldoNequi(float saldoNequi) {
    this.saldoNequi = saldoNequi;
}

public float getRetiroNequi() {
    return retiroNequi;
}

public void setRetiroNequi(float retiroNequi) {
    this.retiroNequi = retiroNequi;
}

public float getRecargaNequi() {
    return recargaNequi;
}

public void setRecargaNequi(float recargaNequi) {
    this.recargaNequi = recargaNequi;
}

public String getUsuarioNequi() {
    return usuarioNequi;
}

public void setUsuarioNequi(String usuarioNequi) {
    this.usuarioNequi = usuarioNequi;
}

public int getContrasenaNequi() {
    return contrasenaNequi;
}

public void setContrasenaNequi(int contrasenaNequi) {
    this.contrasenaNequi = contrasenaNequi;
}

/*GETERS SETERS */


}




