/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Bussines;

import Models.ModoConvencionalModel;
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
public class ModoConvencionalBussinesTest {
    
    public ModoConvencionalBussinesTest() {
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
     * Test of evaluar method, of class ModoConvencionalBussines.
     */
    @Test
    public void testEvaluar() {
        System.out.println("evaluar");
        ModoConvencionalModel parametros = new ModoConvencionalModel(6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 6, 30, 60, true);
        boolean result = ModoConvencionalBussines.evaluar(parametros);
        // TODO review the generated test code and remove the default call to fail.
        if(result)
          System.out.println("Los datos ingresados en la tabla son correctos");
        else
          System.out.println("Los datos ingresados en la tabla son incorrectos");
    }
    
}
