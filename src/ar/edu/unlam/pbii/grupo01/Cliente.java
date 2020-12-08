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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeCliente == null) ? 0 : numeroDeCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		if (numeroDeCliente == null) {
			if (other.numeroDeCliente != null)
				return false;
		} else if (!numeroDeCliente.equals(other.numeroDeCliente))
			return false;
		return true;
	}
	
	

}
