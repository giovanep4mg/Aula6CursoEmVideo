/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aula6cursoemvideo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author giova
 */
public class ControleRemotoTest {
    
    public ControleRemotoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getVolume method, of class ControleRemoto.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        ControleRemoto instance = new ControleRemoto();
        int expResult = 0;
        int result = instance.getVolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVolume method, of class ControleRemoto.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        int volume = 0;
        ControleRemoto instance = new ControleRemoto();
        instance.setVolume(volume);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLigado method, of class ControleRemoto.
     */
    @Test
    public void testIsLigado() {
        System.out.println("isLigado");
        ControleRemoto instance = new ControleRemoto();
        boolean expResult = false;
        boolean result = instance.isLigado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLigado method, of class ControleRemoto.
     */
    @Test
    public void testSetLigado() {
        System.out.println("setLigado");
        boolean ligado = false;
        ControleRemoto instance = new ControleRemoto();
        instance.setLigado(ligado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTocando method, of class ControleRemoto.
     */
    @Test
    public void testIsTocando() {
        System.out.println("isTocando");
        ControleRemoto instance = new ControleRemoto();
        boolean expResult = false;
        boolean result = instance.isTocando();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTocando method, of class ControleRemoto.
     */
    @Test
    public void testSetTocando() {
        System.out.println("setTocando");
        boolean tocando = false;
        ControleRemoto instance = new ControleRemoto();
        instance.setTocando(tocando);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ligar method, of class ControleRemoto.
     */
    @Test
    public void testLigar() {
        System.out.println("ligar");
        ControleRemoto instance = new ControleRemoto();
        instance.ligar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desligar method, of class ControleRemoto.
     */
    @Test
    public void testDesligar() {
        System.out.println("desligar");
        ControleRemoto instance = new ControleRemoto();
        instance.desligar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abrirMenu method, of class ControleRemoto.
     */
    @Test
    public void testAbrirMenu() {
        System.out.println("abrirMenu");
        ControleRemoto instance = new ControleRemoto();
        instance.abrirMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharMenu method, of class ControleRemoto.
     */
    @Test
    public void testFecharMenu() {
        System.out.println("fecharMenu");
        ControleRemoto instance = new ControleRemoto();
        instance.fecharMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maisVolume method, of class ControleRemoto.
     */
    @Test
    public void testMaisVolume() {
        System.out.println("maisVolume");
        ControleRemoto instance = new ControleRemoto();
        instance.maisVolume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
