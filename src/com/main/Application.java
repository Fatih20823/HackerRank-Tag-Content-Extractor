package com.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	 Pattern p = Pattern.compile("<(.+)>(([^<>]+))</\\1>");
             Matcher matcher = p.matcher(line);
               
            int count = 0;  
             
            while (matcher.find() == true){              // input(stdin)
            	
                System.out.println(matcher.group(2));    // 4
                                                         // <h1>Nayeem loves counseling</h1>
                count++;                                 // <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>
            }                                            // <Amee>safat codes like a ninja</amee>
            if (count == 0) {  							 // <SA premium>Imtiaz has a secret crash</SA premium>
                System.out.println("None");  
            }  											 // Expected Output
            
                                                         // Nayeem loves counseling
              testCases--;                               // Sanjay has no watch
        }                                                // None
		                                                 // Imtiaz has a secret crash
		in.close();                                              

	}
	
	
	
	
}
