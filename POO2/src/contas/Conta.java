/**
 * POO2 - Encapsulamento
 * @author Victor Kenji Osaki Figueiredo
 */

package contas;

public class Conta {
	private double saldo;
	private String cliente;
	
	/**
	 * obter o saldo 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Atribuir um valor a variavel saldo 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * obter o nome do cliente
	 * @return
	 */
	public String getCliente() {
		return cliente;
	}
	
	/**
	 * atribuir um valor a variavel cliente
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	//-----
	public Conta() {
		System.out.println("Agencia 0261");
		
		/**
		 * exibir o saldo da conta
		 */
	}
	protected void exibirSaldo(){
		System.out.println("saldo: r$" + saldo);
	}
	
	/**
	 * debitar da conta corrente
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("débito:" + valor);
	}
	/**
	 * creditar um valor na conta
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("deposito:" + valor);
	}
	
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("trnasferencia: R$" + valor);
		
	}

}
