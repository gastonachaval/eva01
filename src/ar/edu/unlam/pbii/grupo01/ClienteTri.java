package ar.edu.unlam.pbii.grupo01;

public class ClienteTri extends Cliente {

	private String codigoDeArea;
	private String telefono;
	private String codigoDecodificador;
	private String EMail;

	public ClienteTri(Integer numeroDeCliente, String nombre, String codigoDeArea, String telefono,
			String codigoDecodificador, String EMail) {
		super(numeroDeCliente, nombre);
		this.codigoDeArea=codigoDeArea;
		this.telefono=telefono;
		this.codigoDecodificador=codigoDecodificador;
		this.EMail=EMail;
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public String getEMail() {
		return EMail;
	}
	

}
