package com.willcode4coffee;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HtmlManipulator {

	static Map<String,String> html_specialchars_table = new Hashtable<String,String>();
	
	static Map<String,String> html_specialchars_table2 = new Hashtable<String,String>();
	static {
	        html_specialchars_table.put("&lt;","<");
	        html_specialchars_table.put("&gt;",">");
	        html_specialchars_table.put("&amp;","&");
	        
	   	     //  Second Map 
	        
	        html_specialchars_table2.put("<","&lt;");
	        html_specialchars_table2.put(">","&gt;");
	       // html_specialchars_table2.put("&","&amp;");
	}

	static String htmlspecialchars_decode_ENT_NOQUOTES(String s) {

		Set<String> specialCharsKey = html_specialchars_table.keySet();
		// Iterate over this keys
		Iterator<String> keyIterator = specialCharsKey.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			String val = html_specialchars_table.get(key);
			s = s.replaceAll(key, val);
		}
		return s;

	}
	
	
	
	static String htmlspecialchars_encode_ENT_NOQUOTES(String program) {
		program = program.replaceAll("<","&lt;");
		program = program.replaceAll(">","&gt;");
		return program;

	}
	
	
}
