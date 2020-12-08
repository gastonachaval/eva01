package ar.edu.unlam.pbii.grupo01;

public class ClienteCable extends Cliente {

	private String codigoDecodificador;
	private Premium premium;

	public ClienteCable(Integer numeroDeCliente, String nombre,String codigoDecodificador) {
		super(numeroDeCliente, nombre);
		this.codigoDecodificador=codigoDecodificador;
		this.premium=Premium.NADA;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public void setPremium(Premium enu) {
		this.premium =Premium.FUTBOL;
	}
	
	
	
	

}
