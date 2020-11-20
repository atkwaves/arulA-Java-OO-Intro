public class TestaBanco {
	
	public static void main(String[] args) {
		
//	Criaremos uma referência para um "Cliente" que chamaremos de paulo. Vamos popular (setar atributos) este Objeto, 
//	criando seus Atributos. A referência para este cliente está populada com os dados estipulados. 
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222.-22";
		paulo.profissao = "programador";

//	Criaremos a conta do cliente referido, e depositaremos um valor de 100 reais. 
//	Agora temos uma classe Conta e outra Cliente. Queremos que o atributo titular não seja uma String, mas sim, uma 
//	referência para um Objeto do tipo Cliente. Em nossa classe Conta, alteraremos o tipo do Atributo titular para 
//	ser do Tipo Cliente.
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);

//	Queremos que o atributo titular faça uma referência a um cliente específico, ou seja, iremos fazer uma associa-
//	ção entre objetos.
		contaDoPaulo.titular = paulo;
		
//	Ao executarmos a aplicação, veremos que será impresso o resultado Paulo Silveira.
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular.cpf);
		System.out.println(contaDoPaulo.titular.profissao);
		
//	Para testarmos o comportamento no programa, tentaremos imprimir apenas o titular. Ao executarmos a aplicação 
//	veremos que o resultado será uma espécie de Id (Cliente@5ca881b5). Que possui o mesmo valor que a variável 
//	paulo, afinal, trata-se da referência para um mesmo objeto.
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);

	}
}