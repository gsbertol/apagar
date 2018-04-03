package aula;

public class Carro {
	String cor;
	String modelo;
	int posMarcha;
	double velocidadeAtual;
	double velocidadeMaxima;
	boolean isLigado;
	Motor motor;
	
	public Carro()
	{
		this.motor = new Motor(170,"THP"); 		
	}
		
	
	public Carro(String cor, String modelo, Motor motor) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.motor = motor;
		this.posMarcha = 0;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public int getPosMarcha() {
		return posMarcha;
	}


	public void setPosMarcha(int posMarcha) {
		this.posMarcha = posMarcha;
	}


	public boolean isLigado() {
		return isLigado;
	}


	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}


	public void liga()
	{
		this.isLigado = true;
		this.velocidadeAtual = 0;
		this.velocidadeMaxima = 300;
	}
	
	public void acelera(double quantidade )
	{
		this.velocidadeAtual += quantidade;
	}
	
	
	
	
	public int getMarcha()
	{
		if(this.velocidadeAtual < 0 )
			return -1;
		else if(this.velocidadeAtual >= 0 &&  this.velocidadeAtual <40 )
			return 1;
		else if(this.velocidadeAtual > 40 &&  this.velocidadeAtual <=60 )
			return 2;
		else 
			return 3;
				
	}
	
}
