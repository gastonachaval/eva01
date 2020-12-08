package ar.edu.unlam.pbii.grupo01;

public class ClienteTelefonia extends Cliente {
	
	private Integer codigoDeArea;
	private Integer telefono;

	public ClienteTelefonia(Integer numeroDeCliente, String nombre,Integer codigoDeArea,Integer telefono) {
		super(numeroDeCliente,nombre);
		this.codigoDeArea=codigoDeArea;
		this.telefono=telefono;
	}

	public Integer getCodigoDeArea() {
		return codigoDeArea;
	}

	public Integer getTelefono() {
		return telefono;
	}
	
	
}
