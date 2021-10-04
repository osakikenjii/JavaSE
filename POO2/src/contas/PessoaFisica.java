package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Leandro ramos");
		cc1.setSaldo(10000);
		System.out.println("cliente:" + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println();
		System.out.println("---sacar---");
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println();
		System.out.println("---depositar");
		cc1.depositar(1000);
		cc1.exibirSaldo();
		System.out.println();
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println();

		Conta cc2 = new Conta();
		cc2.setCliente("Sirlene");
		cc2.setSaldo(50000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println();
		System.out.println("---sacar---");
		cc2.sacar(10000);
		cc2.exibirSaldo();
		System.out.println();
		System.out.println("---depositar");
		cc2.depositar(10000);
		cc2.exibirSaldo();
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("Transferencia.");
		System.out.println("");
		cc1.transferir(cc2, 2000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();

		

	}

}
