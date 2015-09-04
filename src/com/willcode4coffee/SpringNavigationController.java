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
		return "/spring/springaopexample";
	}

	public String showspringAopconcepts() {
		return "/spring/springaoppage";
	}

	public String showspringjms() {
		return "/spring/springjmspage";
	}

	public String showspringmongoDb() {
		return "/spring/springmongoDbpage";
	}

	public String showspringpage() {
		return "/spring/springpage";
	}

	public String showspringcore() {
		return "/spring/springcorepage";
	}

	public String showspringorm() {
		return "/spring/springormpage";
	}

	public String showspringjdbc() {
		return "/spring/springjdbcpage";
	}

	public String getSpringpageId() {
		return springpageId;
	}

	public void setSpringpageId(String springpageId) {
		this.springpageId = springpageId;
	}
}
