package com.willcode4coffee;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "jdonavigationController", eager = true)
@RequestScoped
public class JDONavigationController  implements Serializable {

	@ManagedProperty(value = "#{param.jdoPageId}")
	private String jdoPageId;

	public String getJdoPageId() {
		return jdoPageId;
	}

	public void setJdoPageId(String jdoPageId) {
		this.jdoPageId = jdoPageId;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String showjdomongodb() {
		return "/jdo/jdomongodbpage";
	}

	public String showjdoreaddb() {
		return "/jdo/jdoreaddbpage";
	}

	public String showjdocreateschema() {
		return "/jdo/jdocreateschemapage";
	}

	public String showjdoconcepts() {
		return "/jdo/jdoconceptspage";
	}

	public String showjdowritedb() {
		return "/jdo/jdowritedbpage";
	}

	public String showjdopage() {
		return "/jdo/jdopage";
	}

	
	
	
}
