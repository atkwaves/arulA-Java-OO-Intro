public class Conta {

//	Podemos setar valores default (Valor Padr�o). Na classe Conta, podemos dizer que toda vez que uma conta � aberta no ByteBank 
//	o saldo se inicia com 100. 
	double saldo = 100;
	int agencia;
	int numero;
	
//	Iremos estabelecer uma rela��o entre "Conta" e "Cliente", ou seja, toda Conta faz uma refer�ncia a um Cliente.
//	N�o � mais interessante para o nosso projeto que o atributo titular seja uma String, e sim que fa�a refer�ncia 
//	a um cliente espec�fico. 
	//String titular;
	
//	Queremos que o atributo titular n�o seja uma String, mas sim, uma refer�ncia para um Objeto do tipo Cliente. 
//	Alteraremos o Tipo do Atributo "titular" para ser do Tipo Cliente. Queremos que o atributo titular fa�a uma 
//	refer�ncia a um "Cliente" espec�fico, ou seja, iremos fazer uma associa��o entre Objetos. 
	Cliente titular;
	
//	Podemos fazer com o que toda a vez que o new � acionado para uma Conta, temos um novo Cliente. Ou seja, toda 
//	Conta j� se associa a um Cliente, com isso, n�o nos preocupar�amos com o null neste caso em particular.
//	No nosso projeto n�o � uma op��o muito interessante, pois toda a conta tem de ser associada � um cliente novo, 
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