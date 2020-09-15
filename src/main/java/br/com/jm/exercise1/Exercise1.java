package br.com.jm.exercise1;

import java.util.Arrays;
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
    	if (N > 100000000) { //Número máximo 100.000.000
    		return -1;
    	}
    	if (N <= 0) { //Número negativos
    		return 0;
    	}
    	
    	String str = Integer.valueOf(N).toString();
    	char[] charArray = str.toCharArray();
    	logger.info(Arrays.toString(charArray));
    	Arrays.sort(charArray);
    	
    	StringBuilder strBuilder = new StringBuilder();
    	for (int i = charArray.length -1; i >=0; i--) {
    		strBuilder.append(charArray[i]);
		}
    	
    	
    	
    	return Integer.parseInt(strBuilder.toString());
    }
    
}
