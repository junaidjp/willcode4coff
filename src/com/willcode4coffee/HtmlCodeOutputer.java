package com.willcode4coffee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class HtmlCodeOutputer {

	
	public static void main(String args[]) throws IOException { 
		String program = readFromFile();
		System.out.println(HtmlManipulator.htmlspecialchars_encode_ENT_NOQUOTES(program));
	
		
		
	}

	/**
	 * 
	 * @return
	 * @throws IOException 
	 */
	private static String readFromFile() throws IOException {
	
		
		BufferedReader reader = new BufferedReader( new FileReader ("/Users/junaidpasha/Documents/workspace/willcode4coff/src/changeprogram.txt"));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }
	    reader.close();
	    
	    return stringBuilder.toString();
		
		
	}
}
