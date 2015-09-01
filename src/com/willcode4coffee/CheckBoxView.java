package com.willcode4coffee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class CheckBoxView {
	private String[] selectedCities;   
    private List<String> cities;
     
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("San Francisco");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
        cities.add("Sao Paulo");
        cities.add("Amsterdam");
    }
 
    public String[] getSelectedCities() {
        return selectedCities;
    }
 
    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
 
    public List<String> getCities() {
        return cities;
    } 
    
    
    public void submitTechnologies() { 
		if (selectedCities.length > 0) {
			for (int i = 0; i < selectedCities.length; i++) {
				System.out.println(selectedCities[i]);
			}
		}
    }
    
    
}