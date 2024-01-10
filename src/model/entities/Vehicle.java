//solucao sem Interface
package model.entities;

public class Vehicle {
	private String model;
	
	//Construtor padrao
	
	public Vehicle() {
	}
	// construtor com argumentos

	public Vehicle(String model) {
		
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
