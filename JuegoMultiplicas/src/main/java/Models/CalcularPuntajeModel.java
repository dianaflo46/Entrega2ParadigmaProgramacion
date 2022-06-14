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
public class CalcularPuntajeModel{
/** Numero de aciertos */
   private int numeroDeAciertos ;
/** Numero de aciertos correctos del usuario */
   private int valor; 

   //constructor vacio
    public CalcularPuntajeModel() {
    }

    //Constructor con parametros
    public CalcularPuntajeModel(int numeroDeAciertos, int valor) {
        this.numeroDeAciertos = numeroDeAciertos;
        this.valor = valor;
    }
   
   
    //Get and set de las propiedades
    public int getNumeroDeAciertos() {
        return numeroDeAciertos;
    }

    public void setNumeroDeAciertos(int numeroDeAciertos) {
        this.numeroDeAciertos = numeroDeAciertos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
   
    
}
