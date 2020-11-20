public class Conta {

//	Podemos setar valores default (Valor Padrão). Na classe Conta, podemos dizer que toda vez que uma conta é aberta no ByteBank 
//	o saldo se inicia com 100. 
	double saldo = 100;
	int agencia;
	int numero;
	
//	Iremos estabelecer uma relação entre "Conta" e "Cliente", ou seja, toda Conta faz uma referência a um Cliente.
//	Não é mais interessante para o nosso projeto que o atributo titular seja uma String, e sim que faça referência 
//	a um cliente específico. 
	//String titular;
	
//	Queremos que o atributo titular não seja uma String, mas sim, uma referência para um Objeto do tipo Cliente. 
//	Alteraremos o Tipo do Atributo "titular" para ser do Tipo Cliente. Queremos que o atributo titular faça uma 
//	referência a um "Cliente" específico, ou seja, iremos fazer uma associação entre Objetos. 
	Cliente titular;
	
//	Podemos fazer com o que toda a vez que o new é acionado para uma Conta, temos um novo Cliente. Ou seja, toda 
//	Conta já se associa a um Cliente, com isso, não nos preocuparíamos com o null neste caso em particular.
//	No nosso projeto não é uma opção muito interessante, pois toda a conta tem de ser associada à um cliente novo, 
//	banindo a possibilidade de um cliente ter duas contas, por exemplo.
	//Cliente titular = new Cliente;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}