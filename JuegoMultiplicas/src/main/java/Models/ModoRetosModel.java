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
public class ModoRetosModel {
/** Numero 1 de la multiplicacion */
   private int numero1; 
/** Numero 2 de la multiplicacion */
    private int numero2;
/** Respuesta de la multiplicacion */
    private int respuesta;
/** Contructor vacio */
    public ModoRetosModel() {
    }
/** Constructor con sus respectivos parametros */
    public ModoRetosModel(int numero1, int numero2, int respuesta) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.respuesta = respuesta;
    }
/** get y set*/
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }  
}
