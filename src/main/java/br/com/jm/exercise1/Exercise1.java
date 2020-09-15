package br.com.jm.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;



/**
 * Hello world!
 *
 */
public class Exercise1 
{
	Logger logger = Logger.getLogger(Exercise1.class.getName());
    
    public int solution(int N) {
		logger.info(String.format("N = %d", N));
		
    	if (N <= 0) { //Número negativo
    		logger.info("Número Negativo");
    		return 0;
    	}
    	
    	if (N > 100000000) { //Número máximo 100.000.000 -- Não se faz necessário verificar após o resultado, aqui já pega.
    		logger.info("Número maior que 100.000.000");
    		return -1;
    	}
    	
    	String str = Integer.valueOf(N).toString();
    	char[] charArray = str.toCharArray(); //Transforma num array de caracteres
    	logger.info(Arrays.toString(charArray));
    	Arrays.sort(charArray);//Ordena os números
    	
    	
    	StringBuilder strBuilder = new StringBuilder();
    	
    	for (int i = charArray.length -1; i >=0; i--) {//Reverte a ordem
    		strBuilder.append(charArray[i]);
		}
    	
    	int result = Integer.parseInt(strBuilder.toString());
    			

    	
    	return result;
    }
    
}
