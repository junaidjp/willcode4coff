package com.willcode4coffee;


import org.apache.commons.lang.StringUtils;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;




import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Map;


@ManagedBean
@RequestScoped
public class FileBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UploadedFile file;
	private StreamedContent userPic;
	private StreamedContent downloadFile;
	private StreamedContent downloadFile2;
	
	
	private String id;

	private StreamedContent downloadContentProperty;


    public String getId() {
		return id;
	}







	public void setId(String id) {
		this.id = id;
	}







	public StreamedContent getDownloadFile2() {
		return downloadFile2;
	}







	public void setDownloadFile2(StreamedContent downloadFile2) {
		this.downloadFile2 = downloadFile2;
	}







	public void setUserPic(StreamedContent userPic) {
	this.userPic = userPic;
}


   
	
    

    public void downloadAction(String id) {
    	  try {
    		  
    		  Map<String,String> params =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
    		  String tutorialType = params.get("filename");
    		  System.out.println("The tutorial Type is "  + tutorialType);
    		  if(!StringUtils.isBlank(tutorialType)) {
    		  InputStream stream = new FileInputStream("/learning/"+tutorialType+".zip");
    		  this.setDownloadFile2(new DefaultStreamedContent(stream, "application/zip", tutorialType+".zip"));
    		  }
    	  } catch (Exception e) {
    	    e.printStackTrace();
    	  }
    	}

    	
 public FileBean() throws FileNotFoundException {
	 
	 
	 try {
		  
		  Map<String,String> params =  FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		  String tutorialType = params.get("filename");
		  System.out.println("The tutorial Type is "  + tutorialType);
		  if(!StringUtils.isBlank(tutorialType)) {
		  InputStream stream = new FileInputStream("/learning/"+tutorialType+".zip");
		  this.setDownloadFile2(new DefaultStreamedContent(stream, "application/zip", tutorialType+".zip"));
		  }
	  } catch (Exception e) {
	    e.printStackTrace();
	  }
	}
	 
	 
       
    	//InputStream stream = new FileInputStream("/learning/Spring.pdf");
    	//downloadFile = new DefaultStreamedContent(stream, "application/pdf", "PFSample.pdf");
    //}

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

  

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        MessageUtil.addInfoMessage("upload.successful", file.getFileName() + " is uploaded.");
    }

    public StreamedContent getDownloadFile() {
        return downloadFile2;
    }

    





	public StreamedContent getUserPic() {
		
		  InputStream stream = this.getClass().
				   getResourceAsStream("sample_report.pdf");
				    userPic = new DefaultStreamedContent(stream,
				   "application/pdf", "sample_report.pdf");
				    return userPic;
		
		
		
	}
    
    
    
	
	public void setDownloadContentProperty(StreamedContent downloadContentProperty) {
		  this.downloadContentProperty = downloadContentProperty;
		}

		public StreamedContent getDownloadContentProperty() {
		  return downloadContentProperty;
		}
	
	
	

    
    
    
}