/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Bussines;

import Models.CalcularPuntajeModel;
import Models.ModoRetosModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Creacion de test
 *14062022
 * @author Dian florez
 */
public class ModoRetosBussinesTest {
    
    public ModoRetosBussinesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of evaluar method, of class ModoRetosBussines.
     */
    @Test
    public void testEvaluar() {
        System.out.println("evaluar");
        ModoRetosModel parametros = new ModoRetosModel(5, 6, 30);
        boolean result = ModoRetosBussines.evaluar(parametros);
        // TODO review the generated test code and remove the default call to fail.
        if(result)
            System.out.println("Operación exitosa");
        else
            System.out.println("Operacion no exitosa");
    }        
    
    /**
     * Test of evaluar method, of class CalcularPuntaje.
     */
    @Test
    public void testCalcularPuntaje() {
        System.out.println("calcular");
        CalcularPuntajeModel parametros = new CalcularPuntajeModel(5, 10);
        int result = ModoRetosBussines.calcularPuntaje(parametros);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("El puntaje calculado es :" + result);
    }
    
    /**
     * Test of evaluar method, of class SimulaModoRetos.
     */
    @Test
    public void testSimulaModoRetos() {
        System.out.println("Modo retos simulador");
        int contador = 0;
        int valorPuntos = 10;
        ModoRetosModel parametrosRetos1 = new ModoRetosModel(5, 6, 30);
        if( ModoRetosBussines.evaluar(parametrosRetos1))
            contador++;
         ModoRetosModel parametrosRetos2 = new ModoRetosModel(8, 4, 32);
        if( ModoRetosBussines.evaluar(parametrosRetos2))
            contador++;
         ModoRetosModel parametrosRetos3 = new ModoRetosModel(9, 7, 63);
        if( ModoRetosBussines.evaluar(parametrosRetos3))
            contador++;
         ModoRetosModel parametrosRetos4 = new ModoRetosModel(8, 2, 16);
        if( ModoRetosBussines.evaluar(parametrosRetos4))
            contador++;
         ModoRetosModel parametrosRetos5 = new ModoRetosModel(7, 9, 64);
        if( ModoRetosBussines.evaluar(parametrosRetos5))
            contador++;
        
        CalcularPuntajeModel parametros = new CalcularPuntajeModel(contador, valorPuntos);
        int result = ModoRetosBussines.calcularPuntaje(parametros);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("El puntaje calculado es :" + result);
        System.out.println("De 5 respuestas validas el usuario obtuvo  :" + contador);
    }
    
    
}
