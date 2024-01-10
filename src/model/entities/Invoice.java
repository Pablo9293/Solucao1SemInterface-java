package model.entities;

public class Invoice { // Fatura
	private Double basicPayment; // pagamento basico
	private Double tax; // imposto
	
	//construtor padrao
	public Invoice() {
		
	}
	// Construtor com argumentos

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getTotalPayment() { //Dado calculado
		return getBasicPayment() + getTax();
	}
	
	

}
