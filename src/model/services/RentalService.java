package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private double pricePerDay;

	// composicao de objetos cfe o projeto

	private TaxService taxService; // Dependencia com TaxService
	
	//Não uso o construtor padrao para forcar a instanciacao do construtor com argumentos
	

	public RentalService(Double pricePerHour, double pricePerDay, TaxService taxService) {
		//classe rentalservice depende de TaxService
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	public void processInvoice( CarRental carRental) { //Metodo para gerar a fatura a partir da locacao do veiculo
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes(); // encontra a diferenca entre dois instantes
		double hours = minutes/60.0; // Encontra a duracao em fracao de hora
		double basicPayment;
		if(hours <= 12) {
		   basicPayment = pricePerHour * Math.ceil(hours); // Arredonda a fracao de hora pra cima 
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours/24.0); //Pega os dias
		}
		
		double tax = taxService.tax(basicPayment);
		carRental .setInvoice(new Invoice(basicPayment, tax));
		
	}
	

}
