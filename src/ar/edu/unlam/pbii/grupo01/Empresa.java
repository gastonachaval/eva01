package ar.edu.unlam.pbii.grupo01;

import java.util.HashSet;

public class Empresa {

	private String nombre;
	private HashSet<Cliente> clientes;

	public Empresa(String nombre) {
		this.nombre=nombre;
		this.clientes=new HashSet<Cliente>();
	}

	public Boolean agregarCliente(Cliente clienteAAgregar) {
		return clientes.add(clienteAAgregar);
		
	}

	public Integer getCantidadAbonados() {
		return clientes.size();
	}

	public Boolean habilitarPremium(Premium FUTBOL, Cliente clienteAHabilitar) throws NoEsClienteConCableException {
		if (clienteAHabilitar instanceof ClienteCable) {
			((ClienteCable) clienteAHabilitar).setPremium(Premium.FUTBOL);
			return true;
		}
		else {
			throw new NoEsClienteConCableException();
		}
	}

}
