package model.entities;

import java.time.LocalDateTime;

public class CarRental { //aluguel de carro
	private LocalDateTime start;
	private LocalDateTime finish;
	
	// Fazendo as associações cfe o projeto
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	// construtor padrao
	
	public CarRental(){
		
	}
	// construtor com argumentos

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	
	

	
	
	
	
	

}
