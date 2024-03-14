package Ejercicio03;

public class Pizza {
	
	private int codigo;
	private String tamayo="";
	private String tipo="";
	private String estado="Pedida";
	
	
	public Pizza(int codigo, String tamayo, String tipo) {
		super();
		
		if (codigo > 0) {
			this.codigo = codigo;
		}
		
		if(!(tamayo==null)
				&& (tamayo.equals("Mediana") || tamayo.equals("Familiar"))) {
			this.tamayo = tamayo;
		}
		
		if(!(tipo==null)
				&& (tipo.equals("Margarita") || tipo.equals("CuatroQuesos") || tipo.equals("Funghi"))) {
			this.tipo = tipo;
		}
	
	}

	

	public Pizza() {
		
	}


	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @return
	 */
	public String getTamayo() {
		return tamayo;
	}


	/**
	 * 
	 * @param tamayo
	 */
	public void setTamayo(String tamayo) {
		if(!(tamayo==null)
				&& (tamayo.equals("Mediana") || tamayo.equals("Familiar"))) {
			this.tamayo = tamayo;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		if(!(tipo==null)
				&& (tipo.equals("Margarita") || tipo.equals("CuatroQuesos") || tipo.equals("Funghi"))) {
			this.tipo = tipo;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		if(estado.equals("Pedida") || estado.equals("Servida")) {
			this.estado = estado;
		}
		
	}


	/**
	 * @return
	 */
	@Override
	public String toString() {
		String cadena="";
		
		cadena += "Codigo: " + this.codigo + "\n";
		cadena += "Tamaño: " + this.tamayo + "\n";
		cadena += "Tipo: " + this.tipo + "\n";
		cadena+= "Estado: " + this.estado + "\n";
		
		return cadena;
		
	}
	
	
	
}
