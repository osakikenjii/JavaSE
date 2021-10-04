package mundo;

public class Objeto extends Bloco {
	public static void main(String[] args) {
		Bloco terra = new Bloco();
		terra.resistencia = 12;
		terra.textura = "terra";
		System.out.println("Resistencia: " + terra.resistencia);
		System.out.println("Textura: " + terra.textura);
		terra.construir();
		terra.minerar();
		
		System.out.println();
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println();
		
		Bloco madeira = new Bloco();
		madeira.resistencia = 10;
		madeira.textura = "Madeira";
		System.out.println("Resistencia: " + madeira.resistencia);
		System.out.println("Textura: " + madeira.textura);
		madeira.minerar();
		madeira.construir();
		madeira.craftar();

	}
}
	


