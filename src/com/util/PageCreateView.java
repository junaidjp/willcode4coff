package com.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import com.willcode4coffee.util.PageGenerator;

@ManagedBean(name="generator")
public class PageCreateView {
	
	public String directoryname;

	public String getDirectoryname() {
		return directoryname;
	}


	public void setDirectoryname(String directoryname) {
		this.directoryname = directoryname;
	}





	public String imageheadline;
	public String imagename;
	
	
	
	
	public String topicName;
	public String welcomemessage;
	public String introduction;
	
	
	public String stepsforthisprogram;

	




	public String programtext;
	public String headline;
	public String notes;
	
	
	private String[] selectedtechnologies;   
	private List<String> technologies;
	

	
	
	
	public String getStepsforthisprogram() {
		return stepsforthisprogram;
	}


	public void setStepsforthisprogram(String stepsforthisprogram) {
		this.stepsforthisprogram = stepsforthisprogram;
	}
	
	
	
	
	public String getIntroduction() {
		return introduction;
	}


	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	
	
	
	public String getWelcomemessage() {
		return welcomemessage;
	}


	public void setWelcomemessage(String welcomemessage) {
		this.welcomemessage = welcomemessage;
	}



	public String getTopicName() {
		return topicName;
	}


	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
		@PostConstruct
	    public void init() {
	    
			technologies = new ArrayList<String>();
	    	technologies.add("Eclipse");
	    	technologies.add("Maven");
	    	technologies.add("MySql WorkBench");
	    	technologies.add("DBWeaver (Optional)");
	    	technologies.add("Spring");
	    	technologies.add("JSF Primaces");
	    	technologies.add("Active MQ 5.10.0");
	    	technologies.add("Tomcat");
	    	
	    }

		public String[] getSelectedtechnologies() {
			return selectedtechnologies;
		}

		public void setSelectedtechnologies(String[] selectedtechnologies) {
			this.selectedtechnologies = selectedtechnologies;
		}

		public List<String> getTechnologies() {
			return technologies;
		}

		public void setTechnologies(List<String> technologies) {
			this.technologies = technologies;
		}
	 
	
	
	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getHeadline() {
		return headline;
	}


	public void setHeadline(String headline) {
		this.headline = headline;
	}


	public String getProgramtext() {
		return programtext;
	}


	public void setProgramtext(String programtext) {
		this.programtext = programtext;
	}

	
	public String getImageheadline() {
		return imageheadline;
	}


	public void setImageheadline(String imageheadline) {
		this.imageheadline = imageheadline;
	}


	public String getImagename() {
		return imagename;
	}


	public void setImagename(String imagename) {
		this.imagename = imagename;
	}



	/**
	 * 
	 * @return
	 */
	public String submitheadersection() { 
		System.out.println(welcomemessage);
		String headerBlock = PageGenerator.generateHeaderBlock(welcomemessage,introduction,selectedtechnologies);
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("/moneymaking/temppage/"+topicName+".txt"), "utf-8"))) {
	   writer.write(headerBlock);
	}
		catch(Exception ex) { 
			ex.printStackTrace();
		}
		
		return headerBlock;
	}
	
	
	
	public String submitTopicname() { 
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("/moneymaking/temppage/"+topicName+".txt"), "utf-8"))) {
	   writer.write(" ");
	}
		catch(Exception ex) { 
			ex.printStackTrace();
		}
		return "file created";
	}
	
	/**
	 * 
	 * @return
	 */
	public String submitProgram() { 
		
		System.out.println(headline);
		String programBlock = PageGenerator.generateProgramBlock(headline,programtext,notes);
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/moneymaking/temppage/"+topicName+".txt", true)))) {
		    out.println(programBlock);
		  } catch (IOException ex) {
		    
			  ex.printStackTrace();
		}
		
		
		System.out.println(programBlock);
		return null;
	}
	
	
	
	

	/**
	 * 
	 * @return
	 */
	public String submitImagesBlock() { 
		
		List<String> imagesBlock = new ArrayList<String>();
		imagesBlock.add(imageheadline);
		imagesBlock.add(imagename);
		imagesBlock.add(directoryname);
		
	
		
		String programBlock = PageGenerator.generateImagesBlock(imagesBlock);
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/moneymaking/temppage/"+topicName+".txt", true)))) {
		    out.println(programBlock);
		  } catch (IOException ex) {
		    
			  ex.printStackTrace();
		}
		
		
		System.out.println(programBlock);
		return null;
	}
	
	
	
	

	/**
	 * 
	 * @return
	 */
	public String submitStepsForthisProgram() { 
		String stepsBlock = PageGenerator.generatestepsBlock(stepsforthisprogram);
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/moneymaking/temppage/"+topicName+".txt", true)))) {
		    out.println(stepsBlock);
		  } catch (IOException ex) {
		    
			  ex.printStackTrace();
		}
		
		
		System.out.println(stepsBlock);
		return null;
	}
	
	
	
}
