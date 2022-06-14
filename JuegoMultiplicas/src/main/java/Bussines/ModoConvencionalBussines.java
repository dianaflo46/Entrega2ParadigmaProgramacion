/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussines;

import Models.ModoConvencionalModel;

/**
 * Creacion de clase de modo convencional
 *14062022
 * @author Dian florez
 */
public class ModoConvencionalBussines {
   
    
/**
 * Este método se encarga de evaluar el modo de juego clasico
 * @author Diana Florez
 * @parametros parametros de entrada del metodo
 * @return true: operacion exitosa false:Operacion no exitosa 
*/
    public static boolean evaluar(ModoConvencionalModel parametros){
        boolean respuesta = true;
        
        if(parametros.getResouestaNumX1()  != 1 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX2()  != 2 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX3()  != 3 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX4()  != 4 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX5()  != 5 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX6()  != 6 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX7()  != 7 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX8()  != 8 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX9()  != 9 * parametros.getNumeroTabla() ||
           parametros.getResouestaNumX10()  != 10 * parametros.getNumeroTabla())
            return false; 
        
        
        if(parametros.getTiempoCorrecto() < parametros.getTiempoEjecutado())
            return false;
        
        return respuesta;
    } 
   
}
