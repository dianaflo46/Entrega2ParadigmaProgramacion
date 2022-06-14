/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 * Creacion de modelo
 *14062022
 * @author Dian florez
 */
public class ModoConvencionalModel {
/** Respuesta de la tabla multiplicado * 1   */ 
   private int resouestaNumX1;
/** Respuesta de la tabla multiplicado * 2   */ 
   private int resouestaNumX2;
/** Respuesta de la tabla multiplicado * 3   */    
   private int resouestaNumX3;
/** Respuesta de la tabla multiplicado * 4   */ 
   private int resouestaNumX4;
/** Respuesta de la tabla multiplicado * 5   */ 
   private int resouestaNumX5;
/** Respuesta de la tabla multiplicado * 6   */ 
   private int resouestaNumX6;
/** Respuesta de la tabla multiplicado * 7   */ 
   private int resouestaNumX7;
/** Respuesta de la tabla multiplicado * 8   */ 
   private int resouestaNumX8;
/** Respuesta de la tabla multiplicado * 9   */ 
   private int resouestaNumX9;
/** Respuesta de la tabla multiplicado * 10   */ 
   private int resouestaNumX10; 
/**  numero de tabla   */ 
   private int numeroTabla;
/** Respuesta del tiempo ejecutado   */    
   private int tiempoEjecutado;
/** Respuesta del tiempo correcto   */ 
   private int tiempoCorrecto;  
/**  tabla multiplicado * 2   */ 
   private boolean tablaCorrecta;

/** Contructor vacio  */ 
   public ModoConvencionalModel() {
   }
/** Constructor con todos los parametros   */ 
    public ModoConvencionalModel(int resouestaNumX1, int resouestaNumX2, int resouestaNumX3, int resouestaNumX4, int resouestaNumX5, int resouestaNumX6, int resouestaNumX7, int resouestaNumX8, int resouestaNumX9, int resouestaNumX10, int numeroTabla, int tiempoEjecutado, int tiempoCorrecto, boolean tablaCorrecta) {
        this.resouestaNumX1 = resouestaNumX1;
        this.resouestaNumX2 = resouestaNumX2;
        this.resouestaNumX3 = resouestaNumX3;
        this.resouestaNumX4 = resouestaNumX4;
        this.resouestaNumX5 = resouestaNumX5;
        this.resouestaNumX6 = resouestaNumX6;
        this.resouestaNumX7 = resouestaNumX7;
        this.resouestaNumX8 = resouestaNumX8;
        this.resouestaNumX9 = resouestaNumX9;
        this.resouestaNumX10 = resouestaNumX10;
        this.numeroTabla = numeroTabla;
        this.tiempoEjecutado = tiempoEjecutado;
        this.tiempoCorrecto = tiempoCorrecto;
        this.tablaCorrecta = tablaCorrecta;
    }
/** Sona de get y set   */ 
    public int getResouestaNumX1() {
        return resouestaNumX1;
    }

    public void setResouestaNumX1(int resouestaNumX1) {
        this.resouestaNumX1 = resouestaNumX1;
    }

    public int getResouestaNumX2() {
        return resouestaNumX2;
    }

    public void setResouestaNumX2(int resouestaNumX2) {
        this.resouestaNumX2 = resouestaNumX2;
    }

    public int getResouestaNumX3() {
        return resouestaNumX3;
    }

    public void setResouestaNumX3(int resouestaNumX3) {
        this.resouestaNumX3 = resouestaNumX3;
    }

    public int getResouestaNumX4() {
        return resouestaNumX4;
    }

    public void setResouestaNumX4(int resouestaNumX4) {
        this.resouestaNumX4 = resouestaNumX4;
    }

    public int getResouestaNumX5() {
        return resouestaNumX5;
    }

    public void setResouestaNumX5(int resouestaNumX5) {
        this.resouestaNumX5 = resouestaNumX5;
    }

    public int getResouestaNumX6() {
        return resouestaNumX6;
    }

    public void setResouestaNumX6(int resouestaNumX6) {
        this.resouestaNumX6 = resouestaNumX6;
    }

    public int getResouestaNumX7() {
        return resouestaNumX7;
    }

    public void setResouestaNumX7(int resouestaNumX7) {
        this.resouestaNumX7 = resouestaNumX7;
    }

    public int getResouestaNumX8() {
        return resouestaNumX8;
    }

    public void setResouestaNumX8(int resouestaNumX8) {
        this.resouestaNumX8 = resouestaNumX8;
    }

    public int getResouestaNumX9() {
        return resouestaNumX9;
    }

    public void setResouestaNumX9(int resouestaNumX9) {
        this.resouestaNumX9 = resouestaNumX9;
    }

    public int getResouestaNumX10() {
        return resouestaNumX10;
    }

    public void setResouestaNumX10(int resouestaNumX10) {
        this.resouestaNumX10 = resouestaNumX10;
    }

    public int getNumeroTabla() {
        return numeroTabla;
    }

    public void setNumeroTabla(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public int getTiempoEjecutado() {
        return tiempoEjecutado;
    }

    public void setTiempoEjecutado(int tiempoEjecutado) {
        this.tiempoEjecutado = tiempoEjecutado;
    }

    public int getTiempoCorrecto() {
        return tiempoCorrecto;
    }

    public void setTiempoCorrecto(int tiempoCorrecto) {
        this.tiempoCorrecto = tiempoCorrecto;
    }

    public boolean isTablaCorrecta() {
        return tablaCorrecta;
    }

    public void setTablaCorrecta(boolean tablaCorrecta) {
        this.tablaCorrecta = tablaCorrecta;
    }
   
}
