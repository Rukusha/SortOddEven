package com.InformationCatalyst.ProductOddEven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	private static final int[] Numbers = {1,2,3,4,5,6,7,8,9,10};
	  
	public static void main(String[] args) {
		
		even();
		odd();
		
	}
	private static String even() {
			int i = 0;
			int ProductEven = 0;
			logger.info(" Even Array");
			
			while( i < Numbers.length -1) {
				i++;
				if(Numbers[i] % 2 == 0) {
					String numberAsString = String.valueOf(Numbers[i]);
					ProductEven = ProductEven + Numbers[i];
			         logger.info(numberAsString);
			         
			    }
			}
			logger.info("Product of the even array is = " + ProductEven);
			return null;
	}
	
	private static String odd() {
		int i = 0;
		int ProductOdd = 0;
		logger.info(" odd Array");
		
		while( i < Numbers.length-1) {
			if(Numbers[i] % 2 > 0) {
				String numberAsString = String.valueOf(Numbers[i]);
				ProductOdd = ProductOdd + Numbers[i];
		         logger.info(numberAsString);
			}
			i++;
		}
		logger.info("Product of the odd array is = " + ProductOdd);
		return null;
	}
}
