/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class CalcuTest {
    
    public CalcuTest() {
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
     * Test of main method, of class Calcu.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calcu.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of binariaa method, of class Calcu.
     */
    @Test
    public void testBinariaa() {
        System.out.println("binariaa");
        float a = 0.0F;
        float b = 0.0F;
        int operacion = 0;
        float expResult = 0.0F;
        float result = Calcu.binariaa(a, b, operacion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unitaria method, of class Calcu.
     */
    @Test
    public void testUnitaria() {
        System.out.println("unitaria");
        float a = 0.0F;
        int operacion = 0;
        float expResult = 0.0F;
        float result = Calcu.unitaria(a, operacion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @test 
    public void divisionPorCero(){
    System.out.println("divisionporcero");
    float a = 0.0F;
    int operacion = 0;
    
    }
    
    
}
