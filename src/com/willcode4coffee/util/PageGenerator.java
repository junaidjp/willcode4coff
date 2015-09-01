package com.willcode4coffee.util;



import java.util.List;


import com.willcode4coffee.HtmlManipulator;

public class PageGenerator {
	
	/**
	 * 
	 * @param headline
	 * @param programText
	 * @return
	 */
	public static String generateProgramBlock(String headline,String programText,String programnotes) { 
		
		StringBuilder programBlock = new StringBuilder();
		String changedProgram	= HtmlManipulator.htmlspecialchars_encode_ENT_NOQUOTES(programText);
		programBlock.append("<p></p>");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append("<h2>"+headline+"</h2>");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append("<div style=\"border: 1px solid black;\">");
		programBlock.append("<pre class=\"prettyprint\"><code class=\"language-java\">");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append(changedProgram);
		programBlock.append("</code></pre></div>");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append("<div id=\"result\">");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append("<p>");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append(programnotes);
		programBlock.append("</p>");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append("</div>");
		programBlock.append("<p></p>");
		programBlock.append(System.getProperty("line.separator"));
		programBlock.append(System.getProperty("line.separator"));
		return programBlock.toString();
		
		
	}

	/**
	 * 
	 * @param welcomemessage
	 * @param thingsweneed
	 * @return
	 */
	public static String generateHeaderBlock(String welcomemessage,String introduction,
			String[] technologies) {
		
		StringBuilder headerBlock = new StringBuilder();
		headerBlock.append("<p></p>");
		headerBlock.append("<h2>"+welcomemessage+"</h2>");
		headerBlock.append(System.getProperty("line.separator"));
		headerBlock.append("<div id=\"result\">");
		headerBlock.append(System.getProperty("line.separator"));
		headerBlock.append("<p>");
		headerBlock.append(introduction);
		headerBlock.append("</p>");
		headerBlock.append("</div>");
		headerBlock.append(System.getProperty("line.separator"));
		headerBlock.append("<h2>Things we need </h2>");
		headerBlock.append(System.getProperty("line.separator"));
		headerBlock.append("<ul type=\"circle\">");
		headerBlock.append(System.getProperty("line.separator"));
		for(int index = 0 ; index <  technologies.length ; index ++) { 
			headerBlock.append("<li>"+technologies[index]+ "</li>");
			headerBlock.append(System.getProperty("line.separator"));
		}
		headerBlock.append("</ul>");
		headerBlock.append("<p></p>");
		headerBlock.append(System.getProperty("line.separator"));
		headerBlock.append(System.getProperty("line.separator"));
		
		return headerBlock.toString();
	}

	
	/**
	 * <div id="imagesnap">
	 <h2>Finally check if the Schema was created</h2>
	    <p:graphicImage library="images/jdo/createschema" name="dbcreatedcheck.png" alt="Some of the Jars you need" title="Some of the Jars you need"/>
	</div>
	 * 
	 * 
	 * 
	 */
	
	/**
	 * 
	 * @param imagessectionone
	 * @param imagessectiontwo
	 * @param imagessectionthree
	 * @param imagessectionfour
	 * @return
	 */
	public static String generateImagesBlock(
			List<String> imagesblock) 
 {
		StringBuilder imagesSection = new StringBuilder();
		if (!imagesblock.isEmpty()) {
			imagesSection.append("<p></p>");
			imagesSection.append("<div id=\"imagesnap\">");
			imagesSection.append("<h2>" + imagesblock.get(0) + "</h2>");
			imagesSection.append(System.getProperty("line.separator"));
			imagesSection.append("<p:graphicImage library=\"images/"+imagesblock.get(2)+"\"        name=\""+imagesblock.get(1)+".png\"/>");
			imagesSection.append(System.getProperty("line.separator"));
			imagesSection.append("</div>");
			imagesSection.append(System.getProperty("line.separator"));
			imagesSection.append(System.getProperty("line.separator"));
			imagesSection.append("<p></p>");
			
		}

		return imagesSection.toString();
	}

	/**
	 * 
	 * @param stepsforthisprogram
	 * @return
	 * 
	 * 
	<h2>Steps to achieve our Goal</h2>
	<ul type="circle">
		<li>Step 1 : Create a Eclipse Maven Project</li>
		<li>Step 2 : Create a Database in MySQL</li>
		<li>Step 3 : Load all JDO, DataNucleus Jars using Mavens pom.xml</li>
		<li>Step 4 : Write the Java Classes</li>
		<li>Step 5 : Define persistence.xml</li>
		<li>Step 6 : Compile using Maven</li>
		<li>Step 7 : Enhance this classes using DataNuclues maven plugin</li>
		<li>Step 8 : Execute the Schema Tool using DataNuclues maven Plugin</li>
	</ul>
	 * 
	 * 
	 */
	public static String generatestepsBlock(String stepsforthisprogram) {
		
		StringBuilder stepsSection = new StringBuilder();
		if (stepsforthisprogram.length() > 0 ) { 
			String[] stepsTokens = stepsforthisprogram.split(",");
			stepsSection.append(System.getProperty("line.separator"));
			stepsSection.append(System.getProperty("line.separator"));
			stepsSection.append("<p></p>");
			stepsSection.append("<h2>Steps to achieve our Goal</h2>");
			stepsSection.append(System.getProperty("line.separator"));
			stepsSection.append("<ul type=\"circle\">");
			stepsSection.append(System.getProperty("line.separator"));
			for(int i = 0 ; i< stepsTokens.length ; i ++) { 
				
				stepsSection.append("<li> Step "+ (i+1) + " : " +stepsTokens[i]+ "</li>");
				stepsSection.append(System.getProperty("line.separator"));
			}
			stepsSection.append(System.getProperty("line.separator"));
			stepsSection.append("</ul>");
			
		}
		stepsSection.append("<p></p>");
		stepsSection.append(System.getProperty("line.separator"));
		stepsSection.append(System.getProperty("line.separator"));
		return stepsSection.toString();
	}

}
