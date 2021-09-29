package garagem;

import carros.Carro;

public class Patio {
	public static void main(String[] args) {
		Carro camaro = new Carro();
		camaro.ano = 2007;
		camaro.cor = "Amarelo";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + camaro.ano);
		System.out.println("Cor: " + camaro.cor);
		camaro.ligar();
		camaro.desligar();
	}
}
