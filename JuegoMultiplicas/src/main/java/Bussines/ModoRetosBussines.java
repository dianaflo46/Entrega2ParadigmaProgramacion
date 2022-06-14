/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussines;

import Models.CalcularPuntajeModel;
import Models.ModoRetosModel;

/**
 * Creacion de clase de modo juego retos
 *14062022
 * @author Dian florez
 */
public class ModoRetosBussines {
   /**
    * Este método se encarga de evaluar el modo de juego retos
    * @author Diana Florez
    * @parametros parametros de entrada del metodo
    * @return true: operacion exitosa false:Operacion no exitosa 
    */  
     public static boolean evaluar(ModoRetosModel parametros)
     {
      if (parametros.getRespuesta()== parametros.getNumero1()* parametros.getNumero2())
         return true;
      else 
          return false; 
     }
    /**
    * Este método se encarga de calcular el puntaje 
    * @author Diana Florez
    * @parametros parametros de entrada del metodo
    * @return cantidad de puntos obtenidos
    */  
     public static int calcularPuntaje (CalcularPuntajeModel parametros)
     {
        return parametros.getNumeroDeAciertos()* parametros.getValor(); 
     }
}
