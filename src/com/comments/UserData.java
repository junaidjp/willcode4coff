package com.comments;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.joda.time.DateTime;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

   private static final long serialVersionUID = 1L;

   private String comments;
   
   private DateTime date;
   

   public DateTime getDate() {
	return date;
}


public void setDate(DateTime date) {
	this.date = date;
}


public String getComments() {
	return comments;
}


public void setComments(String comments) {
	this.comments = comments;
}


public String getWelcomeMessage(){
      return "Hello " + comments;
   }
}