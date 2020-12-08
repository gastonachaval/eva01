package ar.edu.unlam.pbii.grupo01;

public class Cliente {
	private Integer numeroDeCliente;
	private String nombre;

	public Cliente(Integer numeroDeCliente, String nombre) {
		this.numeroDeCliente = numeroDeCliente;
		this.nombre = nombre;

	}

	public Integer getNumeroDeCliente() {
		return numeroDeCliente;
	}

	public String getNombre() {
		return nombre;
	}

}
