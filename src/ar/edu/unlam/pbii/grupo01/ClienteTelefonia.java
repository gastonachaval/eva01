package ar.edu.unlam.pbii.grupo01;

public class ClienteTelefonia extends Cliente {
	
	private String codigoDeArea;
	private String telefono;

	public ClienteTelefonia(Integer numeroDeCliente, String nombre,String codigoDeArea,String telefono) {
		super(numeroDeCliente,nombre);
		this.codigoDeArea=codigoDeArea;
		this.telefono=telefono;
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	public String getTelefono() {
		return telefono;
	}
	
	
}
