package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		System.out.println("__________________________________");
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "branco";
		boeing777.envergadura = 64.8;
		boeing777.tremPouso = true;
		System.out.println("avião: boeing 777");
		System.out.println("ano:" + boeing777.ano);
		System.out.println("cor:" + boeing777.cor);
		System.out.println("envergadura:" + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();

		System.out.println("__________________________________");
		Aviao Airbus3000 = new Aviao();
		Airbus3000.ano = 2021;
		Airbus3000.cor = "branco";
		Airbus3000.envergadura = 78.8;
		System.out.println("avião: Airbus3000 ");
		System.out.println("ano:" + Airbus3000.ano);
		System.out.println("cor:" + Airbus3000.cor);
		System.out.println("envergadura:" + Airbus3000.envergadura);
		Airbus3000.ligar();
		Airbus3000.acelerar();
		Airbus3000.aterrizar();
		if (boeing777.tremPouso == true) {
			boeing777.aterrizar();
		}
	}
}
