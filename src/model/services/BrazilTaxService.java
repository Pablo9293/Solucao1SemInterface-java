package model.services;

public class BrazilTaxService implements TaxService { // implementa a interface TaxService
	public double tax(double amount) { // criando o argumento cfe o projeto
		if(amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
		
		
	}

}
