//Java 8 Stream API - 03 Find the word that has the Frist highest length|| Most Asked
package com.demo.jav8;


public class Demo {
public static void main(String[] args) {
	String s="ashok@#1234";
	long letters=s.chars()
                .mapToObj(c -> (char)c)  
                .filter(Character::isLetter)
                .count();
	            
	
	long digist= s.chars()
			.mapToObj(c -> (char)c)  
            .filter(Character::isDigit)
            .count();
	        
	
	
	 long   specialcharas= s.chars()
			.mapToObj(c -> (char)c)  
            .filter(c -> !Character.isLetterOrDigit(c))
           .count();
	
	
	
	System.out.println("letters==::"+letters);
	System.out.println("digist:==:"+digist);
	System.out.println("specialcharas chars :==:"+specialcharas);
	
	
	

}
}
      
    		  