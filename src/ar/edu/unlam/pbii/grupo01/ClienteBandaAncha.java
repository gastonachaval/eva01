package ar.edu.unlam.pbii.grupo01;

public class ClienteBandaAncha extends Cliente {

	private String Email;

	public ClienteBandaAncha(Integer numeroDeCliente, String nombre, String Email) {
		super(numeroDeCliente, nombre);
		this.Email=Email;
	}

	public String getEMail() {
		return Email;
	}
	
	

}
