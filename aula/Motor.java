package aula;

public class Motor {
	int potencia;
	String tipo;
	
	public Motor() {
		super();
	}
	
	public Motor(int potencia, String tipo) {
		super();
		this.potencia = potencia;
		this.tipo = tipo;
	}

	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	
}
