package aula;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Branco", "308", new Motor(167,"THP"));
		
		carro.liga();
		
		if(carro.isLigado())
		{
			System.out.printf("Carro está ligado  ");
		}
		
		System.out.printf("Carro em velocidade  "+ carro.getVelocidadeAtual());
		
		carro.acelera(61);
		System.out.printf("\nCarro em velocidade " +carro.getVelocidadeAtual());
		
		System.out.printf("\n Velocidade "+ carro.getVelocidadeAtual() + " Marcha: "+ carro.getMarcha());
		
		

	}

}
