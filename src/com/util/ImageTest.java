package com.util;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

/*
 * @author mkyong
 *
 */
public class ImageTest {

	private static final int IMG_WIDTH = 100;
	private static final int IMG_HEIGHT = 100;
	
	public static void main(String [] args){
		
	try{
		
		File path = new File("/learning/imagesresize");
		List<BufferedImage> imageCollection = new ArrayList<BufferedImage>();
		Map<String,BufferedImage> bufferedImagesmap = null;
		File [] files = path.listFiles();
		for (int i = 0; i < files.length; i++){
		    if (files[i].isFile()) { //this line weeds out other directories/folders
		    	
		    	imageCollection.add(loadImages(files[i]));
		    }
		}
		
		
		bufferedImagesmap = populateImageMap(imageCollection,files);
			
		for(Map.Entry<String,BufferedImage> entry : bufferedImagesmap.entrySet()){
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		} 
		
		
				
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
		
    }
	
	
	
	
	
	/**
	 * 
	 * @param imageCollection
	 * @param files
	 * @return
	 */
   private static Map<String, BufferedImage> populateImageMap(
			List<BufferedImage> imageCollection, File[] files) {
		
	   Map<String,BufferedImage> bufferedImageMap = new HashMap<String,BufferedImage>();
		for(int imageIndex = 0 ; imageIndex  < imageCollection.size() ; imageIndex ++) { 
			
			bufferedImageMap.put(files[imageIndex+1].getName(), imageCollection.get(imageIndex));
		}
	   
		return bufferedImageMap;
	}

/**
    * 
    * @param file
    * @return
    */
	
	private static BufferedImage loadImages(File file) {
		BufferedImage originalImage = null;
		try {
			originalImage = ImageIO.read(file);
			} catch (IOException e) {
			
			e.printStackTrace();
		}
		return originalImage;
		
		
		
	}


	/**
	 * 
	 * @param file
	 * @return
	 */

	private static Map<String, BufferedImage> loadImage(File file) {
		Map<String,BufferedImage> bufferedImageMap = new HashMap<String,BufferedImage>();
		BufferedImage originalImage = null;
		try {
			originalImage = ImageIO.read(file);
			bufferedImageMap.put(file.getName(), originalImage);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return bufferedImageMap;
	}



	private static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();
		
	return resizedImage;
    }
	
    private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){
		
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();	
	g.setComposite(AlphaComposite.Src);

	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
	
	return resizedImage;
    }	
}