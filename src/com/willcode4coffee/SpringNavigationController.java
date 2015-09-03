package com.willcode4coffee;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "springnavigationController", eager = true)
@RequestScoped
public class SpringNavigationController  implements Serializable {

	@ManagedProperty(value = "#{param.springpageId}")
	private String springpageId;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
public String showspringaopexample() { 
		return "springaopexample";
	}
	

public String showPage() {

	if (springpageId == null) {
		return "home";

	} else if (springpageId.equals("showspringaopexample")) {
		return "springaopexample";
	} 

	
	else {
		return "home";
	}
}


public String getSpringpageId() {
	return springpageId;
}


public void setSpringpageId(String springpageId) {
	this.springpageId = springpageId;
}

}
