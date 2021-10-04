package mundo;

public class Funcaoenxada extends Enxada {

	public static void main(String[] args) {
		System.out.println("---enxada---");
		Enxada enxada = new Enxada();
		enxada.resistencia = 3;
		enxada.textura = "madeira";
		System.out.println("Resistencia: " + enxada.resistencia);
		System.out.println("Textura: " + enxada.textura);
		System.out.println("-------------------------");
		enxada.conquista = false;
		if (enxada.conquista == true) {
			enxada.arar();
			enxada.minerar();
			System.out.println("Voce desbloqueou uma conquista: hora de plantar!!!");
		} else {
			System.out.println("Voce não desbloqueou nenhuma conquista!!!.");
		}
	}
}
