package br.com.jm.exercise1;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Test;

/**
 * Teste Unitário para Exercicio1
 */
public class AppTest {
	Logger logger = Logger.getLogger(AppTest.class.getName());


    @Test
    public void testApp()
    {
    	logger.info("Teste AssertEquals(321) on solution(213)");
        assertEquals(new Integer(321), new Integer(new Exercise1().solution(213)));
        
    	logger.info("Teste AssertEquals(65443) on solution(45634)");
        assertEquals(new Integer(65443), new Integer(new Exercise1().solution(45634)));
        
    	logger.info("Teste AssertEquals(-1) on solution(123456789)");
        assertEquals(new Integer(-1), new Integer(new Exercise1().solution(123456789)));
        
    	logger.info("Teste AssertEquals(98877310) on solution(39870871)");
        assertEquals(new Integer(98877310), new Integer(new Exercise1().solution(39870871)));
        
    	logger.info("Teste AssertEquals(98763222) on solution(28762392)");
        assertEquals(new Integer(98763222), new Integer(new Exercise1().solution(28762392)));
    }
}
