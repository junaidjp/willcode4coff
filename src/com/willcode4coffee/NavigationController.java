package com.willcode4coffee;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;

	public String showspringAopconcepts() { 
		return "springaoppage";
	}
	public String showspringjms() { 
		return "springjmspage";
	}
	
	
	public String showspringmongoDb() {
		return "springmongoDbpage";
	}

	public String showjdomongodb() {
		return "jdomongodbpage";
	}

	public String showjdoreaddb() {
		return "jdoreaddbpage";
	}

	public String showjdocreateschema() {
		return "jdocreateschemapage";
	}

	public String showjdoconcepts() {
		return "jdoconceptspage";
	}

	public String showjdowritedb() {
		return "jdowritedbpage";
	}

	public String showjdopage() {
		return "jdopage";
	}

	public String showspringorm() {
		return "springormpage";
	}

	public String showspringjdbc() {
		return "springjdbcpage";
	}

	public String showspringcore() {
		return "springcorepage";
	}

	public String showjavaPage() {
		return "javapage";
	}

	public String showspringpage() {
		return "springpage";
	}

	public String showHashMapListPage() {
		return "hashmappage";
	}

	public String showVectorPage() {
		return "vectorpage";
	}

	public String showArrayListPage() {
		return "arraylistpage";
	}

	public String showcollectionsPage() {
		return "collectionspage";
	}

	public String moveToHomePage() {
		return "home";
	}

	public String showPage() {

		if (pageId == null) {
			return "home";

		} else if (pageId.equals("showjavaPage")) {
			return "javapage";
		} else if (pageId.equals("showcollectionsPage")) {
			return "collectionspage";
		} else if (pageId.equals("showArrayListPage")) {
			return "arraylistpage";
		} else if (pageId.equals("showVectorsPage")) {
			return "vectorpage";
		} else if (pageId.equals("showHashMapListPage")) {
			return "hashmappage";
		} else if (pageId.equals("showSpringpage")) {
			return "springpage";
		} else if (pageId.equals("showspringjdbc")) {
			return "springjdbcpage";
		} else if (pageId.equals("showspringorm")) {
			return "springormpage";
		}

		else if (pageId.equals("showjdopage")) {
			return "jdopage";
		} else if (pageId.equals("showjdoconcepts")) {
			return "jdoconceptspage";
		}

		else if (pageId.equals("showjdocreateschema")) {
			return "jdocreateschemapage";
		} else if (pageId.equals("showjdowritedb")) {
			return "jdowritedbpage";
		} else if (pageId.equals("showjdoreaddb")) {
				return "jdoreaddbpage";
		} else if (pageId.equals("showspringmongoDb")) {

			return "springmongoDbpage";
		}
		else if (pageId.equals("showspringjms")) { 
			return "springjmspage";
		}
		else if (pageId.equals("showspringAopconcepts")) { 
			return "springaoppage";
		}

		
		else {
			return "home";
		}
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
}
